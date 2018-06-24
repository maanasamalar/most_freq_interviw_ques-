import java.util.*;
class fact{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,i,j,u=0,count=0,sum=0;
        n=sc.nextInt();
        int a[]=new int[n];
         int b[]=new int[n];
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++){
            count=0;
            for(j=1;j<=a[i];j++)
            {
                if(a[i]%j==0)
                {
                    count++;
                }
            }
            //System.out.println(count);
                if(count==3)
                {
                    b[u]=a[i];
                    u++;
                }
                }
                for(i=0;i<u;i++)
                {
                    sum+=b[i];
                    
                }
                System.out.print(sum);
            }
        }
