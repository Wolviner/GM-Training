package com.grayMatter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

//arraylist is a resizable array
//follows insertion order
//Arraylist allows duplicate elements
//can add null values
//initial capacity is 10
//list capacity gets exhausted then capacity increases to the current capacity+

public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(56);
		al.add("Milton");
		al.add(55.78);
		al.add(true);
		
		System.out.println(al);
		
		al.add(56);
		al.add("Milton");
		al.add(null);
		System.out.println(al);
		
		for(int i=0;i<al.size();i++) {
			System.out.println("Element: "+al.get(i));
		}
//		OR
//		for(var i:al)
//			System.out.println(i);
		
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(89);
		list.add(45);
		list.add(77);
		list.add(8);
		
		for (int i:list) 
			System.out.println(i);
		list.add(2,121);
		System.out.println(list);
		
		list.addAll(3,al);
		System.out.println("addAll"+list);
		
		list.remove(1);	//to remove element at index 1
		System.out.println("remove 1"+list);
		
		System.out.println("list contains"+list.contains(1));
		al.remove("Milton");
		System.out.println(al);
		
		list.remove((Integer)89);//to remove 89
		System.out.println("89"+list);
		
		
//		list.clear();
		
		
		Iterator<Integer> itr=al.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	
		
		//LIST ITERTAOR CAN BE USED TO GET ELEMENTS IN BOTH FRWRD AND BKWRD DIRCTN
		ArrayList<Integer> blist=new ArrayList<Integer>();
		blist.add(66);
		blist.add(34);
		blist.add(37);
//		System.out.println(blist);
		ListIterator<Integer> listitr=blist.listIterator();
		
		System.out.println("Element print in forward direction");
		
		while(listitr.hasNext())
			System.out.println(listitr.next());
		
		System.out.println("Element print in backward direction");
		while(listitr.hasPrevious())
			System.out.println(listitr.previous());
		
		
		while(listitr.hasNext()) {
			int i=listitr.next();
			if(i==34)
				listitr.add(100000);
			System.out.println("Print next:"+i);
		}
		System.out.println(blist);
			
			ArrayList<Integer> elist=new ArrayList<Integer>();
			elist.add(66);
			elist.add(34);
			elist.add(37);
			System.out.println(elist);
			
			Collections.sort(elist);
			System.out.println("Elist "+elist);
		
		
		
	}

}
//primitive to wrapper autoboxing
//wrapper to primtive is unboxing