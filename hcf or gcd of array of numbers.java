import java.util.*;
import java.util.Scanner;
public class gcdofarrays{
    static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
    static int gcdcal(int[] a,int n){
        int res=a[0];
        for(int i=1;i<n;i++){
            res=gcd(a[i],res);
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        int result=gcdcal(arr,num);
        System.out.println(result);
    }
    
}
