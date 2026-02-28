
        import java.util.*;


public class Arr3 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int array[]=new  int[3];
        int sum=0;
        System.out.println("Array elements:");
        for(int i=0;i<array.length;i++)

        {
            
            array[i]=sc.nextInt();
            
        }
        for(int j=0;j<array.length;j++)
        {
       System.out.println(array[j]);
        sum+=array[j];
        //System.out.println("sum:"+sum);
       

        }
        System.out.println("sum:"+sum);
        
    

}
}

    
    

