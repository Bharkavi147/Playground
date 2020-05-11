#include<iostream>
int main()
{
  int n,i,j;
  std::cin>>n;
  for(i=1; i<=n; i++)
  {
    for(j=1; j<=i; j++)
    {
      printf("%d",i);
      if(j<i)
        std::cout<<"*";
    }
    std::cout<<"\n";
  }
  for(i=n; i>0; i--)
  {
    for(j=0; j<i; j++)
    {
      std::cout<<i;
      if(j<i-1)
        printf("*");
    }
    printf("\n");
  }
}