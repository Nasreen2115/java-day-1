import java.util.*;
public class Reverse_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string:");
        String s=sc.nextLine();
        String reverse="";
        for(int i=s.length()-1;i>=0;i--)
        {
            reverse=reverse+s.charAt(i);

        }
        System.out.println("reverse string:"+reverse);
    }
    
}
