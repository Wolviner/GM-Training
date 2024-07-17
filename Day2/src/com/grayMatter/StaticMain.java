package com.grayMatter;

public class StaticMain {

	public static void main(String[] args) {
		//OuterClass.Inner i=new OuterClass().new Inner();//for non static inner class
		OuterClass.Inner i=new OuterClass.Inner();//Calling inner static class of another class in this class main method

	}

}
