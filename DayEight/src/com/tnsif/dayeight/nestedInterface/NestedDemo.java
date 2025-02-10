package com.tnsif.dayeight.nestedInterface;

public class NestedDemo implements OuterInterface, OuterInterface.InnerInterface {

	@Override
	public void calArea() {
		System.out.println("outer interface");
		
	}

	@Override
	public void print() {
		System.out.println("Inner interface ");
		
	}
	

}
