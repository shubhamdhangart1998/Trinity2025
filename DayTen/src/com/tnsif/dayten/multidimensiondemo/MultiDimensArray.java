package com.tnsif.dayten.multidimensiondemo;

//nested row and column the col are fixed 
class MLArrayDemo{	
	static void printArray(int c[][])
	{
		System.out.println("Array Elements are as follows: ");
		for(int i=0; i<c.length;i++)
		{
			for(int j=0; j<c[i].length;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}		
	}

}

public class MultiDimensArray {

	public static void main(String[] args) {
		
		
		int c[][]= { {12,45} , {10,20} ,{1, 2} , {10,20} ,{5,7}} ; //new int[5][2]
		
		System.out.println("no of row in C array : "+ c.length);
		
		MLArrayDemo.printArray(c);
		
	}
	
	
	
}
