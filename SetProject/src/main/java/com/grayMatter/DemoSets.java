package com.grayMatter;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class DemoSets {
/**
 * @param args
 */
public static void main(String[] args) {
	HashSet<Integer> hs=new HashSet<Integer>();
	//no duplicates
	//insertion order not preserved
	//no random access
	//treeset will not replace 
	hs.add(56);
	hs.add(34);
	hs.add(44);
	hs.add(10);
	System.out.println(hs);
	
	hs.add(34);//no duplicates
	System.out.println(hs);
	
	hs.add(null);
	hs.add(null);
	System.out.println(hs);
	
	Iterator<Integer> itr=hs.iterator();
	while(itr.hasNext())
		System.out.println(itr.next());
	
	HashSet<Integer> hsl=(HashSet<Integer>) hs.clone();
	System.out.println(hsl);
	
	Object arr[]=hs.toArray();
	System.out.println(arr[2]);// u can use enhanced loop to get all 
	
//	Object obj[]=hs.toArray();
	
	List<Object> al=Arrays.asList(arr);
//	System.out.println(Collections.reverse(al));//hashset dont have reverse instead use treeset
	
	TreeSet<Integer> ts=new TreeSet<Integer>();
	ts.add(44);
	ts.add(61);
	ts.add(8);
	ts.add(4);
	ts.add(59);
	ts.add(60);
	System.out.println(ts);
	//treeset inserts in sorted order
	//Treeset has descending iterator
	//it is navigable
	
	Iterator<Integer> itr1=ts.descendingIterator();
	while(itr1.hasNext())
		
	System.out.println(itr1.next());
	
	System.out.println("\n\n\n\n\n\n\n\n");
	Employee e1=new Employee("Milton",999,9930000,"Angamaly");
	Employee e2=new Employee("Mi",666,990070,"Chennai");
	Employee e3=new Employee("Milan",33,9900000,"DElhi");
	Employee e4=new Employee("Thorappan",222,9908000,"DElhi");
	Employee e5=new Employee("loom",33,0000,"DElhi");
	Employee e6=new Employee("doon",1111,1,"DElhi");
	
	TreeSet<Employee> emptree=new TreeSet<Employee>();
	emptree.add(e1);
	emptree.add(e2);
	emptree.add(e3);
	emptree.add(e4);
	emptree.add(e5);
	emptree.add(e6);
	
	
	for(Employee es:emptree)
		System.out.println(es);
	  
	
	System.out.println(ts.ceiling(60));//value just above 60 or 60 if 60 is thr
	System.out.println(ts.floor(60));//value below 60 or 60 if 60 is thr
	
	ts.add(56);
	ts.add(43);
	ts.add(89);
	
	System.out.println(ts);
	System.out.println(ts.headSet(57));//elements less than 57
	System.out.println(ts.tailSet(57));//elemenets grtr than 57
	
	
	
	
	
	
	
	
	
}
}

//By default, TreeSet uses the natural ordering of elements to maintain order.
//For user-defined classes like Employee, this natural ordering is determined by 
//the implementation of the Comparable interface (compareTo method). 
//If the Employee class does not implement Comparable or if compareTo does not
//provide consistent results, TreeSet may not insert or compare elements correctly.

