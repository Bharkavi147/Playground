#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  float c=0;
  while(scanf("%d",&n)==1)
  {
    if(n<0)
      c-=1.0;
    else if(n%2==0)
      c-=0.5;
    else
      c+=1.0;
  }
  printf("%.1f",c);
}