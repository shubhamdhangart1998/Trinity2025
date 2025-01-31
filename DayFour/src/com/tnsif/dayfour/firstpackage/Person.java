package com.tnsif.dayfour.firstpackage;

public class Person {

	private String personName;
	private int personAge;
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	
	
	public Person() {
		System.out.println("Default constructor ");
	}
	
	//para constructor
	public Person(String personName, int personAge) {
	System.out.println("Para COnstructor ");
		this.personName = personName;
		this.personAge = personAge;
	}
	@Override
	public String toString() {
		return "Person [personName=" + personName + ", personAge=" + personAge + "]";
	}
	
	
	
	
	
	
	
	
}
