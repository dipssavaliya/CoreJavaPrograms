package CoreJava;

public class sunnyNumber {
	public static void main(String[] args) {
		sunny(80);
	}
	public static void sunny(int num)
	{
		int temp=num+1;
		double sqrt = Math.sqrt(temp);
		if(sqrt-Math.floor(sqrt)==0)
		{
			System.out.println("sunny number");
		}
		else
		{
			System.out.println("Not a sunny number");
		}
	}
}
