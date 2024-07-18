package com.grayMatter;

public class DemoFunctionalInterface implements MyFunctionalInterface {

	
	public static void main(String[] args) {
		DemoFunctionalInterface dfi=new DemoFunctionalInterface();
		System.out.println(dfi.cubeOfNum(5));
		
		MyFunctionalInterface mfi=dfi;
		System.out.println(mfi.cubeOfNum(100));
		
	}
	@Override
	public int cubeOfNum(int num) {
		// TODO Auto-generated method stub
		return num*num*num;
	}

}
