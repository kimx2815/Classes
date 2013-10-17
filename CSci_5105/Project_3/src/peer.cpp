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
#include <stdlib.h>
#include <sys/stat.h>
#include <fcntl.h>

#include <cstring>
#include <cstdio>
#include <pthread.h>

#include <iostream>
#include <string>
#include <sstream>
#include <list>
#include <map>
#include <queue>
#include <fstream>
#include <iterator>
#include <float.h>
#include <time.h>
#include <sys/time.h>
#include "header.h"

using namespace std;


// ********* Declaration begin *********
typedef void * StartFunc(void *);
int Register();
typedef struct {
  char ip[16];
  int port;
} ip_port;
int UpdateList();
int Find(const char *filename, int &checksum, map<int,ip_port> &peer_list);
int GetLoad(const char *peer_ip, int peer_port);
double getWClockSeconds(void);
// ********* Declaration end *********


// ********* Global variables begin *********
map<string,int> my_file_list;
pthread_mutex_t lock_my_file_list;

int my_pid;
char my_dir[128];
string latency_matrix_file;
pthread_mutex_t lock_status;
int my_status;
#define INIT 1
#define CONN 2

char server_ip[16];
int server_port;

pthread_mutex_t lock_ts;
int sock_ts, sock_ping;
char ts_ip[16];
int ts_port;
int ts_ping_port;
struct sockaddr_in tsaddr;
struct sockaddr_in ts_pingaddr;

int *latencyMatrix;
int latencyMatrixDimension;
#define FOUND 1
#define FILEDELETED 101
#define CHECKSUMNOTMATCH 102

pthread_mutex_t lock_workload;
int my_workload=0;
#define MAXRETRY 3
#define UPDATELISTINTERVAL 30
// ********* Global variables end *********

//  ********* Common utility functions begin *********
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


// Module common tcp server begin
typedef struct {
  char client_ip[16];
  int client_port;
} client_info;
typedef map<int, client_info> client_list_t;
client_list_t connected_client_list;
pthread_mutex_t clt_lst_lock;

#define LISTENQ (20) // Backlog for listen()

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
  cout << "setupTcpServer listen on " << inet_ntoa(((struct sockaddr_in *)&ifr.ifr_addr)->sin_addr) << " " << ntohs(serverAddr.sin_port) << endl;
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
  if(servSock == 0)
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

    if((_client_list!=NULL) && (_clt_lst_lock!=NULL))
    {
      cout << "tcpServerDaemonThread accepted a new client connection from " << inet_ntoa(addr.sin_addr) << ":" << ntohs(addr.sin_port) << endl;
      strcpy(newClt.client_ip, inet_ntoa(addr.sin_addr));
      newClt.client_port =  ntohs(addr.sin_port);
      pthread_mutex_lock(_clt_lst_lock);
      _client_list->insert(pair<int, client_info>(newSock, newClt));
      pthread_mutex_unlock(_clt_lst_lock);
    }

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


void *perClientServerThread(void *args)
{
  int cliSock = * (int *)args;
  int len;
  char buf[4096];
  int msg_type;
  char ret_code;
  int peer_id;
  FILE *fp;

  memset(buf, 0, sizeof(buf));
  len = read(cliSock, buf, sizeof(buf));
  if(len <= 0) {
    fprintf(stderr, "Error! downloader quit\n");
    goto exit;
  }
  msg_type = buf[0];
  switch(msg_type)
  {
    case DOWNLOAD:
      peer_id = buf[1];
      pthread_mutex_lock(&lock_workload);
      my_workload++;
      pthread_mutex_unlock(&lock_workload);
      printf("received a Download request from peer id=%d latency=%d: '%s'\n", peer_id, latencyMatrix[peer_id - 1], buf+1);
      char filename[128];
      sscanf(buf+2,"%s", filename);
      sprintf(buf, "%s/%s", my_dir, filename);
      fp = fopen(buf, "r");
      if(fp == NULL) {
        perror("fopen");
        buf[0] = FILEDELETED;
        write(cliSock, buf, 1);
        pthread_mutex_lock(&lock_workload);
        my_workload--;
        pthread_mutex_unlock(&lock_workload);
        goto exit;
      }
      buf[0] = FOUND;
      write(cliSock, buf, 1);
      while((len = fread(buf, sizeof(char), sizeof(buf), fp)) > 0) {
        usleep(latencyMatrix[peer_id - 1] * 1000);
        if(send(cliSock, buf, len, MSG_NOSIGNAL) < 0) {
          perror("send");
          fclose(fp);
          pthread_mutex_lock(&lock_workload);
          my_workload--;
          pthread_mutex_unlock(&lock_workload);
          goto exit;
        }
      }
      fclose(fp);
      printf("file %s transfer done\n", filename);
      pthread_mutex_lock(&lock_workload);
      my_workload--;
      pthread_mutex_unlock(&lock_workload);
      break;
    case GETLOAD:
      len = sprintf(buf, "%d", my_workload);
      printf("return my workload=%d\n", my_workload);
      write(cliSock, buf, len);
      break;
    default:
      printf("received Unknown request\n");
      break;
  }
exit:
  close(cliSock);
  pthread_mutex_lock(&clt_lst_lock);
  connected_client_list.erase(cliSock);
  pthread_mutex_unlock(&clt_lst_lock);
}


