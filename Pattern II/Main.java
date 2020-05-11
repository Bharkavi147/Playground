#include<iostream>
int main()
{
  int n,i,j,k=1,a[1000][1000];
  std::cin>>n;
  for(i=0; i<n; i++)
  {
    for(j=0; j<=i; j++)
      a[i][j]=k++;
  }
  for(i=0; i<n; i++)
  {
    if(i%2==0)
    {
      for(j=0; j<=i; j++)
      {
        std::cout<<a[i][j];
        if(j<i)
          std::cout<<"*";
      }
    }
    else
    {
      for(j=i; j>=0; j--)
      {
        std::cout<<a[i][j];
        if(j>0)
          std::cout<<"*";
      }
    }
    printf("\n");
  }
    }