#include<stdio.h>
int main()
{
    int a[50],i,n;
    scanf("%d",&n);
    int max,min;
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    max=a[0];
    min=a[0];
    for(i=0;i<n;i++)
    {
        if(a[i]>max)
            max=a[i];
    }
    printf("%d",max);
    for(i=0;i<n;i++)
    {
        if(a[i]<min)
            min=a[i];
    }
    printf("\n%d",min);
    return 0;
}
