import java.io.*;

class GFG {
	public static void main (String[] args) {
		String s="AaBbCcDdEeFf";
		byte[] b=s.getBytes();// using getBytes funtion 
		for(int i=0;i<b.length;i++)
		{
		    System.out.println(b[i]);
		}
		
	}
}
