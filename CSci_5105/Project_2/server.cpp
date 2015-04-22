
#include <sys/types.h>
#include <sys/socket.h>
#include <sys/ioctl.h>
#include <netinet/in.h>
#include <net/if.h>
#include <arpa/inet.h>
#include <unistd.h>
#include <sys/uio.h>
#if defined(__sun) && defined(__SVR4)
#include <sys/sockio.h>
#endif
#include <errno.h>

#include <cstring>
#include <cstdio>
#include <pthread.h>

#include <iostream>
#include <string>
#include <sstream>
#include <list>
#include <map>
#include <queue>

#include "msg_header.h"
using namespace std;


// ********* Declaration begin *********
typedef void * StartFunc(void *);
// ********* Declaration end *********


// ********* Global variables begin *********
int co_flag = 0; // mark current instance as coordinator
char co_ip[16];
int co_port;
#define REQUEST_SUCCESS 1
#define REQUEST_FAIL 0
// ********* Global variables end *********


//  ********* Common utility functions begin *********
inline unsigned int min(unsigned int a, unsigned int b)
{
  return (a > b ? b : a);
}

inline unsigned int max(unsigned int a, unsigned int b)
{
  return (a > b ? a : b);
}

inline void print_buf(char *buf, int len)
{
  printf(">>PRINT BUFFER (%d bytes){\n", len);
  for(int i=0; i<len; i++)
  {
    printf(" %#x", buf[i]);
    if((i%8) == 7)
      printf("\n");
  }
  cout << "}" << endl;
}
//  ********* Common utility functions end *********


// Module articles data structure begin
struct Article {
  unsigned int Parent;
  list<unsigned int> ChildList;
  string Content;
};
// ID=0 is the Root of top level Articles
pthread_mutex_t article_list_lock;
map<unsigned int, Article> ArticleList;
void initArticleList()
{
  pthread_mutex_init(&article_list_lock, NULL);
  pthread_mutex_lock(&article_list_lock);
  ArticleList.clear();
  ArticleList.insert(pair<unsigned int, Article>(0, Article()));
  ArticleList[0].Parent = 0;
  pthread_mutex_unlock(&article_list_lock);
}

void replyArticle(unsigned int id, unsigned int parent, string content)
{
  pthread_mutex_lock(&article_list_lock);
  // check existence of id
  if (ArticleList.find(id) != ArticleList.end()) { // duplicated Article ID
    pthread_mutex_unlock(&article_list_lock);
    cout << "ERROR! addArticle() Article ID already exist" << endl;
    return;
  }
  if (ArticleList.find(parent) == ArticleList.end()) { // reply to an Article ID which doesn't exist
    pthread_mutex_unlock(&article_list_lock);
    cout << "ERROR! addArticle() parent ID doesn't exist" << endl;
    return;
  }
  ArticleList.insert(pair<unsigned int, Article>(id, Article()));
  ArticleList[id].Parent = parent;
  ArticleList[id].Content = content;
  // update parent's child list
  ArticleList[parent].ChildList.push_back(id);
  pthread_mutex_unlock(&article_list_lock);
}

void postArticle(unsigned int id, string content)
{
  replyArticle(id, 0, content);
}

void displayChildArticles(unsigned int parent, unsigned int level_of_indent)
{
  //supposely lock already acquired
  for(list<unsigned int>::iterator it = ArticleList[parent].ChildList.begin(); it != ArticleList[parent].ChildList.end(); ++it)
  {
    for(unsigned int i = level_of_indent; i > 0; --i)
      cout << "\t";
    cout << *it << "  A reply to Article " << parent << ": " << ArticleList[*it].Content << endl;
    displayChildArticles(*it, level_of_indent + 1);
  }
}

void displayArticles()
{
  pthread_mutex_lock(&article_list_lock);
  for(list<unsigned int>::iterator it = ArticleList[0].ChildList.begin(); it != ArticleList[0].ChildList.end(); ++it)
  {
    cout << *it  << ": " << ArticleList[*it].Content << endl;
    displayChildArticles(*it, 1);
  }
  pthread_mutex_unlock(&article_list_lock);
}

int article_index;
unsigned int print_article_start;
unsigned int print_article_end;
bool reached_end;

