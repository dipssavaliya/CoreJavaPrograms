package Fact;

public class Nto1 {
	
	public static void main(String[] args)
	{
		fact(5);
	}
	static void fact(int n)
	{
		if(n<=0)
		{
			return;
		}
		System.out.println(n);
		fact(n-1);
		System.out.println(n);
	}

}
