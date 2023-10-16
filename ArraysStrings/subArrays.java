package CoreJavaPrograms.ArraysStrings;

public class subArrays
{
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6};
        subArraysMethod(arr);
    }

    private static void subArraysMethod(int[] arr) {
      
        for(int i=0;i<arr.length;i++)
        {  int start=i;
            for(int j=i;j<arr.length;j++)
            {   int end=j;
                int sum=0;
                for(int k=start;k<=end;k++)
                {
                System.out.print(arr[k] +" ");
                sum = sum+arr[k];
                }
                System.out.println("sum of subarrays are: "+sum);
                System.out.println();
            }
            System.out.println();
        }
    }
}