#include<stdio.h>
int main(){
    int n,max,smax,i;
    int a[50];
    scanf("%d",&n);
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    if(a[0]>a[1]){
        max=a[0];
        smax=a[1];
    }
    else{
        max=a[1];
        smax=a[0];
    }
    for(i=2;i<=n;i++){
        if(a[i]>max){
            smax=max;
            max=a[i];
        }
        else if(a[i]>smax){
            smax=a[i];
        }
    }
    printf("%d",smax);
return 0;
}
