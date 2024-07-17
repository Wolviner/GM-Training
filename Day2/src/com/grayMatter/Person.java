package com.grayMatter;
import java.util.Date;

public class Person {
	
	private String name;
	private int id;
	private String mobile;
	private String mail;
	private Date dob;
	
	

	public Person() {
		super();
		System.out.println("From Person");
	}



	public Person(String name, int id, String mobile, String mail, Date dob) {
		super();
		System.out.println("From person with parameters");
		this.name = name;
		this.id = id;
		this.mobile = mobile;
		this.mail = mail;
		this.dob = dob;
	}



	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", mobile=" + mobile + ", mail=" + mail + ", dob=" + dob
				+ ", toString()=" +  "]";
	}



}