void printChildArticles(unsigned int parent, unsigned int level_of_indent, stringstream &sout)
{
  for(list<unsigned int>::iterator it = ArticleList[parent].ChildList.begin(); it != ArticleList[parent].ChildList.end(); ++it)
  {
    if(reached_end)
      break;
    if(++article_index < print_article_start)
      ;
    else if(article_index <= print_article_end)
    {
      for(unsigned int i = level_of_indent; i > 0; --i)
        sout << "\t";
      sout << *it << "  A reply to Article " << parent << ": " << ArticleList[*it].Content.substr(0, 10) << "..." << endl;
    }
    else
    {
      reached_end = true;
      break;
    }
    printChildArticles(*it, level_of_indent + 1, sout);
  }
}

int printPage(char *buf, int len, unsigned int page_no)
{
  //len is not checked here
  pthread_mutex_lock(&article_list_lock);
  int totalNumOfArticles = ArticleList.size()-1;
  printf("totalNumOfArticles %d\n", totalNumOfArticles);
  int totalNumOfPages = (totalNumOfArticles / DISPLAY_ARTICLES_PER_PAGE) + 1;
  int print_page_no = min(totalNumOfPages, max(1,page_no));
  print_article_start = ((print_page_no-1) * DISPLAY_ARTICLES_PER_PAGE) + 1;
  print_article_end = min(print_article_start + DISPLAY_ARTICLES_PER_PAGE - 1, totalNumOfArticles);
  printf("print from article %d to article %d\n", print_article_start, print_article_end);
  article_index = 0;
  reached_end = false;
  stringstream sout;
  sout << "---------Bulletin Board--------\n"
       << "(Page " << print_page_no << " of " << totalNumOfPages << ")\n\n";
  for(list<unsigned int>::iterator it = ArticleList[0].ChildList.begin(); (it != ArticleList[0].ChildList.end() && !reached_end); ++it)
  {
    if(++article_index < print_article_start)
      ;
    else if(article_index <= print_article_end)
      sout << *it  << ": " << ArticleList[*it].Content.substr(0, 10) << "..." << endl;
    else
    {
      reached_end = true;
      break;
    }
    printChildArticles(*it, 1, sout);
  }
  pthread_mutex_unlock(&article_list_lock);
  int printed_len = min(len, sout.str().length());
  memcpy(buf, sout.str().c_str(), printed_len);
  return printed_len;
}

void testArticles()
{
  initArticleList();
  postArticle(1, string("Article_1"));
  postArticle(2, string("Article_2"));
  replyArticle(3, 2, string("Article_3"));
  replyArticle(4, 2, string("Article_4"));
  replyArticle(5, 4, string("Article_5"));
  replyArticle(6, 3, string("Article_6"));
  postArticle(7, string("Article_7"));
  displayArticles();
}
// Module articles data structure end


// Module common tcp server begin
typedef struct {
  //int client_sock;
  char client_ip[16];
  int client_port;
} client_info;
typedef map<int, client_info> client_list_t;

#define LISTENQ (5) // Backlog for listen()

void *tcpServerDaemonThread(void *args);

typedef struct {
  int listenSock;
  client_list_t *cList;
  pthread_mutex_t *cLock;
  StartFunc *tEntry;
} arg_tcp_daemon;

