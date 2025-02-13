package com.tnsif.dayeleven.trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {

	public static void divide()
	{
		int a,b,c;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter two number ");
		
		try {
			a=sc.nextInt();
			b=sc.nextInt();
			
			c=a/b;
			
			
			System.out.println("Division is "+ c);
					
		}
		catch(ArithmeticException e)
		{
			System.err.println("Arithmetic exception "+e.getMessage());
		}
		catch(InputMismatchException   | ArrayIndexOutOfBoundsException | NullPointerException e)
		{
			System.err.println("Exception caught" +e.getMessage());
		}
		catch(Exception e)
		{
			System.err.println("Exception caught" +e.getMessage());
		}
		
		
		
		finally {
			sc.close();
			
			System.out.println("Finally block ");
		}
		
		
	}
	
}
