#include<stdio.h>
int fun();
int main (){
    int x=10; 
    int c=++x - ++x + ++x -  ++x;
    printf("%d",c);
}
