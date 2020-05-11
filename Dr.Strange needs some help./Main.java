#include<iostream>
int main()
{
  int m,n,r,c=1;
  std::cin>>m>>n>>r;
  for(int i=1; i<=n; i++)
  {
    c=c*m;
  }
  if(c>=r)
  std::cout<<"Doctor, you can proceed with your experiment.";
  else
    std::cout<<"Sorry Doctor! You need more bacteria.";
}
    
  