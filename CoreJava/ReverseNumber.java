package CoreJava;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		reverseNumber(input);
	}

	private static void reverseNumber(int i) {
		String s = "";
		while (i > 0) {
			int reminder = i % 10;
			s = s + reminder;
			i = i / 10;
		}
		System.out.println(Integer.parseInt(s));
	}

	/*
	 * int remainder = number % 10; 
	 * reverse = reverse * 10 + remainder; 
	 * number = number/10;
	 */
}
