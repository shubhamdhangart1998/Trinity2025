package com.tnsif.dayfive.herachicalinheritance;

public class Student extends Person {

	
	private String std;
	private float percentage;
	
	//default constructpor 
	public Student() {
		System.out.println("Student class default constructor ");
		std="FY";
		percentage=70f;
	}

	public Student(String name, String city,String std, float percentage) {
		super( name,  city);
		this.std = std;
		this.percentage = percentage;
	}

	public String getStd() {
		return std;
	}

	public void setStd(String std) {
		this.std = std;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Student [std=" + std + ", percentage=" + percentage + ", getName()=" + getName() + ", getCity()="
				+ getCity() + "]";
	}
	
	
	
	
	
}
