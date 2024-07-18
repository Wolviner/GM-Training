package com.calclatorProj;

public abstract class ArithmeticCalculator extends Calculator {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
		
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int mult(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public int div(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	@Override
	public abstract int pow(int a,int b); 
	
    @Override
	public abstract int square(int a); 

}
