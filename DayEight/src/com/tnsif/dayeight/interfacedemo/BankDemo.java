package com.tnsif.dayeight.interfacedemo;

public class BankDemo {

	public static void main(String[] args) {
		
		SavingAccount s1=new SavingAccount("Mamta", "Pune", 123456, 17000);
		
		s1.deposit(27000);
		System.out.println(s1);
		
		s1.withdraw(30000);
		System.out.println(s1);
		
		s1.withdraw(5500);
		System.out.println(s1);

	}

}
