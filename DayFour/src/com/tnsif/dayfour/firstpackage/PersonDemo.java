package com.tnsif.dayfour.firstpackage;

public class PersonDemo {

	public static void main(String[] args) {
		
		
		Person p1=new Person();
		p1.setPersonName("shubham");
		p1.setPersonAge(34);
		
		
		System.out.println(p1);
		Person p2=new Person("Akash", 23);
		System.out.println(p2);
		

	}

}
