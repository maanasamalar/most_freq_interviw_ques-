import java.util.*;
import java.lang.*;
public class Contains{
  public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] a=new int[n];
      int i;
      for(i=0;i<n;i++)
      {
          a[i]=sc.nextInt();
      }
      int item;
      item=sc.nextInt();
      boolean found=false;
      for(int j:a){
          if(j==item)
          {
              found=true;
              break;
          }
      }
      if(found)
      {
          System.out.println("true");
      }
      else
        System.out.println("false");
      
      
  }  
}

