package com.tnsif.dayfive.singleinheritance;

public class Citizen {

	//data members 
	
	private String name;
	private String adharNo;
	private String address;
	private long phoneNo;
	
	//default constructor 
	public Citizen() {
		System.out.println("Citizen object created ");
	}

	//para constructor 
	public Citizen(String name, String adharNo, String address, long phoneNo) {
		
		this.name = name;
		this.adharNo = adharNo;
		this.address = address;
		this.phoneNo = phoneNo;
	}

	//getter and setter 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	//to string
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", adharNo=" + adharNo + ", address=" + address + ", phoneNo=" + phoneNo + "]";
	}
	
	 
	
	
	
	
	
}
