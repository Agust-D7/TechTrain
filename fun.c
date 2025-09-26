#include<stdio.h>
int fun();
int main (){
    for (fun();fun();fun())
    {
        printf("%d",fun());
    }
    return 0;
}
int fun(){
    int static num=10;
    return num--;
}
