#include<stdio.h>
int main()
{
    int n,rem,bin=0,base=1,count=0;
    scanf("%d",&n);
    while(n>0){
         rem=n%2;
         if(rem==1)
         {
        count++;
         }
    bin=bin+rem*base;
    n=n/2;
    base=base*10;
    }
    printf("%d",bin);
    return 0;
    
}
