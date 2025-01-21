package com.tnsif.dayone.firstprogram;

public class PrimitiveDataTypesDemo {

	public static void main(String[] args) {

		
		//byte take 1 byte memory = 2^8=256
		// 256/2=128       -1 to -128  /  0 to 127
		
		//1 byte=8 bits    2^8= 256/2  === 128
		
		byte byteMax=127;
		byte byteMin=-128;	
		
		System.out.println("Min range of byte is "+ byteMin);
		System.out.println("max range of byte is " + byteMax);
		
		
		//short --- 2byte   2^16 = 65535
		short shortMax=32767;
		short shortMin=-32768;	
		
		System.out.println("Min range of short is "+ shortMin);
		System.out.println("max range of short is " + shortMax);
			
		// int 4   2^32  
		int intMax=2147483647;
		int intMin=	-2147483648;	
		
		System.out.println("Min range of int  is "+ intMin);
		System.out.println("max range of int is " + intMax);
		
		//long -- 8 bytes 2^64 = 
		
		long minLong= -9223372036854775808L;
		long maxLong=  9223372036854775807L;	
		
		System.out.println("Min range of long  is "+ minLong);
		System.out.println("max range of long is " + maxLong);
		
		float f=3234.141243278345f;
		double d=3456.14124512345678902345678914d;
		
		System.out.println("float value is  "+ f + "  double va;ue is "+ d);
		
		boolean flag= false;
		System.out.println("boolean value is "+ flag);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
				
	}

}
