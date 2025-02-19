package com.tnsif.daythirteen.listdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
	
		
		List list=new ArrayList();  // dynamic binding 
		
		System.out.println(list.isEmpty());
		
		list.add(10);
		list.add(20);
		list.add("sakshi");
		list.add("riza");
		list.add(false);
		list.add(true);
		list.add(20);
		list.add(12.42f);
		list.add(10);
		
		System.out.println("list is "+ list );
		
		System.out.println(list.isEmpty());
		
		System.out.println(list.size());  //size start=1
		
		System.out.println("Is list contains " + list.contains(10));
		
		list.remove(false);
		System.out.println("List is "+list);
		
		list.remove(2);
		System.out.println("List is "+list);
		
		System.out.println(list.remove(list.lastIndexOf(20)));
		System.out.println(list);
		
		System.out.println(list.indexOf(10));
		
//		list.clear();
//		System.out.println(list);
		
		System.out.println("---------------------");
		
		
		
		//Generic 
		
		List<String> names=new ArrayList<String>();
		
		names.add("Sanket");
		names.add("Sakshi");
		names.add("Tejas");
		names.add("Nitin");
	//	names.add(23);
	//	names.add(false);
		names.add("Aakash");
		
		System.out.println(names);
		
		Collections.reverse(names);
		System.out.println(names);
		
		System.out.println(names.contains("Nitin"));
		
		Collections.sort(names);
		System.out.println(names);
		
//		Collections.sort(list);
//		System.out.println(list);
		
		//Traversing a list
		Iterator<String> i=names.iterator();
		while(i.hasNext())
		{
			String nm=i.next();
			System.out.print(nm+"\t");
			
		}
		System.out.println();
		
		ListIterator<String> li=names.listIterator(names.size());
		
		while (li.hasPrevious())
		{
			String nm=li.previous();
			System.out.println(nm);
			
		}
		
		
		
		
		
		
		
		
		
		

	}

}
