package com.tnsif.dayfour.secondpackage;

import com.tnsif.dayfour.firstpackage.Base;

public class Executor {

	public static void main(String[] args) {
	
		//accessing in different package class
		Base b1=new Base();
		
		b1.methodPublic();
		b1.varPublic=51;
		b1.methodPublic();
		
		
		

	}

}
