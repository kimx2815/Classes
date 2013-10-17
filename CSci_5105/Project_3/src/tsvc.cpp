#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>
#include <pthread.h>
#include <ifaddrs.h>
#include<arpa/inet.h>
#include <unistd.h>
#include <time.h>
#include <sys/types.h>
#include <sys/socket.h>
#include "header.h"

#define PORTLEN 5
#define IPLEN 5
#define PIDLEN 5
#define MAXFILE 256
#define MAXLOC 128
#define FILENAME 80
#define INTERFACE "eth0"
#define BUFLEN 1024
#define CHECKTIME 5
#define LOCLEN INET_ADDRSTRLEN+PORTLEN+IPLEN

char MyIP[INET_ADDRSTRLEN];
int My_pid;
int My_port;
int My_p_port;
int file_num;
int clnt_num;
pthread_mutex_t lock;

struct client{
	char IPaddr[INET_ADDRSTRLEN];
	char port_d[PORTLEN];
	int id;
	int no_response;
}MyClntList[MAXLOC];

struct file_loc{
	char filename[FILENAME];
	int checksum;
	int loc_list[MAXLOC];
	int copy_num;/*How many peers share this file*/
}MyFileList[MAXFILE];

void print_file_list(){
	int i,j;
	printf("==================File list====================\n");
	for(i=0;i<file_num;i++){
		printf("%s\t%d\t",MyFileList[i].filename,MyFileList[i].checksum);
		for(j=0;j<MyFileList[i].copy_num;j++){
			printf("%d|",MyFileList[i].loc_list[j]);
		}
		printf("\n");
	}
	printf("================End File list==================\n");
}

void update_file(int index, int checksum, int id){
	/*Check whether the client(id) is in the location list of <filename>*/
	/*if not, Add id to <filename>'s list */
	int i;
	for(i=0;i<MyFileList[index].copy_num;i++){
		if(MyFileList[index].loc_list[i]==id){
			return;
		}
	}
	pthread_mutex_lock(&lock);
	MyFileList[index].loc_list[MyFileList[index].copy_num]=id;
	MyFileList[index].copy_num++;
	pthread_mutex_unlock(&lock);
}

void add_file(char *filename, int checksum, int id){
	/*Add a new file that was not in server's list*/
	/*Should chech whether it's really a new file*/
	int i;
	for(i=0;i<file_num;i++){
		if(strcmp(MyFileList[i].filename,filename)==0){
			if(MyFileList[i].checksum==checksum){
				update_file(i,checksum,id);
			}
			return;
		}
	}

	/*Now that <filename> is a new file, let's add it to MyFileList*/
	pthread_mutex_lock(&lock);
	strcpy(MyFileList[file_num].filename,filename);
	MyFileList[file_num].checksum=checksum;
	MyFileList[file_num].loc_list[MyFileList[file_num].copy_num]=id;
	MyFileList[file_num].copy_num++;
	file_num++;
	pthread_mutex_unlock(&lock);
}

void rm_file(int index){
	int i,j,tmp;

	for(i=index+1;i<file_num;i++){
		MyFileList[i-1].checksum=MyFileList[i].checksum;
		MyFileList[i-1].copy_num=MyFileList[i].copy_num;
		strcpy(MyFileList[i-1].filename,MyFileList[i].filename);
		for(j=0;j<MyFileList[i].copy_num;j++){
			MyFileList[i-1].loc_list[j]=MyFileList[i].loc_list[j];
		}

	}
	i--;
	MyFileList[i].copy_num=0;
	file_num--;
}



void rm_from_filelist(int id){

	int i,j,k;
	for(i=0;i<file_num;i++){
		for(j=0;j<MyFileList[i].copy_num;j++){
			if(MyFileList[i].loc_list[j]==id){
				pthread_mutex_lock(&lock);
				for(k=j+1;k<MyFileList[i].copy_num;k++){
					MyFileList[i].loc_list[k-1]=MyFileList[i].loc_list[k];
				}
				MyFileList[i].copy_num--;
				if(MyFileList[i].copy_num==0){
					printf("remove %s\n",MyFileList[i].filename);
					rm_file(i);
					i--;
				}
				pthread_mutex_unlock(&lock);
			}
		}
	}
}

