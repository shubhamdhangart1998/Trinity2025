package com.tnsif.daythirteen.queuedemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExQueue {

	public static void main(String[] args) {
		
		Queue<Integer> r=new LinkedList<Integer>();
		r.add(10);
		r.add(12);
		r.add(6);
		r.add(2);
		r.add(12);
		
		
		System.out.println(r);
		
		int positionPeek=r.peek();
		System.out.println(positionPeek);
		
		int positionelements=r.element();
		System.out.println(positionelements);
		
		System.out.println(r);
		
		System.out.println(r.remove());
		System.out.println(r);
		
		
		System.out.println(r.remove());
		
		System.out.println(r);
		
		
		Iterator itr=r.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+"\t");
		}
		
		System.out.println();
		
		System.out.println(r.poll());
		System.out.println(r);
		
		System.out.println(r.retainAll(r));
		
		
		

	}

}
