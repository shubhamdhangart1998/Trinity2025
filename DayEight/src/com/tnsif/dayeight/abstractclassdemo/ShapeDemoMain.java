package com.tnsif.dayeight.abstractclassdemo;

public class ShapeDemoMain {

	public static void main(String[] args) {
		
		//object square, rectang  // cannot create obj of shape 
		
		Square s=new Square();
		s.calArea();
		s.show();
		
		Rectangular r=new Rectangular();
		r.calArea();
		r.show();
		
		//dynamic bindling //runtime binding // late binding
		Shape s1;
		
		s1=new Square(5.0f);
		s1.calArea();
		s1.show();
		
		
		
		s1=new Rectangular(10.67f, 45.87f);
		s1.calArea();
		s1.show();
		

	}

}
