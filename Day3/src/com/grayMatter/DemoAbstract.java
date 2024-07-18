package com.grayMatter;

public class DemoAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//AbstractClass cd=new AbstractClass();//AbstractClass do not have any instances so we cant create objects for abstract classes
		//cd.sayHello();
		AbstractChildClass ac=new AbstractChildClass();
		ac.sayHello();
		System.out.println(ac.printName("Poojitha"));
		//System.out.println(cd.printName("Poojitha"));

	}

}
