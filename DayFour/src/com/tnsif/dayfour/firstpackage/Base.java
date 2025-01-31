package com.tnsif.dayfour.firstpackage;

public class Base {

	//declare variables and method of public, protected, private and default
	
	int varDefault = 10;
	public int varPublic=20;
	private int varPrivate=30;
	protected int varProtected=40;
	
	//methods
	
	void methodDefault()
	{
		System.out.println("Default access Base class");
		System.out.println("Default  varible : "+ varDefault);
	}
	
	public void methodPublic()
	{
		System.out.println("Public access Base class");
		System.out.println("Public  varible : "+ varPublic);
	}
	
	private void methodPrivate()
	{
		System.out.println("Private access Base class");
		System.out.println("Private  varible : "+ varPrivate);
	}
	
	protected void methodProtected()
	{
		System.out.println("Protected access Base class");
		System.out.println("Protected  varible : "+ varProtected);
	}
	
	
}
