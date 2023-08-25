package CoreJava;

//*
//**
//***
public class StarPattern {
	public static void main(String[] args) {
		star(5);
	}

	public static void star(int n) {
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}