int setupTcpServer(char *my_ip, int *my_port, client_list_t *client_list, pthread_mutex_t *clt_lst_lock, StartFunc *workerThreadFunc)
{
  int servSock = socket(AF_INET, SOCK_STREAM, 0);
  struct sockaddr_in serverAddr;
  int servAddrSize = sizeof(serverAddr);
  bzero( (char *)&serverAddr, servAddrSize);
  serverAddr.sin_family = AF_INET;
  serverAddr.sin_port = htons(0);
  serverAddr.sin_addr.s_addr = htonl(INADDR_ANY);

  int ret_code = bind(servSock, (struct sockaddr *)&serverAddr, servAddrSize);
  if (ret_code < 0)
  {
    cout << "ERROR! setupTcpServer bind() failed" << endl;
    close(servSock);
    return -1;
  }

  ret_code = listen(servSock, LISTENQ);
  if (ret_code < 0)
  {
    cout << "ERROR! setupTcpServer listen() failed" << endl;
    close(servSock);
    return -1;
  }

  pthread_t threadID;
  pthread_attr_t attr;
  pthread_attr_init(&attr);
  pthread_attr_setdetachstate(&attr, PTHREAD_CREATE_DETACHED);
  arg_tcp_daemon *args = new(arg_tcp_daemon);
  if(args == 0)
  {
    cout << "ERROR! setupTcpServer new arg_tcp_daemon failed" << endl;
    return -1;
  }
  args->listenSock = servSock;
  args->cList = client_list;
  args->cLock = clt_lst_lock;
  args->tEntry = workerThreadFunc;
  ret_code = pthread_create(&threadID, &attr, (StartFunc *) tcpServerDaemonThread, (void *) args);
  if (ret_code < 0)
  {
    cout << "ERROR! setupTcpServer pthread_create tcpServerDaemonThread failed" << endl;
    close(servSock);
    return -1;
  }

  struct ifreq ifr;
  ifr.ifr_addr.sa_family = AF_INET;
  strncpy(ifr.ifr_name, "eth0", IFNAMSIZ-1);
  ioctl(servSock, SIOCGIFADDR, &ifr);
  getsockname(servSock, (struct sockaddr *) &serverAddr, (socklen_t *) &servAddrSize);
  cout << "setupTcpServer listen on " << inet_ntoa(((struct sockaddr_in *)&ifr.ifr_addr)->sin_addr) << ":" << ntohs(serverAddr.sin_port) << endl;
  strcpy(my_ip, inet_ntoa(((struct sockaddr_in *)&ifr.ifr_addr)->sin_addr));
  *my_port = ntohs(serverAddr.sin_port);
  
  return 0;
}

void *tcpServerDaemonThread(void *args)
{
  int servSock, newSock, addrLen, ret_code, on = 1;
  struct sockaddr_in addr;
  client_info newClt;

  arg_tcp_daemon *_args = (arg_tcp_daemon *)args;
  servSock = _args->listenSock;
  client_list_t *_client_list = _args->cList;
  pthread_mutex_t *_clt_lst_lock = _args->cLock;
  StartFunc *tcpServerWorkerThread = _args->tEntry;
  delete _args;
  if((servSock == 0) || (_client_list == NULL) || (tcpServerWorkerThread == NULL))
  {
    cout << "ERROR! tcpServerDaemonThread invalid input args" << endl;
    return NULL;
  }

  int disconnect = 0;
  while(!disconnect)
  {
    addrLen = sizeof(struct sockaddr);
    newSock = accept(servSock, (struct sockaddr *) &addr, (socklen_t *) &addrLen);
    if (newSock < 0)
    {
      cout << "ERROR! tcpServerDaemonThread accept() failed" << endl;
      break;
    }

    //ret_code = setsockopt(newSock, SOL_SOCKET, SO_KEEPALIVE, &on, sizeof(int));
    //if (ret_code < 0)
    //{
    //  cout << "tcpServerDaemonThread setsockopt() failed" << endl;
    //  break;
    //}

    cout << "tcpServerDaemonThread accepted a new client connection from " << inet_ntoa(addr.sin_addr) << ":" << ntohs(addr.sin_port) << endl;
    strcpy(newClt.client_ip, inet_ntoa(addr.sin_addr));
    newClt.client_port =  ntohs(addr.sin_port);
    pthread_mutex_lock(_clt_lst_lock);
    _client_list->insert(pair<int, client_info>(newSock, newClt));
    pthread_mutex_unlock(_clt_lst_lock);

    pthread_t threadID;
    pthread_attr_t attr;
    pthread_attr_init(&attr);
    pthread_attr_setdetachstate(&attr, PTHREAD_CREATE_DETACHED);
    ret_code = pthread_create(&threadID, &attr, (StartFunc *) tcpServerWorkerThread, (void *) &newSock);
    if (ret_code < 0)
    {
      cout << "ERROR! tcpServerDaemonThread() pthread_create failed" << endl;
      disconnect = 1;
    }
  }

}
// Module common tcp server end


