#include <iostream>
using namespace std;
int main() {
    // Type your code here
  int n,i,j;
  cin>>n;
  for(i=1; i<=n;i++)
  {
    if(i%2==0)
    {
      printf("%d",i+1);
      for(j=1; j<n; j++)
        printf("%d",i);
    }
    else
    {
      for(j=1; j<n; j++)
        printf("%d",i);
      printf("%d",i+1);
    }
    printf("\n");
  }
    return 0;
}