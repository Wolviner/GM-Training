package com.grayMatter;

import java.util.Scanner;

public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//primitive to wrapper
		int i=55;
		Integer iObj=i;
		//wrapper to primitive(int)
		int j=iObj.intValue();
		//string to wrapper
		String sInt="78";
		Integer i1=Integer.parseInt(sInt);
		//wrapper to string
		String s1=i1.toString();
		
		//Upcasting similar to widening----------Child reference to parent
		String str="Hello";
		Object obj=str;
		
		String str1=(String)obj;//Downcasting----------Parent to child explicit conversion
		

	}

}
