package com.tnsif.dayeight.nestedInterface;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NestedDemo n=new NestedDemo();
		n.print();
		n.calArea();
		
		
		OuterInterface o;
		o=new NestedDemo();
		o.calArea();
		
		OuterInterface.InnerInterface io;
		io=new NestedDemo();
		io.print();
				
	
	}

}
