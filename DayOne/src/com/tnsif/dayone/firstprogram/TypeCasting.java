package com.tnsif.dayone.firstprogram;

public class TypeCasting {

	public static void main(String[] args) {
		
		
		//widening // implicit type casting
		
		byte b=10;
		
		int l=b;
		System.out.println(l);
		
		int s=1234567890;
		
		long w=s;
		System.out.println(w);
		
		
		float f=22.14f;
		double d=f;
		System.out.println(d);
		
		char ch='A';  // 2byte 
		int i=ch;     // 4 byte 
		System.out.println(i);
		
		//narrowing //explcit type casting 
		
		double f1=10.52d;
		
		long ll=(long) f1;
		
		System.out.println(ll);
		
		long l2=9876543210L;
		
		int i23=(int) l2;
		System.out.println(i23);
		
		//127  =  130-127 = 2   -128 127  =-121
		
		long h=135L;
		
		byte bg=(byte) h;
		System.out.println(bg);
		
		float f2=34.56f;
		int i123=(int ) f2;
		System.out.println(i123);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
