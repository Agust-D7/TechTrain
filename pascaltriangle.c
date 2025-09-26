#include<stdio.h>
#include<math.h>
int main(){
int n, i, j, c;
scanf("%d",&n);
for(i=1;i<=n;i++)
{
	c=1;
	for(j=1;j<=n;j++)
	{
		printf(" ");
	}
	for(j=1;j<=i;j++)
	{
		printf("%d",c);
		c=c*(i-j)/j;
	}
	printf("\n");
}
}
