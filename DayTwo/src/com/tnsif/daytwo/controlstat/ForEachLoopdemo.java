package com.tnsif.daytwo.controlstat;

public class ForEachLoopdemo {

	public static void main(String[] args) {
		
		
		// a
		int a[]= {10,20,30,40,50};
		
		//for integer array

		for(int i : a )
		{
			System.out.println(i);
		}
		
		char ch[]= {'J','a','v','a'};
		
		for (char c: ch)
		{
			System.out.print(c);
		}
		
		System.out.println();
		
		String s1[]= {"Java", " Programmming"," Learning "};
		
		for(String s: s1)
		{
			System.out.print(s +" ");
		}
		

	}

}