int scanLocalDirectory (char *dir)
{
  char buf[128];
  sprintf(buf, "(cd %s && sum *)", dir);
  my_file_list.clear();
  FILE* pipe = popen(buf, "r");
  if (!pipe) {
    perror("popen");
    return -1;
  }
  int checksum, blocks;
  while(!feof(pipe)) {
    if(fscanf(pipe, "%d %d %s\n", &checksum, &blocks, buf) == 3) {
      my_file_list[string(buf)] = checksum;
    }
  }
  /*for (std::map<string,int>::iterator it = my_file_list.begin(); it != my_file_list.end(); ++it)
    std::cout << it->first << " " << it->second << '\n';*/
  pclose(pipe);
  return 0;
}

int download(const char *peer_ip, int peer_port, const char *filename, int checksum)
{
  int peerSock = socket(AF_INET, SOCK_STREAM, 0);
  struct sockaddr_in peerAddr;
  bzero( (char *)&peerAddr, sizeof(peerAddr));
  peerAddr.sin_family = AF_INET;
  peerAddr.sin_port = htons(peer_port);
  peerAddr.sin_addr.s_addr = inet_addr(peer_ip);
  int ret = connect(peerSock, (struct sockaddr *)&peerAddr, sizeof(peerAddr));
  if(ret == -1) {
    perror("connect");
    close(peerSock);
    return -1;
  }
  char buf[4096];
  int pos = 0;
  buf[pos++] = DOWNLOAD;
  buf[pos++] = my_pid;
  pos += sprintf(&buf[pos], "%s", filename);
  ret = write(peerSock, buf, pos);
  if(ret == -1) {
    perror("write");
    close(peerSock);
    return -1;
  }
  ret = read(peerSock, buf, sizeof(buf));
  if(ret == -1) {
    perror("read");
    close(peerSock);
    return -1;
  }
  if(buf[0] == FOUND) {
    sprintf(buf, "%s/%s", my_dir, filename);
    FILE *fp = fopen(buf, "w");
    if(fp == NULL) {
      perror("fopen");
      close(peerSock);
      return -1;
    }
    while((ret = recv(peerSock, buf, sizeof(buf), 0)) > 0) {
      int write_sz = fwrite(buf, sizeof(char), ret, fp);
      if(write_sz < ret) {
        perror("fwrite");
        fclose(fp);
        close(peerSock);
        return -1;
      }
    }
    if(ret == 0) {
      fclose(fp);
      close(peerSock);
      printf("file %s download done! checking its checksum ...", filename);
      char cmd[256];
      int checksum1, blocks;
      sprintf(cmd, "(cd %s && sum %s)", my_dir, filename);
      FILE* pipe = popen(cmd, "r");
      if(!pipe) {
        perror("pipe");
        return -1;
      }
      if(fscanf(pipe, "%d %d\n", &checksum1, &blocks) != 2) {
        fprintf(stderr, "Error! download fscanf error\n");
        pclose(pipe);
        return -1;
      }
      pclose(pipe);
      if(checksum == checksum1) {
        printf(" MATCH!\n");
        if(my_status == CONN)
          UpdateList();
        return 0;
      } else {
        printf("Downloaded file %s corrupted checksum=%d, should be %d!\n", filename, checksum1, checksum);
        return CHECKSUMNOTMATCH;
      }
    }
  } else if(buf[0] == FILEDELETED) {
    printf("file %s deleted in peer\n", filename);
    return FILEDELETED;
  } else {
    fprintf(stderr, "Error! download peer returned unknown result\n");
    return -1;
  }
}