int search_file(char *filename){
	int i;
	for(i=0;i<file_num;i++){
		if(strcmp(filename,MyFileList[i].filename)==0){
			return i;
		}
	}
	return -1;
}

int search_addr(char *IP, int port){
	int i;
	for(i=0;i<clnt_num;i++){
		if(atoi(MyClntList[i].port_d)==port&&strcmp(MyClntList[i].IPaddr,IP)==0){
			return i;
		}
	}
	return -1;
}

int search_id(int id){
	int i;
	for (i=0;i<clnt_num;i++){
		if(MyClntList[i].id==id){
			return i;/*Find clnt with same id*/
		}
	}
	return -1;/*Not find*/
}

void print_clnt(){
	int i;
	printf("id\tIP\t\tport(DL)\n");
	for(i=0;i<clnt_num;i++){
		printf("%d\t%s\t%s\n",MyClntList[i].id,MyClntList[i].IPaddr,MyClntList[i].port_d);
	}
}

int add_clnt(char *IP, char *port_d, int id){

	if(search_id(id)==-1){
		pthread_mutex_lock(&lock);
		MyClntList[clnt_num].id=id;
		MyClntList[clnt_num].no_response=0;
		strcpy(MyClntList[clnt_num].IPaddr,IP);
		strcpy(MyClntList[clnt_num].port_d,port_d);
		MyClntList[clnt_num].no_response=0;
		clnt_num++;
		pthread_mutex_unlock(&lock);
		print_clnt();
		return 0;/*Add one*/
	}else{
		return 1;/*Add nothing*/
	}
}

int clnt_rm(int index){
	int i,id;
	/*remove from file list*/
	id=MyClntList[index].id;
	rm_from_filelist(id);
	/*remove from client list*/
	pthread_mutex_lock(&lock);
	for(i=index+1;i<clnt_num;i++){
		MyClntList[i-1].id=MyClntList[i].id;
		MyClntList[i-1].no_response=MyClntList[i].no_response;
		strcpy(MyClntList[i-1].IPaddr,MyClntList[i].IPaddr);
		strcpy(MyClntList[i-1].port_d,MyClntList[i].port_d);
	}
	clnt_num--;
	pthread_mutex_unlock(&lock);
	print_clnt();
	print_file_list();
}



/*Network functions/////////////////////////////////////////////////////////////////*/
void die(char *s)
{
	perror(s);
	exit(1);
}

void init_svc(){
		int sfd, l, i,result,lSize;
		char buffer[BUFLEN];
		char *pch;

		lSize=BUFLEN/8;

		/*init local storage*/
		for(i=0;i<MAXFILE;i++){
			MyFileList[i].copy_num=0;
		}

		/*Init UDP*/
		FILE *pFile;
		pFile=fopen("config.txt" , "r");
		if (pFile == NULL){
			 perror ("Error opening file");
		}
		fread (buffer,1,lSize,pFile);
		pch =strtok(buffer,";");
		My_port =atoi(pch);
		pch =strtok(NULL,";");
		My_p_port = atoi(pch);
		file_num =0;
		clnt_num =0;

		/*init mutex*/
		pthread_mutex_init(&lock,NULL);

		/*Get local IP*/
		struct ifaddrs * ifa=NULL;
		int flag =0;
		void * tmpAddrPtr=NULL;
	    getifaddrs(&ifa);
	    while(strcmp(ifa->ifa_name,INTERFACE)!=0|flag==0){
	    	if(strcmp(ifa->ifa_name,INTERFACE)==0){
	    		flag=1;
	    	}
	    	ifa = ifa->ifa_next;
	    }
	    tmpAddrPtr=&((struct sockaddr_in *)ifa->ifa_addr)->sin_addr;
		srand((unsigned)time(NULL));
		inet_ntop(AF_INET, tmpAddrPtr, MyIP, INET_ADDRSTRLEN);


		printf("My IP is :%s\n",MyIP);
		printf("Listen on port %d\n",My_port);
		printf("Ping on port %d\n",My_p_port);
}

