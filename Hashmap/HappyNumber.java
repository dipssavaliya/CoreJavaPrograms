package Hashmap;

public class HappyNumber {

	public static void main(String[] args) {
		System.out.println(isHappy(19));
	}

	public static boolean isHappy(int n) {
		int ans =0;
		while(n==1)
		{	
	        int rem = n%10;
	        ans+=rem*rem;
	        n/=10;	
		}
		return false;
	}
}
