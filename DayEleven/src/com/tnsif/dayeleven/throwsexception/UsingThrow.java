package com.tnsif.dayeleven.throwsexception;

import java.util.Scanner;

public class UsingThrow {

	
	static int acceptNumber()
	{
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		sc.close();
		return n;
		
	}
	
	public static void main(String[] args) {
		
		int per;
		System.out.println("Enter your percentage .....");
		
		per=acceptNumber();
		try {
			if(per<0)
				throw new negativeException();
			else if(per>100)
				throw new greaterValueException();
			else 
				System.out.println("valid percentage");
		}
		catch(negativeException | greaterValueException ae)
		{
			System.err.println("error ......."+ae.getMessage());
		}
	}
}
