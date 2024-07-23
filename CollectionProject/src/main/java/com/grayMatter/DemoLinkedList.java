package com.grayMatter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class DemoLinkedList {
public static void main(String[] args) {
	LinkedList<String> fruitlist=new LinkedList<String>();
	fruitlist.add("Orange");
	fruitlist.add("Banana");
	fruitlist.add("Apple");
	
	System.out.println(fruitlist);
	
	fruitlist.addFirst("Mango");
	fruitlist.addLast("Chakka");
	System.out.println(fruitlist);
	
	fruitlist.add("Orange");
	fruitlist.add("Banana");
	fruitlist.add("Apple");
	System.out.println(fruitlist);
//	
//	fruitlist.add(null);
//	fruitlist.add(null);
	System.out.println(fruitlist);
	
	Iterator<String> itr=fruitlist.listIterator();
	while(itr.hasNext())
	System.out.println(itr.next());
	
	Collections.sort(fruitlist);//give error if list is null
	System.out.println(fruitlist);
	
//	fruitlist.add(100,"Apple");//give error if list isnt that big 
	
	fruitlist.add(8,"pazham");
	System.out.println(fruitlist);
	
	LinkedList<String> myfruits=(LinkedList<String>) fruitlist.clone();//both fruitlist and myfrit 
//	have same hashcode
	System.out.println(myfruits);
	System.out.println(fruitlist.hashCode());
	System.out.println(myfruits.hashCode());
	
	myfruits.add("Thenga");
//	fruitlist.add("Thenga");
	System.out.println(fruitlist.hashCode());
	System.out.println(myfruits.hashCode());
	
	LinkedList <Employee> empList=new LinkedList<Employee>();
	Employee e1=new Employee("Milton",999,9900000,"Angamaly");
	Employee e2=new Employee("Mi",666,9900000,"Chennai");
	Employee e3=new Employee("Milan",33,9900000,"DElhi");
	Employee e4=new Employee("Thorappan",222,9900000,"DElhi");
	Employee e5=new Employee("loom",33,0000,"DElhi");
	Employee e6=new Employee("doon",1111,1,"DElhi");
	empList.add(e1);
	empList.add(e2);
	empList.add(e3);
	empList.add(e4);
	empList.add(e5);
	empList.add(e6);

	LinkedList<Employee> myemp=(LinkedList<Employee>)empList.clone();
	System.out.println(empList.hashCode());
	System.out.println(myemp.hashCode());
	Employee e7=new Employee("Thankan",232,887,"Mumbai");
	myemp.add(e7);
	System.out.println(myemp);
	
}
}
