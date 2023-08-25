package com.example.demo;

import java.util.Scanner;

public class Solution1 {

	public static void main(String[] argh) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of loop: ");
		int t = sc.nextInt();
		System.out.println("short neative power- " + (int)(-(Math.pow(2, 16))));
		System.out.println("int neative power- " +  (int)(-(Math.pow(2, 32))));
		System.out.println("long neative power- " + (long)(-(Math.pow(2, 64))));
		
		for (int i = 0; i < t; i++) {

			try {
				System.out.println("Enter Number: ");
				long x = sc.nextLong();
				System.out.println(x + " can be fitted in:");
				if (x >= -128 && x <= 127)
					System.out.println("* byte");
				if (x >= (int)(-(Math.pow(2, 16))) && x <= (int)(Math.pow(2, 16))) {
					System.out.println("* short");
				}
				if (x >= (int)(-(Math.pow(2, 32))) && x <= (int)(Math.pow(2, 32)))
					System.out.println("* int");

				if (x >= (long)(-(Math.pow(2, 64))) && x <= (long)(Math.pow(2, 64)))
					System.out.println("* long");
				if (x > (long)(Math.pow(2, 64)))
					System.out.println("can't be fitted anywhere.");
			}
			// Complete the code

			catch (Exception e) {
				System.out.println(sc.next() + " can't be fitted anywhere.");
			}

		}
	}
}
