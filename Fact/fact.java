package Fact;

public class fact {

	public static void main(String[] args)
	{
		int ans=factReturnValue(5);
				System.out.println(ans);
	}

	 static int factReturnValue(int n) {
		if(n<=1) {
		return 1;}
		
		return n*factReturnValue(n-1);
	}
	
}
