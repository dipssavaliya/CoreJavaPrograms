package CoreJava;

public class PrimeNumber {

	public static void main(String[] args) {
		prime(7);
	}

	public static void prime(int n) {
		if(n%2==0)
		{
			System.out.println("Not a prime number");
		}
		else
		{
			System.out.println("prime number");
		}
	}
}
