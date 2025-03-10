package com.tnsif.dayten.singledimensiondemo;

import java.util.Arrays;

public class ArrayClassDemo {

	public static void main(String[] args) {
	
		
		//get the array
		
		int intArr[]= {69,2,20,12,40,35};
		
		//print th array 
		
		System.out.println(Arrays.toString(intArr));
		
		for(int i=0;i<intArr.length; i++)
		{
			System.out.print(intArr[i] + " ");
		}
		System.out.println();
		
		//sort
		Arrays.sort(intArr);
		System.out.println(Arrays.toString(intArr));

		
		//binarysearch
		System.out.println(Arrays.binarySearch(intArr, 13));
		
		System.out.println(Arrays.binarySearch(intArr, 2, 4, 40));
		
		//comparison
		
		System.out.println(Arrays.toString(intArr));
		
		//get second array
		
		int intArr1[]= {69,2,20,12,40,35};
		
		System.out.println(Arrays.toString(intArr1));
		
		Arrays.sort(intArr1);
		
		//compare both the arrays
		
		if(Arrays.compare(intArr, intArr1)==0)
		{
			System.out.println("Both the arrays are same ");
		}
		else 
		{
			System.out.println("Both are different array ");
		}
		
		//copy array 
		
		int intArr2[]= Arrays.copyOf(intArr1, 3);
		System.out.println(Arrays.toString(intArr2));
		
		int intArr3[]=Arrays.copyOfRange(intArr, 2, 4);
		System.out.println(Arrays.toString(intArr3));
		
		
		
		//fill method 
		
		Arrays.fill(intArr3, 999);
		System.out.println(Arrays.toString(intArr3));
		
		
		
		
		
	}

}