// Module  Coordinator logic begin
client_list_t connected_server_list;
pthread_mutex_t svr_lst_lock;
pthread_mutex_t write_req_pipe_lock;
pthread_mutex_t write_rsp_pipe_lock;
pthread_mutex_t article_id_lock;
pthread_mutex_t update_request_queue_lock;
int write_req_pipe[2], write_rsp_pipe[2];
char notification = 0;

typedef struct {
  int msg_type; 
  int servSock;
  //unsigned char uniq_id;
  //unsigned int new_article_id;
  //unsigned int parent;
  //bool isGoodFormat;
  char *write_msg;
  unsigned short write_msg_len;
} update_request;
queue<update_request> update_request_queue;

unsigned int getNextArticleID()
{
  static unsigned int nextID = 0;
  unsigned int _nextID;
  pthread_mutex_lock(&article_id_lock);
  _nextID = ++nextID;
  pthread_mutex_unlock(&article_id_lock);
  return _nextID;
}

void enqueueUpdateRequest(int msg_type, int server_sock, char *buf, int len)
{
  int _write_msg_len = sizeof(unsigned int) /*article ID*/ + len;
  char *new_buf = new char(_write_msg_len);
  update_request newreq;
  if(new_buf == NULL)
  {
    cout << "ERROR! enqueuePostRequest new failed" << endl;
    //tbd handle this
    return;
  }
  newreq.msg_type = msg_type;
  newreq.servSock = server_sock;

  new_buf[0] = (char)msg_type;
  // article_id field is left blank
  //unsigned int nextID = getNextArticleID(); //todo move this to dequeue
  //newreq.new_article_id = nextID;
  memcpy(&new_buf[5], buf+1, len-1);
  newreq.write_msg = new_buf;
  newreq.write_msg_len = _write_msg_len;
  pthread_mutex_lock(&update_request_queue_lock);
  update_request_queue.push(newreq);
  pthread_mutex_unlock(&update_request_queue_lock);
  //todo print more information
  pthread_mutex_lock(&write_req_pipe_lock);
  write(write_req_pipe[1], &notification, sizeof(notification));
  pthread_mutex_unlock(&write_req_pipe_lock);
  cout << "enqueueUpdateRequest() enqueued a new request" << endl;
}

void *coordinator_worker_thread(void *args)
{
  char buf[1024];
  int len;
  int server_sock = *((int *)args);
  int disconnect = 0;
  int msg_type;
  int msg_pos;
  unsigned char uniq_msg_id;
  unsigned short article_len;
  unsigned int reply_to;

  while(!disconnect)
  {
    // only read here, write in another all-server-shared thread
    len = read(server_sock, buf, sizeof(buf));
    if(len <= 0)
    {
      cout << "coordinator_worker_thread read server_sock failed, remove server "
           << connected_server_list[server_sock].client_ip
           << ":" << connected_server_list[server_sock].client_port
           << " from server list" << endl;
      pthread_mutex_lock(&svr_lst_lock);
      connected_server_list.erase(server_sock);
      pthread_mutex_unlock(&svr_lst_lock);
      disconnect = 1;
      continue;
    }
    msg_pos = 0;
    msg_type = buf[msg_pos++];
    switch(msg_type)
    {
      case POST_REQ:
        if(len < MIN_POST_REQ_LEN)
        {
          cout << "ERROR! coordinator_worker_thread received faulty POST_REQ msg" << endl;
          print_buf(buf, len);
          print_buf(buf, len);
          // tbd reply Server with msg_invalid_error
          continue;
        }
        //uniq_msg_id = buf[msg_pos++];
        article_len = buf[msg_pos++];
        article_len += ((buf[msg_pos++]<<8) & 0xff00);
        if((msg_pos+article_len) != len)
        {
          cout << "ERROR! coordinator_worker_thread POST_REQ msg length doesn't match" << endl;
          print_buf(buf, len);
          // tbd reply Server with msg_invalid_error
          continue;
        }
	
        enqueueUpdateRequest(msg_type, server_sock, buf, len);
        break;
      case REPLY_REQ:
        if(len < MIN_REPLY_REQ_LEN)
        {
          cout << "ERROR! coordinator_worker_thread received faulty POST_REQ msg" << endl;
          print_buf(buf, len);
          // tbd reply Server with msg_invalid_error
          continue;
        }
        //uniq_msg_id = buf[msg_pos++];
        reply_to = buf[msg_pos++];
        reply_to += ((buf[msg_pos++]<<8) & 0xff00);
        reply_to += ((buf[msg_pos++]<<16) & 0xff0000);
        reply_to += ((buf[msg_pos++]<<24) & 0xff000000);
        article_len = buf[msg_pos++];
        article_len += ((buf[msg_pos++]<<8) & 0xff00);
        if((msg_pos+article_len) != len)
        {
          cout << "ERROR! coordinator_worker_thread POST_REQ msg length doesn't match" << endl;
          print_buf(buf, len);
          // tbd reply Server with msg_invalid_error
          continue;
        }
        enqueueUpdateRequest(msg_type, server_sock, buf, len);
        break;
      case POST_ACK:
      case REPLY_ACK:
        len = write(write_rsp_pipe[1], &notification, sizeof(notification));
        if(len != sizeof(notification))
        {
          cout << "ERROR! coordinator_worker_thread write write_rsp_pipe failed ret=" << len << endl;
        }
        break;
      default:
        cout << "ERROR! coordinator_worker_thread received unknown msg" << endl;
        print_buf(buf, len);
        // tbd reply Server with msg_invalid_error
        break;
    }
  }
}

