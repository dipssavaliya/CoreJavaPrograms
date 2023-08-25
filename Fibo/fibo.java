package Fibo;

public class fibo {
	
	public static void main(String[] args)
	{
		System.out.println(fiboFormula(5000));
	}
	//linear recuurance
	static long fiboFormula(int n)
	{
		return (long)(Math.pow(((1+Math.sqrt(5))/2), n)/Math.sqrt(5));
	}
	
	public static int fibos(int n)
	{
		if(n<2)
		{
			return n;
		}
		return fibos(n-1)+fibos(n-2);
	}
}
