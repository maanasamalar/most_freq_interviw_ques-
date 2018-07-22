/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GCD{
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
		int num1,num2,gcdres=1;
		num1=sc.nextInt();
		num2=sc.nextInt();
		for(int i=1;i<=num1 && i<=num2;i++){
		    if(num1%i==0 && num2%i==0){
		        gcdres=i;
		    }
		}
		int lcm=(num1*num2)/gcdres;
		System.out.println(gcdres);
		System.out.println(lcm);
	}
}