void *dodownload(void *args)
{
  pthread_mutex_lock(&lock_workload);
  my_workload++;
  pthread_mutex_unlock(&lock_workload);
  char *filename = (char *)args;
  printf("downloading %s\n", filename);
  double timer1 = 0.0;
  timer1 -= getWClockSeconds();
  map<int, ip_port> peer_list;
  map<int, int> fail_count;
  map<int, ip_port>::iterator it;
  int done = 0, checksum1, retry = 0;
  while(!done) {
    int ret = Find(filename, checksum1, peer_list);
    if(ret <= 0) {
      printf("file %s download failed - Find failed\n", filename);
      if(++retry == MAXRETRY)
        done = 1;
      continue;
    }
    //am I in it?
    if((it = peer_list.find(my_pid)) != peer_list.end()) {
      //yes, I am, then the next question is: is my checksum correct?
      char cmd[128];
      sprintf(cmd, "(cd %s && sum %s)", my_dir, filename);
      FILE* pipe = popen(cmd, "r");
      if (!pipe) {
        perror("popen");
      }
      int checksum2, blocks;
      if((fscanf(pipe, "%d %d\n", &checksum2, &blocks) != 2) || (checksum1 != checksum2)) {
        printf("local file deleted or corrupted\n");
        //still need to download
      } else {
        printf("local file is correct, no need to download\n");
        pclose(pipe);
        done = 1;
        continue;
      }
      pclose(pipe);
      peer_list.erase(it);
    }
    //printf("b%s here %d\n", filename, peer_list.size());
    map<int, int> peers_workload; //<peer_id, workload>
    int workload;
    for(it = peer_list.begin(); it != peer_list.end(); ++it)
      peers_workload[it->first] = GetLoad(it->second.ip, it->second.port);
    //printf("e%s here %d\n", filename, peer_list.size());
    for(map<int, int>::iterator it1 = peers_workload.begin(); it1 != peers_workload.end(); ++it1) {
      if(it1->second == -1) {
        peer_list.erase(it1->first);
        //todo: notify TS of crushed peer
        if(my_status == CONN) {
          char buf[1024];
          int pos = 0;
          buf[pos++] = REPORTPEERDOWN;
          pos += sprintf(buf + pos, "%d", it1->first);
          pthread_mutex_lock(&lock_ts);
          sendto(sock_ts, buf, pos, 0, (struct sockaddr *)&tsaddr, sizeof(tsaddr));
          pthread_mutex_unlock(&lock_ts);
        }
      }
    }
    //at this point neither current peer nor crushed peer in peer_list
    int chosen_peer = 0, cost_factor = 1000000; //cost_factor = latency * workload
    for(it = peer_list.begin(); it != peer_list.end(); ++it) {
      if(((peers_workload[it->first] + 1) * latencyMatrix[it->first - 1] * (fail_count.find(it->first) != fail_count.end() ? fail_count[it->first] : 1)) < cost_factor) {
        chosen_peer = it->first;
        cost_factor = (peers_workload[it->first] + 1) * latencyMatrix[it->first - 1] * (fail_count.find(it->first) != fail_count.end() ? fail_count[it->first] : 1);
      }
    }
    if(chosen_peer) {
      printf("based on latency %d and workload %d, choose peer %d to download file %s\n", latencyMatrix[chosen_peer - 1], peers_workload[chosen_peer], chosen_peer, filename);
    } else {
      printf("file %s download failed - nowhere to perform the download\n", filename);
      if(++retry == MAXRETRY)
        done = 1;
      continue;
    }
    //OK, let's download from the chosen guy
    ret = download(peer_list[chosen_peer].ip, peer_list[chosen_peer].port, filename, checksum1);
    switch(ret) {
      case 0:
        //successful
        done = 1;
        break;
      case -1:
        //internal error, no more retry
        done = 1;
        break;
      case CHECKSUMNOTMATCH:
      case FILEDELETED:
        fail_count[chosen_peer] = ++retry;
        if(retry == MAXRETRY)
          done = 1;
        break;
      default:
        break;
    }
  }
  timer1 += getWClockSeconds();
  printf("download %s took %.6lfs\n", filename, timer1);
  free(filename);
  pthread_mutex_lock(&lock_workload);
  my_workload--;
  pthread_mutex_unlock(&lock_workload);
}

