package com.tnsif.daysix.staicblockmethod;import org.w3c.dom.CDATASection;

public class MyClass {

	
	private int section; //non-static varible
	
	private static int srNo;  // static varible
	
	//static block 
	static {
		
		System.out.println("------Within static block ------------");
		//section=10;
		srNo=1000;

	}
	//default constructor 
	MyClass()
	{
		System.out.println("-------Within  default constructor----------");
		srNo++;   // 1001
		section++;  //1
	}
	@Override
	public String toString() {
		return "MyClass [serial No "+srNo+",section=" + section + "]";
	}

	//static method 
	static void display()
	{
	//	System.out.println("Section :"+ section );
		System.out.println("serial no :"+ srNo);
	}
	
	
}
