#include<stdio.h>
#include<stdlib.h>
#include<math.h>
int main(){
	char a[100];
	scanf("%s",a);
	int hr, min, m, n=strlen(a);
	scanf("%d",&m);
	hr=(a[0]-48)*10+a[1]-48;
	min=(a[3]-48)*10+a[4]-48;
	if(hr>23||min>60||a[2]!=':'||n!=5)
	{
		printf("Invalid input");
		return;
	}
	min=min+m+hr*60;
	hr=min/60%24;
	min=min%60;
	if (hr>12)
	printf("%02d:%02d AM",hr-12,min);
	else
	printf("%02d:%02d AM",hr,min);
}

