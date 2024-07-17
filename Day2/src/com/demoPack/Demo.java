package com.demoPack;

import com.grayMatter.DemoAccessModifiers;
import com.grayMatter.DemoClass;
import com.grayMatter.ClassA;
import com.grayMatter.DemoAccessModifiers.Inner;

public class Demo extends ClassA {

	public static void main(String[] args) {
		//Unable to access because name variable is set to default by normal and can be accessed within only the same package 
		//To access across within the same project(packages within prj) u will have to make it public across 
		DemoClass dc=new DemoClass();
		dc.name="Milton";
		System.out.println(dc.name);
		
		//Accessing inner class of demoaccessmodifier
		DemoAccessModifiers.Inner obj3=new DemoAccessModifiers().new Inner();
	//Protected
		Demo d=new Demo();
		d.name1="Thankan";
		
	}
	

}
