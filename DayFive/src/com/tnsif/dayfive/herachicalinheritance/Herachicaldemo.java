package com.tnsif.dayfive.herachicalinheritance;

public class Herachicaldemo {

	public static void main(String[] args) {
		
		//which object has to be created
		Person p1=new Person();
		System.out.println("------Person Details-------------");
		System.out.println(p1);

		Person p;
		p= new Person("Pravin", "Pune");
		System.out.println("Person Details :"+ p);
		
		p=new Employee("Nikita", "Mumbai", 1001, 50000f, "IT");
		System.out.println("Employee details : "+ p);
		
		p=new Student("Aditya", "Nashik", "SY", 78.89f);
		System.out.println("Students details : "+ p);
		
	}

}
