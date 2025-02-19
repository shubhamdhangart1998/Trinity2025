package com.tnsif.daythirteen.setdemo;

import java.util.HashSet;
import java.util.Set;

public class StudentSetDemo {

	public static void main(String[] args) {
		
		
		Set<Students> set=new HashSet<Students>();
		set.add(new Students(101, "Heti", 76.98f));
		set.add(new Students(102, "Heti", 76.98f));
		set.add(new Students(103, "Heti", 76.98f));
		
		System.out.print(set);
		
		
		
	}

}