void *ping_thread(void *ptr){
	/*Binding*/
	struct sockaddr_in server,dst;
	char message[BUFLEN];
	char buf[BUFLEN];
	int sfd,i,slen=sizeof(dst),index;
	sfd=socket(AF_INET,SOCK_DGRAM,0);
	bzero(&server,sizeof(server));
	server.sin_family=AF_INET;
	server.sin_port=htons(My_p_port);
	inet_aton(MyIP,&server.sin_addr);
	if( bind(sfd,(struct sockaddr *)&server,sizeof(server)) == -1)
	{
		die("bind");
	}


	while(1){
		/*Reveive every thing sent to My_p_port, and reply the same thing.*/


		memset(buf,'\0', BUFLEN);
		if (recvfrom(sfd, buf, BUFLEN, 0, (struct sockaddr *) &dst, (socklen_t *)&slen) == -1)
		{
		       perror("recvfrom");
		       exit(1);
		}
		if(buf[0]==PING){
			//printf("Recevied ping from %s:%d\n",inet_ntoa(dst.sin_addr),ntohs(dst.sin_port));

			//printf("%d\n",buf[1]);
			index = search_id((int)buf[1]);
			if(index!=-1){
				/*The sender is on my list*/
				/*reply*/
				//printf("reply\n");
				if (sendto(sfd, buf, strlen(buf) , 0 , (struct sockaddr *) &dst, slen)==-1)
				{
					die("sendto()");
				}
				if(MyClntList[index].no_response>0){
					MyClntList[index].no_response--;
				}
			}else{
				printf("Not my peer. ignore.\n");
			}
		}
	}
}

