package com.grayMatter;

public class Square extends Shape {

	double side;

	
	public Square() {
		super();
	}


	public Square(double side) {
		super();
		this.side = side;
	}
	
	public void getArea() {
		// TODO Auto-generated method stub
		System.out.println("Area"+(side*side));
		
	}

	public void getPerimeter() {
		// TODO Auto-generated method stub
		System.out.println("Perimeter"+(4*side));
		
	}
	
}
