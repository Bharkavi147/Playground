#include<iostream>
using namespace std;
int main()
{
  int k,n=0,c,a=1,b=1,i=0;
  cin>>k;
  c=k*k;
  while(c>0)
  {
    n++;
    c/=10;
  }
  c=k*k;
  while(i<n/2)
  {
    a*=10;
    i++;
  }
  i=0;
  while(i<(n-n/2))
  {
    b*=10;
    i++;
  }
  if((c/a)+(c%b)==k)
    cout<<"Kaprekar Number";
  else
    cout<<"Not a Kaprekar Number";
  //Type your code here.
}