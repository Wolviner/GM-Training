package com.grayMatter;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class DemoOnString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello";//String where no frequent change is required 
		System.out.println(str.hashCode());//hashcode gives the object refernce(address)
		//only objects have hashcode, string is an object
		str="hai";
		System.out.println(str.hashCode());
		String s1=new String("hello");
		System.out.println(s1.hashCode());//s1 and str has same hashcode since hello is same in
		//object pool
		
		String s4=new String();
		System.out.println(s4.hashCode());
		s4="thyr";
		System.out.println(s4.hashCode());
		
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		
		String s=s1;
		System.out.println(s.hashCode());
		s1=s1+"world";
		System.out.println(s1);
		
		System.out.println(s1.equals(s));//compares both value and reference whereas ==only compares value
		
		s="     HEllo    ";
		System.out.println(s.length());
		System.out.println(s.trim().length());
		String a="Hello";
		a=a.replace('e','a');
		System.out.println(a);
		
		
		s="Apple";
		s1="apple";
		System.out.println(s1.compareTo(s));   //learn like a-b=97-98 =-1  (apple-ball)
		
		System.out.println(s.endsWith("le"));
		
		
//		isEmpty
//		isBlank
//		isNull
//		notNull
//		notEmpty
	
		StringBuffer sbf=new StringBuffer("Hello") ;//StringBuffer for multiple threads are used,concurrent access
		StringBuffer sbf1=new StringBuffer("Hello") ;
		System.out.println(sbf.hashCode());
		System.out.println(sbf1.hashCode());//differnet from sbf hashcode
		sbf.append("Milton");
		System.out.println(sbf.hashCode());
		System.out.println(sbf);
		StringBuffer sbf3=new StringBuffer(50) ;
		System.out.println(sbf3.capacity());
		s=sbf.toString();
		
//		String arrs[]=new String[5];
		String strarr[]= {"sdaf","fsafs","fdf"};
		
		for(String n:strarr) {
			if(n.charAt(0)=='s') {
				System.out.println("starts with s");
			}
		}
		
        String para="hellp mdsddhsd sdfsdfj";
        String sara[]=para.split(" ");
        System.out.println("String array"+Arrays.toString(sara));
        for(String stf:sara) 
        	System.out.println(stf);
        //to join string as para back to original
        String joiner="";
        for(String stf:sara) 
        	joiner=joiner+stf+" ";
        System.out.println(joiner);
        
        StringTokenizer tokenizer=new StringTokenizer(para," ");
        while(tokenizer.hasMoreTokens()) {
        	System.out.println(tokenizer.nextToken());
        	
        }
        
        StringJoiner sjoiner=new StringJoiner(",");
        sjoiner.add("apple");
        sjoiner.add("ball");
        sjoiner.add("apple");
        sjoiner.add("ball");
        
        System.out.println(sjoiner.toString());
        
	
	}
}
//when u create a string value it creates a reference in string pool
//and when u cahnge its value it refers to a new refernce location in string pool without 
//deleting the existing string value first created
//when string pool finds a string value is already found then when u create a string of same value
//then the string would refer to the same string which is already present