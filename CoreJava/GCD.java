package CoreJava;

public class GCD {

	public static void main(String args[]) {
		findgcd(12, 8);
	}

	public static void findgcd(int a1, int a2) {
		int gcd = 1;
		for (int i = 1; i <= a1 && i <= a2; i++) {
			// returns true if both conditions are satisfied
			if (a1 % i == 0 && a2 % i == 0)
				// storing the variable i in the variable gcd
				gcd = i;
		}
		System.out.println("GCD: " +gcd);
	}
}
