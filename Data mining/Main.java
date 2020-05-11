#include<iostream>
using namespace std;
int main()
{
  int n,a=0,b=0;
  cin>>n;
  while(n>0)
  {
    if(n>0)
      a+=n%10;
    n/=10;
    if(n>0)
      b+=n%10;
    n/=10;
  }
  if(a==b)
    cout<<"Yes";
  else
    cout<<"No";
  
  //Type your code here.
}