package CoreJava;

//153 = 1^3+5^3+3^3=1+125+27=153
public class armstrong {

	public static void main(String[] args) {
		System.out.println(armstrongcal(153));
	}

	public static int armstrongcal(int n) {

		int total = 0;
	
		while (n > 0) {
			int reminder = n % 10;
			total += Math.pow(reminder, 3);
			n=n/10;
		}
		return total;
	}
}
