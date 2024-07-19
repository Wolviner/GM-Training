package com.grayMatter;

public class Person {
	
	private String name;
	private int age;
	private String aadhar;
	
	
	public Person() {
		super();
	}


	public Person(String name, int age, String aadhar) {
		super();
		this.name = name;
		this.age = age;
		this.aadhar = aadhar;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getAadhar() {
		return aadhar;
	}


	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", aadhar=" + aadhar + "]";
	}


	
	

}
