import java.util.*;
import java.util.Scanner;
public class lcmofarrays{
    static int lcm(int a,int b){
        if(b==0){
            return a;
        }
        return lcm(b,a%b);
    }
    static int lcmcal(int[] a,int n){
        int res=a[0];
        for(int i=1;i<n;i++){
            res=(a[i]*res)/(lcm(a[i],res));
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
        int result=lcmcal(arr,num);
        System.out.println(result);
    }
    
}
