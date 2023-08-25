package com.example.demo;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class arraytwod {
	
	  public static int hourGlass(List<List<Integer>> arr){
	        int R = 6;
	        int C = 6;
	        int maxSum = Integer.MIN_VALUE;
	        
	        for (int i = 0; i <= R - 3; i++){
	            for (int j = 0; j <= C - 3; j++){
	                int sum = (arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2)) +
	                (arr.get(i + 1).get(j + 1)) + 
	                (arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2));
	                 
	                maxSum = Math.max(maxSum, sum);               
	            }
	        }
	        System.out.println(maxSum);
	        return maxSum;
	    }
	
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		List<List<Integer>> arr = new ArrayList<>();

		for (int i = 0; i < 6; i++) {
			String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

			List<Integer> arrRowItems = new ArrayList<>();

			for (int j = 0; j < 6; j++) {
				int arrItem = Integer.parseInt(arrRowTempItems[j]);
				arrRowItems.add(arrItem);
			}

			arr.add(arrRowItems);

		}
		arraytwod.hourGlass(arr);
		bufferedReader.close();
	
	}
}
