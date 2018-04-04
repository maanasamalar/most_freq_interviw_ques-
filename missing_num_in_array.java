import java.util.*;
import java.lang.*;
public class Missingnum{
    public static void main(String[] args)
    {
        int[] arr1={7,3,6,1,2,5};
        System.out.println(missnum(arr1));
        int[] arr2={3,2,4,5};
        System.out.println(missnum(arr2));
    }
    public static int missnum(int[] arr)
    {
        int n,i;
        n=arr.length+1;
        int sum;
        sum=n*(n+1)/2;
        int ressum=0;
        for(i=0;i<arr.length;i++)
        {
            ressum+=arr[i];
        }
        
        int miss=sum-ressum;
        return miss;
    }
}
