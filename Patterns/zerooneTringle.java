package CoreJavaPrograms.Patterns;

public class zerooneTringle {
    public static void main(String[] args) {
        zerooneTringle(5);
    }

    private static void zerooneTringle(int n) {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print("0");
                }
              
            }
              System.out.println();
        }
    }
    
}
