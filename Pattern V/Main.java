#include<iostream>
int main()
{
  int i,j,k=1,n,c=0;
  std::cin>>n;
  c=n*n+1;
  for(i=1; i<=n; i++)
  {
    for(j=1; j<i; j++)
      printf("--");
    for(j=0; j<=n-i; j++)
      printf("%d*",k++);
    for(j=0; j<=n-i; j++)
    {
      printf("%d",c++);
      if(j<n-i)
        printf("*");
    }
    c=c-2*j+1;
    printf("\n");
  }
}