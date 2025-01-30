package com.tnsif.daythree.constructor;

public class Customer {

	
	//data members
	private String customerName;
	private int customerId;
	private String customerCity;
	
	//default constructor 
	public Customer() {
		System.out.println("default Constructor ");
	}

	//parametriozoed constructor 
	public Customer(String customerName, int customerId, String customerCity) {
		
		this.customerName = customerName;
		this.customerId = customerId;
		this.customerCity = customerCity;
	}
	
	//getter and setter method 

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

	//to string 
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", customerCity="
				+ customerCity + "]";
	}
	
	
	
	
	
	
	
	
	
}
