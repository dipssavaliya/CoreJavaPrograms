package CoreJava;

import java.util.Arrays;

public class facinatingNum {

	public static void main(String args[]) {
		boolean ans = facinatingNumer(3237);
		System.out.println(ans);
	}

	public static boolean facinatingNumer(int n) {

		String temp = String.valueOf(n) + String.valueOf(n * 2) + String.valueOf(n * 3);
		int count = 0;
		for (int i = 0; i <= temp.length(); i++) {
			char c1 = temp.charAt(i);
			if (c1 == i) {
				count++;
			} else {
				return false;
			}
		}
		return true;
	}
}
