#include <iostream>
#include <fstream>
#include <cstdlib>
#include <stdlib.h>
using namespace std;
int main( int argc, char* argv[] ) {
  ofstream myfile ("latency.txt");
  cout << "start"<<endl;
  if (argc != 2){
    cout<<"Please input number of nodes(client)"<<endl;
    exit(0); 
  }
  int i = atoi(argv[1]);
 
  int j = i*(i-1)/2; //vertecies

  int a[i][i];

 for (int row = 0; row < i; row++)
   {  
     for (int col = 0 + row; col < i; col++)
       {
	 int tmp = rand() % 4899 + 101;
	 a[row][col]=tmp;
	 a[col][row]=tmp;
	 if(row == col)
	   a[row][col] = 0;	 
       }
   }
 myfile <<i << "\n";  
cout  <<i << "\n";  
 //PRINT part
 for (int row = 0; row < i; row++)
   { 	 cout << row+1 << "\t";  
 	 
     myfile <<row+1 << "\t";  
     for (int col = 0 ; col < i; col++)
       {
	 cout << a[row][col] << "\t";  
	 myfile <<a[row][col] << "\t";  
       }
     cout << endl;
     myfile << endl;
   }



 /*
  while(j!=0)
    {
      myfile << rand() % 4899 + 101 << "\n";
      j--;
    }
 */
  myfile.close();
  

  cout << "done"<<endl;
  return 0;
}
