package com.grayMatter;
import java.util.Date;

public class Employee extends Person {
 private String deptName;
 private double Salary;
 private Date doj;
 
 
public Employee() {
	super();
}


public Employee(String name, int id, String mobile, String mail, Date dob, String deptName, double salary, Date doj) {
	super(name, id, mobile, mail, dob);
	this.deptName = deptName;
	this.Salary = salary;
	this.doj = doj;
}


@Override
public String toString() {
	return "Employee [deptName=" + deptName + ", Salary=" + Salary + ", doj=" + doj + ", toString()=" + super.toString()
			+ "]";
}


 
 
 
}
