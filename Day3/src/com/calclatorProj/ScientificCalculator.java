package com.calclatorProj;
import java.util.*;
public class ScientificCalculator extends ArithmeticCalculator{

	@Override
	public int pow(int a, int b) {
		// TODO Auto-generated method stub
		return ((int)Math.pow(a, b));
	}

	@Override
	public int square(int a) {
		// TODO Auto-generated method stub
		return ((int)Math.sqrt(a));
		
	}


}
