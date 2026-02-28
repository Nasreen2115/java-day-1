import java.util.*;
public class Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first string:");
        String str=sc.nextLine();
        System.out.println("enter the second string");
        String str1=sc.nextLine();
        System.out.println("Length:"+str.length());
        System.out.println("Uppercase:"+str.toUpperCase());
        System.out.println("Lower case:"+str.toLowerCase());
        System.out.println("Substring:"+str.substring(2,6));
        System.out.println("contains:"+str.contains("as"));
        System.out.println("replace:"+str.replace("a","i"));
        System.out.println("charecter at:"+str.charAt(5));
        System.out.println("equals to :"+str.equals("Nasreen"));
        System.out.println("starts"+str.startsWith("k"));
        System.out.println("ends with"+str.endsWith("i"));
        System.out.println("last index:"+str.lastIndexOf("k"));
        System.out.println("Index:"+str.indexOf("k"));
        


    
}
}

