package com.grayMatter;

public class Info {
	public void display(Student std) {
		
		System.out.println("Student DOB:"+std.getDob()+"Student ID:"+std.getId()+"Student Name:"
				+std.getName());
	}

	public void display(Course crs) {
		System.out.println("Student ID:"+crs.getId()+"Student Name:"+crs.getName()+"Duration:"
				+crs.getDuration());
		
	}
}
