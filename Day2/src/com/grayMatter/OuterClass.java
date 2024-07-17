package com.grayMatter;

import com.grayMatter.OuterClass.Inner;

public class OuterClass {
 static class Inner{
	 String name;
	 
 }
 public static void main(String[] args) {
	 //OuterClass.Inner i=new OuterClass().new Inner();//for non static inner class
	 Inner i=new Inner();//for static inner class
}
}
