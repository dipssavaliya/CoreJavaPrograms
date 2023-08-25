package CoreJava;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorialcal(5));
	}

	public static int factorialcal(int n) {
		int ans = 1;
		for (int i=n;i>1;i--) {
			ans =ans*i;
		

		}
		return ans;
	}
}
