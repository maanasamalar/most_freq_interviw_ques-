import java.util.*;
public class permutationn{
    public static void permute(char[] a,int k){
        if(k==a.length){
            for(int i=0;i<a.length;i++){
                System.out.print(a[i]);
            }
            System.out.println();
        }
        else
        {
            for(int i=k;i<a.length;i++){
                char temp=a[k];
                a[k]=a[i];
                a[i]=temp;
                permute(a,k+1);
                temp=a[k];
                a[k]=a[i];
                a[i]=temp;
            }
        }
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char[] seq=new char[n];
        for(int i=0;i<n;i++){
            seq[i]=sc.next().charAt(0);
        }
        permute(seq,0);
        }
    
}
