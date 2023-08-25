package Bitwise;

public class powerOf2 {
	
	public static void main(String[] args)
	{
		int n= 32;
		boolean ans = (n&(n-1))==0;
		System.out.print(ans);
	}

}
