package com.tnsif.daytwo.controlstat;

public class DecisionMakingOperator {

	public static void main(String[] args) {
	
		int x=8, y=7;
		int a=10;
		int b=11;
		
		
		if(x>= y)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}

		//a=10, b=11
	//    (a>b    and  a=! b
		if(!(a<b) || (a == b))
		{
			System.out.println("Condition is true ");
		}
		
		else 
		{
			System.out.println("Condition is false ");
		}
	}

}
