package CoreJavaPrograms.Patterns;

public class SolidRhombus {
    public static void main(String[] args) {
        paternRhombus(5);    
    }

    private static void paternRhombus(int n) {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=(i-1);j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
