package com.Assignment;

import java.time.LocalDate;
import java.util.Date;

public class Person {
	private String name;
	private LocalDate dob;
	private int age;
	public Person(String name, int age,LocalDate dob ) {
		super();
		this.name = name;
		this.dob = dob;
		this.age = age;
	}
	public Person() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", dob=" + dob + ", age=" + age + "]";
	}
	
	

}
