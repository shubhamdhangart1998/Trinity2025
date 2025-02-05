package com.tnsif.dayseven.overloading;

public class OverLoadingDemo {

	public static void main(String[] args) {
		
		System.out.println("---------Constructor overloading ");
		
		Point p;
		
		
		p=new Point();
		System.out.println(p);
		
		p=new Point(32.54f);
		System.out.println(p);
		
		p=new Point(10.23f, 23.45f);
		System.out.println(p);
		
		
		System.out.println("------Method overloading---------");
		System.out.println("Addition of two interger "+ MethodOverLoading.addition(30, 32));
		System.out.println(MethodOverLoading.addition(34.23f, 23.56f));
		System.out.println(MethodOverLoading.addition(10, 20, 30));
		System.out.println(MethodOverLoading.addition("ABC ", "XYZ"));
		

	}

}
