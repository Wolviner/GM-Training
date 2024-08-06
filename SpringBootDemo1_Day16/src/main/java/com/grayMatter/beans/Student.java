package com.grayMatter.beans;

import java.util.Set;

public class Student {
	private int id;
	private String name;
	private String mobile;
	private Department dep;
	
	
	public Student(int id, String name, String mobile, Department dep) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.dep = dep;
	}

	public Student() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Department getDep() {
		return dep;
	}

	public void setDep(Department dep) {
		this.dep = dep;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", mobile=" + mobile + ", dep=" + dep + "]";
	}

	
	

}
