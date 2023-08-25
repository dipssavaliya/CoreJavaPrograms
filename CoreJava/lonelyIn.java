package com.example.demo;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.*;
import java.util.regex.*;



	public class lonelyIn {

		public static void main(String[] args) {
			lonelyIn l = new lonelyIn();

			List<Integer> a = new ArrayList<>();

			a.add(0);
			a.add(0);
			a.add(1);
			a.add(2);
			a.add(1);

			int result = lonelyinteger(a);

			System.out.print(result);
		}
		public static int lonelyinteger(List<Integer> a) {
			Integer unique = null;
	        for (int i = 0; i < a.size(); i++) {
	            if (a.contains(a.get(i))) {
	                Integer temp = a.get(i);
	                a.remove(i);
	                if(a.contains(temp)) {
	                    a.add(i, temp);
	                } else {
	                    unique = temp;
	                }
	            }
	        }
	        
	        return unique;
	}
}
