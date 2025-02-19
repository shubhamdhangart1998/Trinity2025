package com.tnsif.daythirteen.mapdemo;

import java.util.Collection;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Set;

public class HashMapDemoTable {

	public static void main(String[] args) {
		
		
		Hashtable<Integer, String> ht=new Hashtable<Integer, String>();
		
		ht.put(101, "Mumbai");
		ht.put(102, "Pune");
		ht.put(103, "Mumbai");
		ht.put(102, "Nashik");
		
		ht.put(105, "Aurangabad");
		ht.put(105, "Nagar");
		
		System.out.println(ht);
		
		ht.putIfAbsent(106, "Delhi");
		System.out.println(ht);
		
		System.out.println(ht.replace(102, "baramati"));
		System.out.println(ht);
		
		
		Set s=ht.keySet();
		System.out.println(s);
		
		
		Collection<String> c=ht.values();
		System.out.println(c);

	}

}
