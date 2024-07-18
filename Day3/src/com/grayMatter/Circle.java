package com.grayMatter;

public class Circle extends Shape {
	double radius;
	public static final double pi=3.14;
	
	
	
	public Circle() {
		super();
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public void getArea() {
		// TODO Auto-generated method stub
		System.out.println("Area"+(pi*radius*radius));
		
	}

	public void getPerimeter() {
		// TODO Auto-generated method stub
		System.out.println(""+(2*pi*radius));
		
	}

}