void *listen_thread(void *ptr){
	/*Binding*/
	int sfd,slen,recv_len,index,i;
	char *pch;
	char buf[BUFLEN];
	char cmd[BUFLEN];
    struct sockaddr_in server,dst;
	sfd=socket(AF_INET,SOCK_DGRAM,0);
	bzero(&server,sizeof(server));
	server.sin_family=AF_INET;
	server.sin_port=htons(My_port);
	inet_aton(MyIP,&server.sin_addr);
	if( bind(sfd,(struct sockaddr *)&server,sizeof(server)) == -1)
	{
		die("bind");
	}
	slen=sizeof(server);
	//printf("in Ping_thread\n");
	while(1)
	{
		fflush(stdout);

		memset(buf,'\0', BUFLEN);
		if ((recv_len = recvfrom(sfd, buf, BUFLEN, 0, (struct sockaddr *) &dst, (socklen_t *)&slen)) == -1)
		{
			die("recvfrom()");
		}
		printf("Received packet from %s:%d\n", inet_ntoa(dst.sin_addr), ntohs(dst.sin_port));
		printf("Data: %s\n" , buf);

		char *p;
		p=buf;
		p++;
		strcpy(cmd,p);

		/*Deal with received cmd*/
		if(buf[0]==REGISTER){
			/*Add new clnt to MyClntList*/
			printf("REGISTER\n");
			char IP[INET_ADDRSTRLEN],port_d[PORTLEN];
			char s[PIDLEN];

			int id;
			//printf("%s\n",cmd);
			pch = strtok (cmd,";");
			id = atoi(pch);
			pch = strtok (NULL,";");
			//printf("%d\n",id);
			if(pch!=NULL){
				strcpy(IP,pch);
				pch = strtok (NULL,";");
				if(pch!=NULL){
					strcpy(port_d,pch);
					index=search_id(id);
					if(index!=-1){
						/*This peer has crashed*/
						/*deal with crash*/
						/*1. remove old information*/
						printf("Peer crashed\n");
						clnt_rm(index);
						/*2. Add new info*/
						add_clnt(IP, port_d, id);
					}else{
						printf("Add new Peer\n");
						add_clnt(IP, port_d, id);
					}
					/*then reply with pid*/
					sprintf(s,"%d",My_pid);
					if (sendto(sfd, s, strlen(s) , 0 , (struct sockaddr *) &dst, slen)==-1)
					{
						die("sendto()");
					}
				}
			}
		}else if(buf[0]==UPDATELIST){
			/*update*/
			printf("UPDATELIST\n");
			int count, id, checksum,index;
			char filename[FILENAME];
			char *pch;
			pch = strtok (cmd,";");
			id=atoi(pch);
			/*check id*/
			index=search_id(id);
			if(index!=-1){
				pch = strtok (NULL,";");
				if(pch!=NULL){
					count = atoi(pch);
					for(i=0;i<count;i++){
						pch = strtok (NULL,";");
						if(pch!=NULL){
							strcpy(filename,pch);
							pch = strtok (NULL,";");
							if(pch!=NULL){
								checksum=atoi(pch);

								/*Add or update file*/
								add_file(filename, checksum, id);
							}
						}
					}
					print_file_list();
				}
			}else{
				printf("received UPDATELIST request from peer %d, which is not on my list\n",id);
			}

		}else if(buf[0]==FIND){
			/*find file*/
			printf("FIND\n");
			int id, index_c;
			char filename[FILENAME],msg[BUFLEN],loc[LOCLEN+3];
			char *pch;
			pch = strtok (cmd,";");
			id=atoi(pch);
			/*chech id*/
			index=search_id(id);
			if(index!=-1){
				pch = strtok (NULL,";");
				if(pch!=NULL){
					strcpy(filename,pch);

					/*Build a message to reply*/
					index = search_file(filename);
					if(index!=-1){
						memset(msg,'\0', BUFLEN);
						sprintf(msg,"%d;%d;",MyFileList[index].checksum,MyFileList[index].copy_num);
						for(i=0;i<MyFileList[index].copy_num;i++){
							index_c =search_id(MyFileList[index].loc_list[i]);
							sprintf(loc,"%d;%s;%s;",MyClntList[index_c].id,MyClntList[index_c].IPaddr,MyClntList[index_c].port_d);
							strcat(msg,loc);
						}
						printf("Sending msg : %s\n",msg);
						if (sendto(sfd, msg, strlen(msg) , 0 , (struct sockaddr *) &dst, slen)==-1)
						{
							die("sendto()");
						}
					}else{
						printf("Cannot find the file\n");
						memset(msg,'\0', BUFLEN);
						msg[0]=FIND;
						printf("%s(%d)\n",msg,strlen(msg));
						if (sendto(sfd, msg, strlen(msg) , 0 , (struct sockaddr *) &dst, slen)==-1)
						{
							die("sendto()");
						}
					}
				}
			}else{
				printf("received FIND request from peer %d, which is not on my list\n",id);
			}


		}else if(buf[0]==REPORTPEERDOWN){
			printf("REPORTPEERDOWN\n");
			int id;
			char *pch;
			pch = strtok (cmd,";");
			id=atoi(pch);
			/*check id*/
			index=search_id(id);
			if(index!=-1){
				printf("received crash report of peer %d, which is not on my list\n",id);
			}else{
				/*kick its ass*/
				clnt_rm(index);
				printf("Peer %d removed\n",MyClntList[i].id);
			}



		}

	}

}

void *check_thread(void *ptr){
	//printf("check_thread start\n");
	while(1){
		sleep(CHECKTIME);
		int i;
		for(i=0; i<clnt_num;i++){
			MyClntList[i].no_response++;
			if(MyClntList[i].no_response>=3){
				/*kick its ass*/
				printf("Peer %d removed\n",MyClntList[i].id);
				clnt_rm(i);

			}
		}
	}
}

int main(int argc, char* argv[]){
	init_svc();
	pthread_t thread1, thread2, thread3;
    int  iret1, iret2, iret3;
    iret2 = pthread_create( &thread2, NULL, ping_thread, NULL);
    iret1 = pthread_create( &thread1, NULL, listen_thread, NULL);
    iret3 = pthread_create( &thread3, NULL, check_thread, NULL);
    pthread_join( thread2, NULL);
    pthread_join( thread1, NULL);
    pthread_join( thread3, NULL);
}
