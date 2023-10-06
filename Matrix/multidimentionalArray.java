package Matrix;
import java.util.Arrays;
import java.util.Scanner;

public class multidimentionalArray
{
    public static void main(String[] args) {
        int[][] arr = new int[3][];
        int[][] arr1 = {
            {1,2,3},
            {4,5},
            {6,7,8,9}
        };
           Scanner sc = new Scanner(System.in);
            for(int row=0;row<arr1.length;row++)
            {
                for(int col=0;col<arr1[row].length;col++)
                {
                    arr1[row][col]=sc.nextInt();
                }
            }
            System.out.println("Printing Array::");
            for(int row=0;row<arr1.length;row++)
            {
                for(int col=0;col<arr1[row].length;col++)
                {
                     
                    System.out.print(arr1[row][col]+" ");
                }
                System.out.println();
            }

            System.out.println("Printing toString format::");
            for(int row=0; row<arr1.length;row++)
            {
                System.out.println(Arrays.toString(arr1[row]));
            }

            System.out.println("Enhanced for loop");
            for(int[] a:arr1)
            {
                System.out.println(Arrays.toString(a));
            }
    }
}