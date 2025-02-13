package com.tnsif.dayeleven.trycatch;

public class TryCatchExample {

	static void performDivision(int x, int y)
	{
		System.out.println("I am in method ");
		
		int z;
		try {
		
			System.out.println("I am in try block ");
			
			z=x/y;
			System.out.println("Result of z:"+z );
		}
		catch (ArithmeticException e)
		{
			System.err.println(e.getMessage());
		}
		
	}
	
	
}
