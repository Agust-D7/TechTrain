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
            int res = abs(i-k) > abs(j-k) ? abs(i-k) : abs(j-k);
            // Reverse the number for inward pattern
            printf("%d ", k+1 - res);
        }
        printf("\n");
    }
}

