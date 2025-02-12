package com.tnsif.dayten.Jaggeddimensiondemo;

class JaggedArray{
	
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




public class JaggedArrayDemo {

	public static void main(String[] args) {
		
		
		int d[][]= { {10,20,30,40} , {20}, {12,24}, { 1,2,3,4,5} ,{1,10} };
		
		System.out.println("Total no of row in arrays are : "+ d.length);
		
		JaggedArray.printArray(d);

	}

}
