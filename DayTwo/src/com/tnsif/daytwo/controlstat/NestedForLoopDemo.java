package com.tnsif.daytwo.controlstat;

public class NestedForLoopDemo {

	public static void main(String[] args) {
		
		
		//write a program to print the multiplicatication of table
		
		
		int beg=10;
		int end=15;
		
		
		//10 * 1 =10
		for(int i=beg; i<=end; i++)
		{
			for(int j=1; j<=10; j++)
			{
				System.out.println(i + "*" + j +"="+ i*j);
			}
		}
		
		System.out.println();
		

	}

}
