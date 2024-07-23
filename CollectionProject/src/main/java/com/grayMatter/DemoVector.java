package com.grayMatter;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class DemoVector {

	public static void main(String[] args) {
		Vector<Integer> vector=new Vector<Integer>();
		//it is a resizable array
		//it is a legacy class
		//initial capacity is 10
		//if vector capacity get exhausted then capacity becomes double
		
		System.out.println(vector.capacity());
		for(int i=0;i<=10;i++)
			vector.add(i);
		System.out.println(vector.capacity());
		vector.add(11);
		System.out.println(vector.capacity());
		
		Enumeration<Integer> myenum=vector.elements();
		
//		while(myenum.hasMoreElements()) {
//			int i=myenum.nextElement();
//			System.out.println(myenum.nextElement());
//		}
		
		Iterator <Integer> itr=vector.iterator();
		while(itr.hasNext())
		{
			int i=itr.next();
			if(i==6)
				itr.remove();
			System.out.println(i);
		}
		System.out.println(vector);
		
		System.out.println(vector.contains(6));
		System.out.println(vector.size());
		
		System.out.println(vector.lastElement());
		System.out.println(vector.get(3));
		
		
		

	}

}

//Iterator is a newer and more flexible interface compared to Enumeration.
//Iterator allows for safe removal of elements during iteration (iterator.remove()), 
//while Enumeration does not support removal.
//Enumeration is synchronized, whereas Iterator is not. 
//This makes Enumeration suitable for use in multithreaded environments 
//when using synchronized collections like Vector.
