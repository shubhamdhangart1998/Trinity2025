package com.tnsif.daynine.StringDemo;
//mutable or else changeable 
public class StringBufferDemo {

	public static void main(String[] args) {
		
		
		StringBuffer buffer=new StringBuffer("Hello");
		System.out.println("Buffer :"+ buffer);
		
		System.out.println(buffer.length());  //5
		System.out.println(buffer.capacity());  //16
		String s;
		int a=42;
		buffer=new StringBuffer(40);
		s=buffer.append("a =").append(a).append("!").toString();
		System.out.println(s);
		
		System.out.println(buffer);
		
		buffer=new StringBuffer("I java !");
		buffer.insert(2, " like ");
		System.out.println(buffer);
		
		buffer.delete(3, 6);
		System.out.println(buffer);
		
		System.out.println(buffer.reverse());

	}

}
