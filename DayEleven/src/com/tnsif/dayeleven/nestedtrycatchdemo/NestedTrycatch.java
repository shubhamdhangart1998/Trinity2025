package com.tnsif.dayeleven.nestedtrycatchdemo;

public class NestedTrycatch {

	
	public static void check()
	{
		String str="TNS";  //3
		int slength=str.length();
		
		System.out.println(" String lenght :"+ slength);
		
		String anotherString= null;
		
		int y=6;
		
		try {
			//inner try block 
			try {
				System.out.println(str.charAt(y));  //Exception 
			}
			catch (StringIndexOutOfBoundsException e)
			{
				System.err.println("Index is out of bounds "+ e.getMessage());
			}
			System.out.println("String length : "+ anotherString.length()); //null
		}
		//outer catch block 
		catch (NullPointerException e)
		{
			System.err.println("Exception is thrown "+ e.getMessage());
		}
	}

	
	
}
