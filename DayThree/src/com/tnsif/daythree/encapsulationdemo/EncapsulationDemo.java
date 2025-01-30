package com.tnsif.daythree.encapsulationdemo;

public class EncapsulationDemo {

	public static void main(String[] args) {
		
		
		//object creation 
		OopsConceptDemo obj=new OopsConceptDemo();
		
		
		//set method or else by para constructor 
		obj.setName("Shubham ");
		obj.setAge(25);
		obj.setSerialNumber(1001);
		

		//getting the values we have getter method and to.string method
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		System.out.println(obj.getSerialNumber());
		
		
		System.out.println(obj);
		
	}

}