int Download(const char *filename)
{
  char *newfilename = (char *)malloc(256);
  memset(newfilename, 0, 256);
  strcpy(newfilename, filename);
  pthread_t threadID;
  pthread_attr_t attr;
  pthread_attr_init(&attr);
  pthread_attr_setdetachstate(&attr, PTHREAD_CREATE_DETACHED);
  int ret_code = pthread_create(&threadID, &attr, (StartFunc *) dodownload, (void *) newfilename);
  if (ret_code < 0) {
    cout << "ERROR! Download pthread_create dodownload, failed" << endl;
    return -1;
  }
}

int Find(const char *filename, int &checksum, map<int,ip_port> &peer_list)
{
  char buf[1024];

  int pos = 0;
  buf[pos++] = FIND;
  pos += sprintf(buf+pos, "%d;%s", my_pid, filename);
  socklen_t slen = sizeof(tsaddr);
  pthread_mutex_lock(&lock_ts);
  int ret = sendto(sock_ts, buf, pos, 0, (struct sockaddr *)&tsaddr, sizeof(tsaddr));
  pthread_mutex_unlock(&lock_ts);
  if(ret == -1) {
    fprintf(stderr, "Error! Find sendto failed\n");
    return ret;
  }
  ret = recvfrom(sock_ts, buf, sizeof(buf), 0, (struct sockaddr *)&tsaddr, &slen);

  if(ret > 0) {
    if(ret == 1) {
      printf("Not found!\n");
      return -1;
    }
    int numpeers = 0;
    char *pch = strtok (buf, ";");
    if(pch != NULL) {
      checksum = atoi(pch);
    } else {
      fprintf(stderr, "Error! Find result parsing\n");
      return -1;
    }
    pch = strtok (NULL, ";");
    if(pch != NULL) {
      numpeers = atoi(pch);
    } else {
      fprintf(stderr, "Error! Find result parsing\n");
      return -1;
    }
    while(numpeers--) {
      int id;
      ip_port _ip_port;
      pch = strtok (NULL, ";");
      if(pch != NULL) {
        id = atoi(pch);
      } else {
        fprintf(stderr, "Error! Find result parsing\n");
        return -1;
      }
      pch = strtok (NULL, ";");
      if(pch != NULL) {
        strcpy(_ip_port.ip, pch);
      } else {
        fprintf(stderr, "Error! Find result parsing\n");
        return -1;
      }
      pch=strtok (NULL, ";");
      if(pch != NULL) {
        _ip_port.port = atoi(pch);
      } else {
        fprintf(stderr, "Error! Find result parsing\n");
        return -1;
      }
      peer_list.insert(std::pair<int,ip_port>(id,_ip_port));
    }
  } else if(ret == 0) {
    printf("Find timeout1\n");
    //The return value will be 0 when the peer  has  performed  an orderly shutdown.
  } else {
    printf("Find timeout\n");
    //timeout EAGAIN or EWOULDBLOCK
  }
  return ret;
}

int UpdateList()
{
  char buf[4096];
  memset(buf, 0, sizeof(buf));
  int pos = 0;
  buf[pos++] = UPDATELIST;
  int ret;
  pthread_mutex_lock(&lock_my_file_list);
  scanLocalDirectory(my_dir);
  pos += sprintf(buf+pos, "%d;%d", my_pid, my_file_list.size());
  for(std::map<string,int>::iterator it = my_file_list.begin(); it != my_file_list.end(); ++it) {
    buf[pos++] = ';';
    pos += sprintf(buf + pos, "%s;%d", it->first.c_str(), it->second);
  }
  pthread_mutex_unlock(&lock_my_file_list);
  pthread_mutex_lock(&lock_ts);
  ret = sendto(sock_ts, buf, pos, 0, (struct sockaddr *)&tsaddr, sizeof(tsaddr));
  pthread_mutex_unlock(&lock_ts);
  if(ret==-1) {
    //todo handle this
    fprintf(stderr, "Error! UpdateList sendto failed\n");
    return ret;
  }
  return ret;
}

