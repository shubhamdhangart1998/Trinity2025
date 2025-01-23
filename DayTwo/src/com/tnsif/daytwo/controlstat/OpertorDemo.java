package com.tnsif.daytwo.controlstat;

public class OpertorDemo {

	public static void main(String[] args) {
		
		
		int a=10;
		int b=20;
		int x=10;
		
		//++    --
		
		System.out.println("a and b value before the operator : " + a +  " "+ b);
		
		++a; //11
		
		
	//	     12    20    12    
		int c=++a + b + a-- ;   //42, 44
		System.out.println("C value after the operator : "+ c);
		
		
		//    44    11   20
		int d=c++ + a + b--;  
		System.out.println("D value after the operator : "+ d);
		

	}

}
