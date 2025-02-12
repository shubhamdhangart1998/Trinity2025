package com.tnsif.daynine.StringDemo;

public class StringComparison {

	public static void main(String[] args) {
		
		
		//creating string using literals //  pool memory 
		
		String s1="TNSIF";
		String s2= "TNSIF";
		
		//create new String obj // heap memory
		
		String s3=new String ("TNSIF");
		String s4=new String ("TNSIF");
		
		
		//== & equals 
		//== check memory space memory where data is locate 
		//eqauls  check the data
		
		System.out.println("Case 1:"+ (s1==s2));  // true
		System.out.println("Case 2: "+ (s1==s3));   //false
		System.out.println("Case 3 : "+ (s2.equals(s1)));  //true
		System.out.println("Case 4 :"+ (s2.equals(s4))); //true
		System.out.println("Case 5 : "+ (s3==s4));  // false
		System.out.println("case 6 :"+ (s3.equals(s4))); //true
		
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());

		System.out.println(s1.compareToIgnoreCase("tnsif"));
	}

}
