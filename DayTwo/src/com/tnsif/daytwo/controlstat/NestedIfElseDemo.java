package com.tnsif.daytwo.controlstat;

public class NestedIfElseDemo {

	public static void main(String[] args) {
	
		
		int a=10, b=20, c=45;
		
		System.out.println("the largest No is ");
		
		if(a>b)
		{
			if(a>c) {
				System.out.println(a);
			}
			else
			{
				System.out.println(c);
			}
		}
		else
		{
			if(c>b)
			{
				System.out.println(c);
			}
			else {
				System.out.println(b);
			}
		}

	}

}
