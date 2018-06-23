import java.util.*;
public class Anagram{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        if(s1.replaceAll(" ","").length()==s2.replaceAll(" ","").length()){
            char[] ch1=s1.toLowerCase().toCharArray();
            char[] ch2=s2.toLowerCase().toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1,ch2)){
            System.out.println("It is Anagram");
        }
        else{
            System.out.println("its not an anagram");
        }
        }
        else
            System.out.println("its not an anagram");
        
    }
}
