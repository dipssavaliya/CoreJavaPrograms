package CoreJava;

// sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.

public class Fibonacci {

	public static void main(String[] args) {
		fibonaci(10);
	}

	private static void fibonaci(int count) {

		int i1 = 0;
		int i2 = 1;
		int total = 0;
		
			for (int j = 2; j < count; j++) {
				total=i1+i2;
				System.out.println(total);
				i1=i2;
				i2=total;
				
			}
		
	}
}
