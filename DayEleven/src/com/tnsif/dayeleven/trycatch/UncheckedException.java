package com.tnsif.dayeleven.trycatch;

public class UncheckedException {

	public static void main(String[] args) {
		
		int x[];
		try {
			x=new int[] {1,2,3,4,5};  // index till 4
			
			System.out.println(x[3]);  // excdeption 
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.err.println(e.getMessage());
		}

	}

}