void *globalUpdateThread(void *args)
{
  char buf[1024];
  int len;
  int disconnect = 0;
  char result_code = REQUEST_SUCCESS;
  update_request req;
  while(!disconnect)
  {
    len = read(write_req_pipe[0], buf, sizeof(notification));
    if(len < 0)
    {
      cout << "ERROR! globalUpdateThread() read write_req_pipe failed!" << endl;
      //tbd handle this
      continue;
    }
    pthread_mutex_lock(&update_request_queue_lock);
    req = update_request_queue.front();
    update_request_queue.pop();
    pthread_mutex_unlock(&update_request_queue_lock); 
    unsigned int next_id = getNextArticleID();
    // fill in the article id field
    req.write_msg[1] = next_id & 0xff;
    req.write_msg[2] = (next_id>>8) & 0xff;
    req.write_msg[3] = (next_id>>16) & 0xff;
    req.write_msg[4] = (next_id>>24) & 0xff;
    int num_bkup_srvr = 0;
    // tbd consider server failure case, connected serverlist may change
    pthread_mutex_lock(&svr_lst_lock);
    for(map<int, client_info>::iterator it = connected_server_list.begin(); it != connected_server_list.end(); ++it)
    {
      len = write(it->first, req.write_msg, req.write_msg_len);
      if(len != req.write_msg_len)
      {
        cout << "ERROR! globalUpdateThread() write tr client "
             << it->second.client_ip
             << ":" << it->second.client_port
             << " return" << len;
        //tbd handle this
        result_code = REQUEST_FAIL;
        continue;
      }
      num_bkup_srvr++;
    }
    pthread_mutex_unlock(&svr_lst_lock);

    // now waiting for acknowledge
    int expect_rsp;
    if(req.msg_type == POST_REQ)
      expect_rsp = POST_ACK;
    else
      expect_rsp = REPLY_ACK;
    int num_rsp_rcvd = 0;
    while(num_rsp_rcvd != num_bkup_srvr)
    {
      //tbd check ack article number that
      len = read(write_rsp_pipe[0], buf, sizeof(notification));
      if(len < 0)
      {
        cout << "ERROR! globalUpdateThread() read write_rsp_pipe failed!" << endl;
        //tbd handle this
        continue;
      }
      //tbd check each responsed server id
      num_rsp_rcvd++;
    }
    buf[0] = expect_rsp;
    buf[1] = result_code;
    write(req.servSock, buf, 2);
  }
}

