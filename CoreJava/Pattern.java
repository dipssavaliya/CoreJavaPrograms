package com.example.demo;

public class Pattern {
	
	public static void main(String[] args)
	{
		pattern28(5);
	}

	private static void pattern28(int n) {
		for(int row=0; row<n;row++)
		{
			for(int col=0;col<=row;col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
