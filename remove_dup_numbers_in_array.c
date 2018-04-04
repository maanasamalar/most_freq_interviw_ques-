#include<stdio.h>
int main()
{
    int a[50],b[50],flag=0,n,i,j,k=0;
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    for(i=0;i<n;i++)
    {
        flag=0;
        if(a[i]=='+')
        {
            continue;
        }
        for(j=i+1;j<n;j++)
        {
            if(a[i]==a[j])
            {
               a[j]='+';
               b[k]=a[i];
               k++;
                flag=1;
            }
           
        }
        if(flag!=1)
        {
            b[k]=a[i];
            k++;
        }
    }
    for(i=0;i<k;i++)
    {
        printf("%d ",b[i]);
    }
    return 0;
}