void PingServerThread(void *arg)
{
  socklen_t slen;
  int ret;
  char buf[1024];

  while(1)
  {
    sleep(1);
    //todo detecting ts down
    buf[0] = PING;
    buf[1] = my_pid;
    slen = sizeof(ts_pingaddr);
    ret = sendto(sock_ping, buf, 2, 0, (struct sockaddr *)&ts_pingaddr, slen);
    if(ret == -1) {
      //maybe when ts down, this will happen?
      fprintf(stderr, "Error! PingServerThread sendto failed\n");
      continue;
    }
    ret = recvfrom(sock_ping, buf, sizeof(buf), 0, (struct sockaddr *)&ts_pingaddr, &slen);
    if(ret > 0) {
    } else {
      printf("lost connection with Tracking Server\n");
      pthread_mutex_lock(&lock_status);
      my_status = INIT;
      pthread_mutex_unlock(&lock_status);
      Register();
      UpdateList();
    }
  }
}

int StartPingThread()
{
  pthread_t threadID;
  pthread_attr_t attr;
  pthread_attr_init(&attr);
  pthread_attr_setdetachstate(&attr, PTHREAD_CREATE_DETACHED);
  if(pthread_create(&threadID,&attr, (StartFunc *)PingServerThread, (void *)0) != 0) {
    fprintf(stderr, "Error! StartReceivingPublishThread() pthread_create() failed\n");
    return -1;
  }

  return 0;
}

int Register()
{
  int pos=0;
  char buf[1024];
  int ret;
  socklen_t slen;
  slen=sizeof(tsaddr);
  memset(buf,0,sizeof(buf));
  buf[pos++]=REGISTER;
  pos+=sprintf(&buf[pos],"%d",my_pid);
  buf[pos++]=';';
  strcpy(&buf[pos],server_ip);
  pos+=strlen(server_ip);
  buf[pos++]=';';
  pos+=sprintf(&buf[pos],"%d",server_port);
  //debug
  /*printf("Register msglen=%d\n",pos);
    for(int i=0;i<pos;i++) {
    printf("%c",buf[i]);
    }
    printf("\n");
    print_buf(buf,pos);*/
  while(1) {
    pthread_mutex_lock(&lock_ts);
    ret=sendto(sock_ts,buf,pos,0,(struct sockaddr *)&tsaddr, sizeof(tsaddr));
    pthread_mutex_unlock(&lock_ts);
    if(ret==-1) {
      //maybe when ts down, this will happen?
      fprintf(stderr, "Error! Register sendto failed\n");
      sleep(1);
      continue;
    }
    ret=recvfrom(sock_ts,buf,sizeof(buf),0,(struct sockaddr *)&tsaddr,&slen);
    if(ret>0) {
      //don't check received buffer
      printf("Peer %d connected to Tracking Server\n",my_pid);
      pthread_mutex_lock(&lock_status);
      my_status=CONN;
      pthread_mutex_unlock(&lock_status);
      break;
    } else if(ret==0) {
      //The return value will be 0 when the peer  has  performed  an orderly shutdown.
      continue;
    } else {
      //timeout EAGAIN or EWOULDBLOCK
      continue;
    }
  }

  return ret;
}

int parseLatencyMatrix()
{
  string line;
  int id,latency;
  ifstream myfile;
  myfile.open(latency_matrix_file.c_str());
  if (myfile.is_open()) {
    getline (myfile,line);
    latencyMatrixDimension=atoi(line.c_str());
    latencyMatrix=(int *)malloc(sizeof(int)*latencyMatrixDimension);
    printf("dimension=%d\n",latencyMatrixDimension);
    while ( myfile.good() ) {
      getline (myfile,line);
      istringstream lineStream(line);
      int pid;
      lineStream >> pid;
      printf("id:%d\n",pid);
      if(pid==my_pid) {
        int i;
        for(i=0;i<latencyMatrixDimension;i++) {
          lineStream >> latencyMatrix[i];
        }
        break;
      }
    }
    myfile.close();
  } else {
    cout << "Unable to open latency file " << latency_matrix_file << endl;
    return -1;
  }

  return 0;
}

