package com.tnsif.daysix.usingfinal;

public class FinalVaribles {

	
	//final int a;//  final instance varible must be initialized values 
	
	final int x=100;
	
	//declare and initialized static final varibles
	final static int z=10;
	
	final static int y;
	
	//instance method
	
	void change()
	{
		//x=30;  final varible values cannot be change 
		// y=200;
	}

	@Override
	public String toString() {
		return "FinalVaribles [x=" + x + ", y =" + y +"]";
	}
	
	//declare a static block to intialized the final static varibles ----- y
	static {
		y=20;
		//z=100;
		System.out.println("Value of Y : "+ y);
	}
	
	
	
	
	
	
	
	
	
}
