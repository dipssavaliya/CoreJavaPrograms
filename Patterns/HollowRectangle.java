package CoreJavaPrograms.Patterns;

public class HollowRectangle
{
    public static void main(String[] args) {
        pattern(5,10);
    }

    public static void pattern(int r, int c)
    {
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=c;j++)
            {
                if(i==1 || j==1 || i==r || j==c)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
               
            }
             System.out.println();
        }
    }
}