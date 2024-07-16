package com.grayMatter;

public class Polymorphism {
	
//Constraints of overloading
	
//	1. Within the same class
//	2. Happens only considering parameters
//	    a) Change in type of parameters
//	    b) Number of parameters
//	    c) Order of parameters
	
	
	//Change in type of parameters
	
	public static void add(int a,int b) {
		System.out.println(a+b);
	}
	
	public void add(float a,float b) {
		System.out.println(a+b);
	}
	public void add(String a,String b) {
		System.out.println(a+b);
	}
	
	//Change in no. of parameters
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	
	//Change in order of parameters
	public void add(int a,double d2) {
		System.out.println(a+d2);
	}
	
	public void add(double d2,int a) {
		System.out.println(a+d2);
	}
	
	
	//Constructor related
	public void add(Complex c1,Complex c2) {
		Complex c3=new Complex();
		c3.imag=c1.imag+c2.imag;
		c3.real=c1.real+c2.real;
		System.out.println(c3.real+c3.imag+"i");
	}
public static void main(String[] args) {
	int a=10,b=20,c=30;
	add(a,b);
	
	
	//
	Polymorphism doo=new Polymorphism();
	doo.add(34, 56);
	doo.add(4.5f, 5.6f);
	doo.add(a,b,c);
	doo.add("Hello","World");
	Complex c1=new Complex(3,4);
	Complex c2=new Complex(5,7);
	doo.add(c1, c2);
	
	
}

//Overriding happens within Parent and Child relation
// 1.Parent and Child both need to have the same method (Signature--return type,parameters,method name)
}