int startCoordinator(char *my_ip, int *my_port)
{
  pthread_mutex_init(&svr_lst_lock, NULL);
  pthread_mutex_init(&article_id_lock, NULL);
  pthread_mutex_init(&write_req_pipe_lock, NULL);
  pthread_mutex_init(&write_rsp_pipe_lock, NULL);
  pthread_mutex_init(&update_request_queue_lock, NULL);
  if(pipe(write_req_pipe) < 0 || pipe(write_rsp_pipe) < 0)
  {
    cout << "ERROR! startCoordinator() pipe() failed" << endl;
    return -1;
  }
  pthread_t threadID;
  pthread_attr_t attr;
  pthread_attr_init(&attr);
  pthread_attr_setdetachstate(&attr, PTHREAD_CREATE_DETACHED);
  int ret_code = pthread_create(&threadID, &attr, (StartFunc *) globalUpdateThread, NULL);
  if (ret_code < 0)
  {
    cout << "ERROR! startCoordinator pthread_create globalUpdateThread failed" << endl;
    return -1;
  }
  return setupTcpServer(my_ip, my_port, &connected_server_list, &svr_lst_lock, coordinator_worker_thread);
}
// Module Coordinator logic end


// Module Coordinator proxy end
void *coordinatorProxyThread(void *args);
int coSock;
int newClientPfd1[2], newClientPfd2[2];
pthread_mutex_t cp_lock;

int setupCoordinatorProxy(char *coIp, int coPort)
{
  struct sockaddr_in coAddr;

  coSock = socket(AF_INET, SOCK_STREAM, 0);
  bzero( (char *)&coAddr, sizeof(coAddr));
  coAddr.sin_family = AF_INET;
  coAddr.sin_port = htons(coPort);
  coAddr.sin_addr.s_addr = inet_addr(coIp);

  if(connect(coSock, (struct sockaddr *)&coAddr, sizeof(coAddr)) == -1)
  {
    cout << "ERROR! registerCoordinator() connect() failed" << endl;
    return -1;
  }
  cout << "Successfully connected to Coordinator @" << coIp << ":" << coPort << endl;

  if(pipe(newClientPfd1) < 0 || pipe(newClientPfd2) < 0)
  {
    cout << "ERROR! setupCoordinatorProxy() pipe() failed" << endl;
    return -1;
  }

  pthread_mutex_init(&cp_lock, NULL);
  pthread_t threadID;
  pthread_attr_t attr;
  pthread_attr_init(&attr);
  pthread_attr_setdetachstate(&attr, PTHREAD_CREATE_DETACHED);
  int ret_code = pthread_create(&threadID, &attr, (StartFunc *) coordinatorProxyThread, (void *) NULL);
  if (ret_code < 0)
  {
    cout << "ERROR! setupCoordinatorProxy pthread_create coordinatorProxyThread failed" << endl;
    close(coSock);
    return -1;
  }

  return 0;
}

