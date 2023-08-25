package com.example.demo;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hashsetExample {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		String[] pair_left = new String[t];
		String[] pair_right = new String[t];

		for (int i = 0; i < t; i++) {
			pair_left[i] = s.next();
			pair_right[i] = s.next();
		}
		HashSet<String> set = new HashSet<>();
		for (int i = 0; i < t; i++) {
			set.add(pair_left[i]);
			set.add(pair_right[i]);
		}
		
		for (int i = 0; i < t; i++)
		{
			System.out.println(set);
		}

	}
}