#include<stdio.h>
#include<stdlib.h>
void main()
{
    int n=0;
    printf("\nEnter the number of rows and column");
    scanf("%d",&n);
    n=n*2-1;
    int k=n/2;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            int r=i<j?i:j;
            int res=abs(n-i-1)<abs(n-j-1)?abs(n-i-1):abs(n-j-1);
            r=r<res?r:res;
            printf("%d ", r+1);
        }
        printf("\n");
    }
}
