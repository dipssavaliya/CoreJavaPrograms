package CoreJavaPrograms.Patterns;

public class HollowRohmbus {
    public static void main(String[] args) {
        hollowrhombus(5,5);
    }

    private static void hollowrhombus(int n, int c) {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++)
            {
                if(i==1||j==1||i==n||j==c)
                {
                System.out.print("*");
                }
                else
                {
                System.out.print(" ");
                }
            }
            for(int j=1;j<=(i-1);j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