void *coordinatorProxyThread(void *args)
{
  int disconnect;
  fd_set fdSocks;
  int selectRes;
  char buf[1024];
  int len;
  int msg_type;
  int msg_pos;
  unsigned int article_id, reply_to_id;
  unsigned int article_len;

  cout << "coordinatorProxyThread started" << endl;
  disconnect = 0;
  while(!disconnect)
  {
    FD_ZERO(&fdSocks);
    FD_SET(coSock ,&fdSocks);
    FD_SET(newClientPfd1[0] ,&fdSocks);

    selectRes = select(FD_SETSIZE,&fdSocks,0,0,NULL);
    if(selectRes < 0)
    {
      cout << "ERROR! coordinatorProxyThread select() failed" << endl;
      continue;
    }
    else if(selectRes == 0)
    {
      cout << "ERROR! coordinatorProxyThread select() return 0" << endl;
      continue;
    }

    if(FD_ISSET(newClientPfd1[0], &fdSocks))
    {
      if((len = read(newClientPfd1[0], buf, sizeof(buf))) > 0)
      {
        // directly forward msg to coordinator
        if (write(coSock, buf, len) != len)
        {
          cout << "ERROR! coordinatorProxyThread write() coSock failed" << endl;
          continue;
        }
      }
      else
      {
        cout << "ERROR! coordinatorProxyThread read() pipe failed" << endl;
        continue;
      }
    }

    if(FD_ISSET(coSock, &fdSocks))
    {
      if((len = read(coSock, buf, sizeof(buf))) > 0)
      {
        msg_pos = 0;
        msg_type = buf[msg_pos++];
        switch(msg_type)
        {
          case POST_REQ:
            if(len < 7)
            {
              cout << "ERROR! coordinatorProxyThread received Post article message too short" << endl;
              continue;
            }
            article_id = buf[msg_pos++];
            article_id += (buf[msg_pos++] << 8);
            article_id += (buf[msg_pos++] << 16);
            article_id += (buf[msg_pos++] << 24);
            article_len = buf[msg_pos++];
            article_len += (buf[msg_pos++] << 8);
            postArticle(article_id, string(&buf[msg_pos], article_len));
            buf[0] = POST_ACK;
            if(write(coSock, buf, 5) != 5)
              cout << "ERROR! coordinatorProxyThread write POST_ACK to Coordinator failed" << endl;
            break;
          case REPLY_REQ:
            if(len < 11)
            {
              cout << "ERROR! coordinatorProxyThread received Reply article message too short" << endl;
              continue;
            }
            article_id = buf[msg_pos++];
            article_id += (buf[msg_pos++] << 8);
            article_id += (buf[msg_pos++] << 16);
            article_id += (buf[msg_pos++] << 24);
            reply_to_id = buf[msg_pos++];
            reply_to_id += (buf[msg_pos++] << 8);
            reply_to_id += (buf[msg_pos++] << 16);
            reply_to_id += (buf[msg_pos++] << 24);
            article_len = buf[msg_pos++];
            article_len += (buf[msg_pos++] << 8);
            replyArticle(article_id, reply_to_id, string(&buf[msg_pos], article_len));
            buf[0] = REPLY_ACK;
            if(write(coSock, buf, 5) != 5)
              cout << "ERROR! coordinatorProxyThread write REPLY_ACK to Coordinator failed" << endl;
            break;
          case POST_ACK:
          case REPLY_ACK:
            if(write(newClientPfd2[1], buf, len) != len)
              cout << "ERROR! coordinatorProxyThread write pipe failed" << endl;
            break;
          default:
            cout << "ERROR! coordinatorProxyThread read unknown message from Coordinator msg_type=" << msg_type << endl;
            break;
        }
        if (write(coSock, buf, len) != len)
        {
          cout << "ERROR! coordinatorProxyThread write() coSock failed" << endl;
          continue;
        }
      }
      else
      {
        cout << "ERROR! coordinatorProxyThread read() coSock "
             << coSock << " failed len=" << len << strerror(errno) << endl;
        continue;
      }
    }
  }
}

int addNewArticleGlobal(char *msg, int msg_len, MSGTYPE ack_type)
{
  int ret = 0;
  char buf[1024];
  char result_code;
  pthread_mutex_lock(&cp_lock);
  //tbd check write read return code
  write(newClientPfd1[1], msg, msg_len);
  read(newClientPfd2[0], buf, sizeof(buf));
  if(buf[0] != ack_type)
  {
    cout << "ERROR! addNewArticleGlobal ack != ack_type" << endl;
    ret = -1;
  }
  result_code = buf[1];
  if(result_code != REQUEST_SUCCESS)
  {
    cout << "addNewArticleGlobal failed result_code=" << result_code << endl;
    ret = -1;
  }
  pthread_mutex_unlock(&cp_lock);
  return ret;
}
// Module Coordinator proxy end


// Module Server begin
char server_ip[16];
int server_port;
client_list_t connected_client_list;
pthread_mutex_t clt_lst_lock;

