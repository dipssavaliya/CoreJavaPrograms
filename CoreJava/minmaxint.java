package CoreJava;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result1 {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    int sum = 0;
    int min = Integer.MIN_VALUE;
    int minval;
    int[] minmaxarr = new int[arr.size()];
    for(int i=0;i<arr.size();i++)
    {
        for(int j=0;j<arr.size();j++)
        {
            sum=(sum+arr.get(j));
        }
       // minval = Math.min(min, sum);
        sum=sum-arr.get(i);
    //   System.out.println("sum "+sum);
       minmaxarr[i]=sum;
       sum=0;
    }
    java.util.Arrays.sort(minmaxarr);
    System.out.println(minmaxarr[0]);
    System.out.println(minmaxarr[minmaxarr.length-1]);
    }

}

public class minmaxint {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result1.miniMaxSum(arr);

        bufferedReader.close();
    }
}
