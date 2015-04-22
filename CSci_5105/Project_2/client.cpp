#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/socket.h>
#include <netinet/in.h>
#include <netdb.h> 
#include <iostream>
#include <stdint.h>
//#include <WinDef.h>
#include "msg_header.h"

using namespace std;

#define BUFSIZE 1024
void error(char *msg) {
  perror(msg);
  exit(0);
}


int main(int argc, char **argv) {
  
  int sockfd, portno, n;
  struct sockaddr_in serveraddr;
  struct hostent *server;
  char *hostname;
  char buf[BUFSIZE];

  /* check command line arguments */
  if (argc != 3) {
    fprintf(stderr,"usage: %s <server_IP> <port>\n", argv[0]);
    exit(0);
  }
  hostname = argv[1];
  portno = atoi(argv[2]);
  
  char select; //number input

      /* socket: create the socket */
      sockfd = socket(AF_INET, SOCK_STREAM, 0);
      if (sockfd < 0) 
	error("ERROR opening socket");
      /* gethostbyname: get the server's DNS entry */
      server = gethostbyname(hostname);
      if (server == NULL) {
	fprintf(stderr,"ERROR, no such host as %s\n", hostname);
	exit(0);
      }
      /* build the server's Internet address */
      bzero((char *) &serveraddr, sizeof(serveraddr));
      serveraddr.sin_family = AF_INET;
      bcopy((char *)server->h_addr, 
	    (char *)&serveraddr.sin_addr.s_addr, server->h_length);
      serveraddr.sin_port = htons(portno);
      /* connect: create a connection with the server */
      if (connect(sockfd,(struct sockaddr *)  &serveraddr, sizeof(serveraddr)) < 0) 
	error("ERROR connecting");
  while(1)
    {
    
 


      printf("\nInput number [POST:1 READ:2 Choose:3 Reply:4]\n>");  
      //      bzero(select, 1);
      //      fgets(select);
      cin>>select;
      ///////////////////////////////////
      /* POST *///////////////////////////
      //buf[0] - MSGTYPE  enum value
      //buf[1-2] - article length
      //buf[3] - article 
      /////////////////////////////////////
      if(select == '1'){
	char article[1000];
	char *content;
	char buf_1[BUFSIZE];
	cout << " POST "<<endl;
	cout << "Article : ";
	cin >>article;
	int n;
	unsigned short article_len = strlen(article);
	if(article_len > 1000  )
	  article_len = 1000 ;
	buf_1[0] = POST_REQ;
	

	// buf_1[1] = (byte) (article_len & 0xFF);
	// buf_1[2] = (byte) ((article_len >> 8) & 0xFF);
	buf_1[1] = article_len & 0xff;
	buf_1[2] = (article_len>>8) & 0xff;
	

	strcpy(&buf_1[3], article);
	//	       , strlen(article));
	n = send(sockfd, buf_1, article_len+3, 0);
	cout << "POST_REQ sent sucessfully " << endl;

	/* just finish when it sent POST_REQ */
		
	bzero(buf_1, BUFSIZE);
	/* wait POST_ACK */
	n = recv(sockfd, buf_1, BUFSIZE, 0);
	//do_something about POST_ACK if needed

      }
      ////////////////////////////////////
      /* READ *////////////////////////////
      //[0]MSGTYPE [1-4] (int)article_id -> byte
      //[5-8] (int)num_article -> byte
      //////////////////////////////////////
      else if(select=='2'){ 
	char buf_2[BUFSIZE];
	cout << "READ" <<endl;
	cout << "Which page do you want to see: ";
	int article_id;
	cin >>article_id;

	buf_2[0] = READ_REQ;
	buf_2[1] = article_id & 0xff;
	buf_2[2] = (article_id>>8) & 0xff;
	buf_2[3] = (article_id>>16) & 0xff;
	buf_2[4] = (article_id>>24) & 0xff;
	
	int n;
	/* READ_REQ sent */
	n = send(sockfd, buf_2, MIN_READ_REQ_LEN, 0);
	cout << "READ_REQ sent sucessfully " << endl;
	bzero(buf_2, BUFSIZE);
	/* Wait READ_ACK */
	//Maybe need loop for recv buf_2 then simply print it

	// loop_function
	n = recv(sockfd, buf_2, BUFSIZE, 0);
        printf("%d number of bytes received\n", n);
        printf("%s\n", buf_2+4);


      }
      //////////////////////////////
      /*CHOOSE */////////////////////
      //[0]MSGTYPE [1-4] choosed_article_num
      ////////////////////////////////
      else if(select=='3'){
	char buf_3[BUFSIZE];
	cout << "CHOOSE" <<endl;
	cout << "choose article id : " ;
	int ch_article;
	cin >>ch_article;
	buf_3[0]=CHOOSE_REQ;
	buf_3[1] = ch_article & 0xff;
	buf_3[2] = (ch_article>>8) & 0xff;
	buf_3[3] = (ch_article>>16) & 0xff;
	buf_3[4] = (ch_article>>24) & 0xff;
	int n;
	/* CHOOSE_REQ sent */
	n = send(sockfd, buf_3, strlen(buf_3), 0);
	cout << "CHOOSE_REQ sent sucessfully " << endl;
	
	bzero(buf_3, BUFSIZE);
	/* Wait CHOOSE_ACK */

	//do something
	n = recv(sockfd, buf_3, BUFSIZE, 0);

       
      }
      /////////////////////////////////////////////////
      // REPLY 
      //[0]MSGTYPE_[1-4]replyArticleNum [56]article_len
      //////////////////////////////////////////////////
      else if(select=='4'){
	char article[BUFSIZE-10];
	char buf_4[BUFSIZE];
	cout << "REPLY" <<endl;
	cout << "choose REPLY article id : " ;
	int re_article;
	cin >> re_article;
	cout << " REPLY article content : " ;
	cin >> article;
	unsigned short article_len = strlen(article);
	if(article_len > 1000  )
	  article_len = 1000 ;

	buf_4[0]=REPLY_REQ;
	buf_4[1] = re_article & 0xff;
	buf_4[2] = (re_article>>8) & 0xff;
	buf_4[3] = (re_article>>16) & 0xff;
	buf_4[4] = (re_article>>24) & 0xff;
	buf_4[5] = article_len & 0xff;
	buf_4[6] = (article_len>>8) & 0xff;

	strcpy(&buf_4[7], article);
	
	int n;
	/* REPLY_REQ sent */
	n = send(sockfd, buf_4, article_len+MIN_REPLY_REQ_LEN, 0);
	cout << "REPLY_REQ sent sucessfully " << endl;
	bzero(buf_4, BUFSIZE);
	
	/* Need to discuss */
	//it will be similar function as READ 
	//
	n = recv(sockfd, buf_4, BUFSIZE, 0);




      }else{
	error("select [1~4]\n");
      }

    }

  return 0;
}
