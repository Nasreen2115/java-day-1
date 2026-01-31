import java.util.Scanner;
public class User {
    public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the age");
    int age=sc.nextInt();
    float f=sc.nextFloat();
    double d=sc.nextDouble();
    String s1=sc.nextLine();
    String s2=sc.next();
    
    System.out.println(age);
    System.out.println(f);
    System.out.println(d);
    System.out.println(s1);

}    
}

