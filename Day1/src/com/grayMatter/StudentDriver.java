package com.grayMatter;

public class StudentDriver {

	public static void main(String[] args) {
		Student st1=new Student();
		System.out.println(st1);
		st1.setStudName("Milton");
		st1.setId(2114);
		st1.setM1(100);
		st1.setM2(999);
		st1.setM3(888);
		System.out.println(st1);
		
		
		//Using Getters
		System.out.println(st1.getStudName());
		System.out.println(st1.getId());
		System.out.println(st1.getM1());
		System.out.println(st1.getM2());
		System.out.println(st1.getM3());

	}

}