void *perClientServerThread(void *args)
{
  int cliSock = * (int *)args;
  int len;
  char buf[1024];
  int msg_type;
  char ret_code;
  unsigned int page_no;
  unsigned short page_len;

  int disconnect = 0;
  while(!disconnect)
  {
    len = read(cliSock, buf, sizeof(buf));
    if(len <= 0)
    {
      cout << "ERROR! perClientServerThread read failed, remove client "
           << connected_client_list[cliSock].client_ip
           << ":" << connected_client_list[cliSock].client_port
           << endl;
      pthread_mutex_lock(&clt_lst_lock);
      connected_client_list.erase(cliSock);
      pthread_mutex_unlock(&clt_lst_lock);
      disconnect = 1;
    }
    msg_type = buf[0];
    switch(msg_type)
    {
      //tbd check write result
      case POST_REQ:
        cout << "received a post request" << endl;
        ret_code = addNewArticleGlobal(buf, len, POST_ACK);
        buf[0] = POST_ACK;
        if(ret_code != 0)
          buf[1] = REQUEST_FAIL;
        else
          buf[1] = REQUEST_SUCCESS;
        write(cliSock, buf, 2);
        break;
      case REPLY_REQ:
        cout << "received a reply request" << endl;
        addNewArticleGlobal(buf, len, REPLY_ACK);
        buf[0] = REPLY_ACK;
        if(ret_code != 0)
          buf[1] = REQUEST_FAIL;
        else
          buf[1] = REQUEST_SUCCESS;
        write(cliSock, buf, 2);
        break;
      case READ_REQ:
        buf[0] = READ_ACK;
        page_no = buf[1];
        page_no += buf[2]<<8;
        page_no += buf[3]<<16;
        page_no += buf[4]<<24;
        page_len = printPage(&buf[4], sizeof(buf)-5, page_no);
        buf[1] = REQUEST_SUCCESS;
        buf[2] = page_len;
        buf[3] = page_len >> 8;
        write(cliSock, buf, page_len+4);
        break;
      case CHOOSE_REQ:
        buf[0] = CHOOSE_ACK;
        unsigned int article_no;
        article_no = buf[1];
        article_no += (buf[2]<<8);
        article_no += (buf[3]<<16);
        article_no += (buf[4]<<24);
        //printArticle(buf, sizeof(buf), article_no);
        write(cliSock, buf, 1);
        break;
    }
  }
}

int startServer(char *co_ip, int co_port)
{
  int ret;
  ret = setupCoordinatorProxy(co_ip, co_port);
  if(ret != 0)
  {
    cout << "ERROR! setupCoordinatorProxy failed" << endl;
    return -1;
  }
  pthread_mutex_init(&clt_lst_lock, NULL);
  return setupTcpServer(server_ip, &server_port, &connected_client_list, &clt_lst_lock, perClientServerThread);
}
// Module Server end


// ./BBServer  <-- to run as a Coordinator, this will return both a Coordinator's & a Server's ip_addr & port
// ./BBServer <coordinator's ip_addr> <coordinator's port>  <-- to run as a Server
void cmdlineInteraction(void);
int main(int argc, char *argv[])
{
  int ret_code;
  int coSock;

  if(argc == 1)
  {
    co_flag = 1;
    cout << "Starting as a Coordinator ..." << endl;
  }
  else if(argc == 3)
  {
    bzero(co_ip, sizeof(co_ip));
    strncpy(co_ip, argv[1], sizeof(co_ip)-1);
    sscanf(argv[2], "%d", &co_port);
    co_flag = 0;
    cout << "Starting as a Server ..." << endl;
  }
  else
  {
    cout << "usage:" << endl;
    cout << "  ./BBServer  <-- to run as a Coordinator, this will return both a Coordinator's & a Server's ip_addr & port" << endl;
    cout << "  ./BBServer <coordinator's ip_addr> <coordinator's port>  <-- to run as a Server, this will return the Server's ip_addr & port" << endl;
    return 0;
  }

  initArticleList();

  if(co_flag == 1)
  {
    cout << "Starting up Coordinator ..." << endl;
    ret_code = startCoordinator(co_ip, &co_port);
    if(ret_code != 0)
    {
      cout << "Coordinator starting up Failed! exiting ..." << endl;
      return -1;
    }
    else
    {
      cout << "Coordinator starting up Successful! ipaddr=" << co_ip << ", port=" << co_port << endl;
    }
  }

  cout << "Starting up Server ..." << endl;
  ret_code = startServer(co_ip, co_port); // will enter main loop
  if(ret_code != 0)
  {
    cout << "Server starting up Failed! exiting ..." << endl;
    return -1;
  }
  else
  {
    cout << "Server starting up Successful! ipaddr=" << server_ip << ", port=" << server_port << endl;
  }

  cmdlineInteraction();

  return ret_code;
}

void cmdlineInteraction(void)
{
  string cmdline;
  int disconnect = 0;
  while(!disconnect)
  {
    cout << ">>";
    getline(cin, cmdline);

    if(cmdline == "displayArticles")
      displayArticles();
    if(cmdline == "exit")
      disconnect = 1;
  }
}
