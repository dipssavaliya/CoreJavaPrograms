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

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
     int positivecoount =0;
        int negativecount =0;
        int zero =0;
        int total = arr.size();
    for(int i=0;i<arr.size();i++)
    {
       
        //System.out.println(total);
        if(arr.get(i)>0) positivecoount++;
        if(arr.get(i)<0) negativecount++;
        if(arr.get(i)==0) zero++;
       
        
    } 
    System.out.println(positivecoount/total);
          System.out.println(negativecount/total);
          System.out.println(zero/total);

    }

}

public class SolutionT1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}

