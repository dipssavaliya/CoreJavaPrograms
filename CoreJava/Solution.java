package com.example.demo;
import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
       
		while(testCases>=0 && in.hasNext()){
			//Write your code
              String pattern = in.nextLine();
           if(!pattern.isEmpty()){
              try
              {
                 java.util.regex.Pattern.compile(pattern);
                 System.err.println("Valid");
              }
              catch(PatternSyntaxException  e){
               System.out.println("Invalid");
              
              }
              finally{
              testCases--;}}
		}
	}
}
