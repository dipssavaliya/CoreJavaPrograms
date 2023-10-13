package CoreJavaPrograms.Patterns;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        patternInverted(5);           
    }

    private static void patternInverted(int r) {
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=(r-i+1);j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }  
  }
}