int GetLoad(const char *peer_ip, int peer_port)
{
  int peerSock = socket(AF_INET, SOCK_STREAM, 0);
  struct sockaddr_in peerAddr;
  bzero( (char *)&peerAddr, sizeof(peerAddr));
  peerAddr.sin_family = AF_INET;
  peerAddr.sin_port = htons(peer_port);
  peerAddr.sin_addr.s_addr = inet_addr(peer_ip);
  int ret = connect(peerSock, (struct sockaddr *)&peerAddr, sizeof(peerAddr));
  if(ret == -1) {
    perror("connect");
    close(peerSock);
    return -1;
  }
  char buf[256];
  memset(buf, 0, sizeof(buf));
  int pos = 0;
  buf[pos++] = GETLOAD;
  usleep(1000);
  ret = write(peerSock, buf, pos);
  if(ret == -1) {
    perror("write");
    close(peerSock);
    return -1;
  }
  ret = read(peerSock, buf, sizeof(buf));
  if(ret == -1) {
    perror("read");
    close(peerSock);
    return -1;
  }

  /*Get load number*/
  close(peerSock);
  return atoi(buf);
}

void suppress_sigpipe(void)
{
#if ! defined(MSG_NOSIGNAL) && ! defined(SO_NOSIGPIPE)
  sigset_t pending;
  sigemptyset(&pending);
  sigpending(&pending);
  control.sigpipe_pending = sigismember(&pending, SIGPIPE);
  if (! control.sigpipe_pending)
  {
    sigset_t blocked;
    sigemptyset(&blocked);
    pthread_sigmask(SIG_BLOCK, &config.sigpipe_mask, &blocked);

    /* Maybe is was blocked already? */
    control.sigpipe_unblock = ! sigismember(&blocked, SIGPIPE);
  }
#endif /* ! defined(MSG_NOSIGNAL) && ! defined(SO_NOSIGPIPE) */
}

double getWClockSeconds(void)
{
#ifdef __GNUC__
  struct timeval ctime;

  gettimeofday(&ctime, NULL);

  return (double)ctime.tv_sec + (double).000001*ctime.tv_usec;
#else
  return (double)time(NULL);
#endif
}

void *periodicUpdateList(void *args)
{
  while(1) {
    sleep(UPDATELISTINTERVAL);
    if(my_status == CONN) {
      UpdateList();
    }
  }
}

int StartPeriodicUpdateListThread()
{
  pthread_t threadID;
  pthread_attr_t attr;
  pthread_attr_init(&attr);
  pthread_attr_setdetachstate(&attr, PTHREAD_CREATE_DETACHED);
  if(pthread_create(&threadID,&attr, (StartFunc *)periodicUpdateList, (void *)0) != 0) {
    fprintf(stderr, "Error! StartPeriodicUpdateListThread() pthread_create() failed\n");
    return -1;
  }

  return 0;
}

