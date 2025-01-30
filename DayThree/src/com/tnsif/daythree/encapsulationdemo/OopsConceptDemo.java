package com.tnsif.daythree.encapsulationdemo;


//entity class 
public class OopsConceptDemo {

	
	//data members 
	private int serialNumber;
	private String name;
	private int age;

	//getter and setter method 
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//object class method - to return string representation of the object 
	@Override
	public String toString() {
		return "OopsConceptDemo [serialNumber=" + serialNumber + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}
