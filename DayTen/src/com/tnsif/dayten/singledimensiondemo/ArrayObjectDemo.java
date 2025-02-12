package com.tnsif.dayten.singledimensiondemo;

public class ArrayObjectDemo {

	public static void main(String[] args) {
		
		Student [] arr;
		
		//declare memory for 5 object of type student
		
		
		arr=new Student[5];
		
		arr[0] = new Student(1, "Riza");
		arr[1] = new Student(2, "Ratnapal");
		arr[2] = new Student(3, "Sanket");
		arr[3] = new Student(4, "Mamta");
		arr[4] = new Student(5, "Manisha");
		arr[5] = new Student(6, "Shubham");
		
		for (int i=0;i<arr.length; i++)
		{
			System.out.println("Elements at "+ i + ":"+arr[i].getRollNo()+" "+ arr[i].getName());
		}

	}

}