void cmdlineInteraction(void);
int main(int argc, char *argv[])
{
  int ret_code;

  if(argc == 1) {
    printf("Usage: %s <pid> <dir> <ts_ip> <ts_port> <ts_ping_port> <latency_matrix_file>\n",argv[0]);
    return 0;
  }
  else if(argc == 7) {
    my_pid=atoi(argv[1]);
    printf("my_pid=%d\n",my_pid);
    sprintf(my_dir,"%s",argv[2]);
    sprintf(ts_ip,"%s",argv[3]);
    ts_port=atoi(argv[4]);
    ts_ping_port=atoi(argv[5]);
    latency_matrix_file=string(argv[6]);
    if(parseLatencyMatrix() != 0)
      return -1;
  }
  else
  {
  }

  my_status = INIT;
  my_workload = 0;
  suppress_sigpipe();
  ret_code =  setupTcpServer(server_ip, &server_port, &connected_client_list, &clt_lst_lock, perClientServerThread);
  if(ret_code != 0) {
    cout << "Server starting up Failed! exiting ..." << endl;
    return -1;
  }

  memset(&tsaddr,0,sizeof(tsaddr));
  tsaddr.sin_family = AF_INET;
  tsaddr.sin_port = htons(ts_port);
  tsaddr.sin_addr.s_addr = inet_addr(ts_ip);
  if ( tsaddr.sin_addr.s_addr == INADDR_NONE ) {
    fprintf(stderr, "Error! main s_addr == INADDR_NONE");
    return -1;
  }
  sock_ts=socket(AF_INET, SOCK_DGRAM, IPPROTO_UDP);
  struct timeval tv;
  tv.tv_sec = 3;  /* 3 Secs Timeout */
  tv.tv_usec = 0;
  setsockopt(sock_ts, SOL_SOCKET, SO_RCVTIMEO, (char *)&tv,sizeof(struct timeval));
  pthread_mutex_init(&lock_ts, NULL);
  pthread_mutex_init(&lock_status, NULL);
  pthread_mutex_init(&lock_workload, NULL);
  pthread_mutex_init(&lock_my_file_list, NULL);

  Register();

  memset(&ts_pingaddr,0,sizeof(ts_pingaddr));
  ts_pingaddr.sin_family = AF_INET;
  ts_pingaddr.sin_port = htons(ts_ping_port);
  ts_pingaddr.sin_addr.s_addr = inet_addr(ts_ip);
  if ( tsaddr.sin_addr.s_addr == INADDR_NONE ) {
    fprintf(stderr, "Error! main s_addr == INADDR_NONE");
    return -1;
  }
  sock_ping=socket(AF_INET, SOCK_DGRAM, IPPROTO_UDP);
  tv.tv_sec = 1;  /* 1 Secs Timeout */
  setsockopt(sock_ping, SOL_SOCKET, SO_RCVTIMEO, (char *)&tv,sizeof(struct timeval));
  StartPingThread();
  UpdateList();
  StartPeriodicUpdateListThread();
  cmdlineInteraction();

  return ret_code;
}

void cmdlineInteraction(void)
{
  string cmdline;
  int disconnect = 0;
  while(!disconnect)
  {
    printf("\n\ninput:\n supported commands:\n  download <filenameA> [filenameB] [filenameC] ...\n  exit #gracefully exit\n");
    getline(cin, cmdline);

    if (cmdline == "scan") {
      pthread_mutex_lock(&lock_my_file_list);
      scanLocalDirectory(my_dir);
      pthread_mutex_unlock(&lock_my_file_list);
    } else if (cmdline == "parseLatencyMatrix") {
      parseLatencyMatrix();
    } else if ((cmdline.substr(0, strlen("Find")) == "Find") || (cmdline.substr(0, strlen("find")) == "find")) {
      string filename;
      printf("filename:\n");
      getline(cin, filename);
      map<int,ip_port>tmp_peer_list;
      int checksum;
      int ret=Find(filename.c_str(),checksum,tmp_peer_list);
      if(ret<=0)
        continue;
      printf("checksum=%d\n",checksum);
      for(map<int,ip_port>::iterator it=tmp_peer_list.begin(); it!=tmp_peer_list.end(); ++it)
        printf("%d %s %d\n",it->first,it->second.ip,it->second.port);
    } else if ((cmdline.substr(0, strlen("Download")) == "Download") || (cmdline.substr(0, strlen("download")) == "download")) {
      if(my_status != CONN) {
        printf("Tracking Server unavailable, cannot fulfill Download request!\n");
        continue;
      }
      istringstream ss(cmdline);
      string filename;
      ss >> filename;
      while (ss >> filename) {
        Download(filename.c_str());
      }
    } else if (cmdline == "debugdownload") {
      printf("filename:\n");
      string filename;
      getline(cin, filename);
      printf("checksum:\n");
      string checksum;
      getline(cin, checksum);
      printf("peer_ip:\n");
      string peer_ip;
      getline(cin, peer_ip);
      printf("peer_port:\n");
      string peer_port;
      getline(cin, peer_port);
      printf("download return = %d\n", download(peer_ip.c_str(), atoi(peer_port.c_str()), filename.c_str(), atoi(checksum.c_str())));
    } else if (cmdline == "exit") {
      disconnect = 1;
    }
  }
}
