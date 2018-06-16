#include<stdio.h>
    int main(){
        int num,base=1,dec=0,rem;
        scanf("%d",&num);
        while(num>0){
            rem=num%10;
            dec=dec+rem*base;
            num=num/10;
            base=base*2;
        }
        printf("%d",dec);
        return 0;
    }

