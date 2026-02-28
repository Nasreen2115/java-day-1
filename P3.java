public class P3 {
    public static void main(String[] args) {
        int i,j;
        int n=10;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(j==1||j==n||i==j||i+j==n+1)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println("");
        }
    }
    
}

    

