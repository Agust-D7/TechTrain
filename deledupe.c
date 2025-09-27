#include<stdio.h>
int main()
{
int n, i, j, k;
char a[100];
scanf("%d",a);
for (i=0;a[i]!='\0';i++)
{
for(j=i+1;j<n;j++)
{
if (a[i]==a[j])
{
for (k=j;k<n;k++)
a[k]=a[k+1];
j--;n--;
}
}
}
printf("%s",a);
}
