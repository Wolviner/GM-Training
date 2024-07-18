package com.grayMatter;

public class MyCalculator implements CalculatorInterface,MyScientificCalculatorInterface {

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);

	}

	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a-b);

	}

	@Override
	public void mult(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a*b);

	}

	@Override
	public void div(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a/b);

	}

	@Override
	public void pow(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(Math.pow(a, b));
		
	}

	@Override
	public void sqrt(int a) {
		// TODO Auto-generated method stub
		System.out.println(Math.sqrt(a));
		
		
	}

}
