package com.tnsif.daythirteen.queuedemo;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExdequeDemo {

	public static void main(String[] args) {
		
		
		Deque<String> deque1=new ArrayDeque<String>();
		deque1.add("gautam");
		deque1.add("mamta");
		deque1.add("Harish");
		deque1.add("Heti");
		
		
		System.out.println(deque1);
		
		
		deque1.poll();
		System.out.println(deque1);
		
		deque1.pollLast();
		System.out.println(deque1);
		
		for(String str: deque1)
		{
			System.out.print(str+"\t");
		}
		
		System.out.println();
		System.out.println(deque1);

	}

}
