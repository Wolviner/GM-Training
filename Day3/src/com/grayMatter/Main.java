package com.grayMatter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Shape s=new Shape();
//		s.getArea();
//		s.getPerimeter();
//		
//		Square sq=new Square(4);
//		sq.getArea();
//		sq.getPerimeter();
//		
//		Circle c=new Circle(7);
//		c.getArea();
//		c.getPerimeter();
//		
//		Shape s1=new Square(6);
//		s1.getArea();
//		
//		s1=new Circle(14);
//		s1.getArea();
	//--------------------TILL HERE FOR SHAPE<CRCLE<SQUARE----------------	
		CalculatorInterface ci=new MyCalculator();
		ci.add(5, 7);
		
		MyScientificCalculatorInterface msi=new MyCalculator();
		msi.pow(4,5);
		
		MyCalculator mc =new MyCalculator();//here mc object is created using MyCalculator reference
		//If both interface inherited by MyCalculator has the same method suppose display() then 
		//JVM is in ambiguous state and doesnt know which interface it belongs to so it would call the 
		//display present in the child class itself
		//Explained from line 39
		mc.add(7, 8);
		mc.sqrt(25);
		//-----------------------------FROM HERE------------------------------------
		MyClass md=new MyClass();
		md.display();
		
		Interface1 i1=md;
		i1.display();
		
		Interface2 i2=new MyClass();
		i2.display();
		
		//-----------------------
		CalculatorInterface.getDeveloperInfo();
		
		

	}

}
