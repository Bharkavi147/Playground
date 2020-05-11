#include<iostream>
using namespace std;
int main()
{
  int m,i,a=0,b=1,c=1,n=0;
  cin>>m;
  for(i=0;i<m; i++)
  {
    n=a;
    a=b;
    b=c;
    c=a+b;
  }
  cout<<n;
  //Type your code here.
}