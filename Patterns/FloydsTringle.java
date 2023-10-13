package CoreJavaPrograms.Patterns;

public class FloydsTringle {
    public static void main(String[] args) {
        tringle(5);
    }
    static int count=0;
    private static void tringle(int n) {
    
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(++count+" ");
            }
             System.out.println();
        }
       
    }
    
}
