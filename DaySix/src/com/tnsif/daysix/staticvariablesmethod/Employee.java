package com.tnsif.daysix.staticvariablesmethod;

public class Employee {

	
	//declare inswtance varible
	private String name;
	private int id;
	
	//declare a static varible companyname with a data type string
	
	static String companyName="TNS";
	//declare para constructor 
	public Employee(String name, int id) {
		
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", Company =" +companyName+"]";
	}
	
	
	
	
	
}
