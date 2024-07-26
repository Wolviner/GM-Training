package com.grayMatter;

import java.util.ArrayList;
import java.util.Collection;

public class DemoOnGenerics <T>{
	
	T a;
	T b;
//	public int add(int a,int b) {
//		return a+b;
//	}
//	
//	public double add(double a,double b) {
//		return a+b;
//	}
//	public String add(String s1,String s2) {
//		return s1+s2;
//	}
	
	
//	public T add(T a,T b) {
//		if(a instanceof Integer)
//			return (T)(Integer)(Integer)a+(Integer)b);
//			else if(a instanceof String)
//				return (T)(String)(String)a+(String)b;
//			else
//				return null;
//	}
	
	public static <T> void printDetails(Collection <T> collection) {
		for(T t:collection) {
			System.out.println(t);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		DemoOnGenerics dg=new DemoOnGenerics();
//		System.out.println(dg.add(45,67));
//		System.out.println(dg.add(656.44,42.67));
//		System.out.println(dg.add("Harris","Tommy"));
		
		ArrayList<String> alist=new ArrayList<String>();
		alist.add("Milton");
		alist.add("Yoma");
		printDetails(alist);
		
		ArrayList<Integer> intlist=new ArrayList<Integer>();
		intlist.add(99);
		intlist.add(100);
		intlist.add(55);intlist.add(19);
		printDetails(intlist);
		
		//take an instance variable for type T

	}

}
