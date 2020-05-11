#include<iostream>
int main()
{
  int n,i,j;
  std::cin>>n;
  for(i=0; i<4; i++)
  {
    for(j=0; j<=i; j++)
    {
      std::cout<<n;
    }
    n++;
    std::cout<<"\n";
  }
  n--;
  for(i=4; i>0; i--)
  {
    for(j=0; j<i; j++)
      std::cout<<n;
    n--;
    std::cout<<"\n";
  }
}