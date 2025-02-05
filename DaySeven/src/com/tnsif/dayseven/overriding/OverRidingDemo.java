package com.tnsif.dayseven.overriding;

public class OverRidingDemo {

	public static void main(String[] args) {
		
		RBI rbi;
		
		
		//dynamic binding assiging child class object to parent class reference varible 
		
		rbi=new HDFC();
		System.out.println(rbi.getRateOfInterested());
		
		rbi=new ICICI();
		System.out.println(rbi.getRateOfInterested());

		
	}

}
