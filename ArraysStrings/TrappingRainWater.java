package ArraysStrings;

import java.util.Arrays;

public class TrappingRainWater
{
    public static void main(String[] args) {
        int[] arr={4,2,0,6,3,2,5};
        System.out.println("Trapped Water is : "+trappingRainWater(arr));
    }

    private static int trappingRainWater(int[] arr) {
        int n= arr.length;
        if(arr.length<=2)
        {
            return 0;
        }
        int[] leftArray=new int[n];
        int[] rightArray=new int[n];

         leftArray[0]=arr[0];
        //left subaarray boundry cal
        for(int i=1;i<n;i++)
        {
           leftArray[i]=Math.max(arr[i], leftArray[i-1]);
        }
        //right subarray bounday cal
         rightArray[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            rightArray[i]=Math.max(rightArray[i+1], arr[i]);
        }
       // System.out.println("left Array : "+Arrays.toString(leftArray));
        //System.out.println("right Array : "+Arrays.toString(rightArray));
       
        int trappedWater =0;
        for(int i=0;i<arr.length;i++)
        {
            int waterLevelminheigth= Math.min(leftArray[i],rightArray[i]);
             trappedWater += waterLevelminheigth-arr[i];
        }
       return trappedWater;
    }
}