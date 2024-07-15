package com.grayMatter;

public class EmployeeDriver {
public static void main(String[] args) {
	//Employee emp;//(Here emp acts as variable)this is a reference and not object and is stored in stack memory
	
	//Default Constructor is called
	Employee emp=new Employee();// this is an object and is stored in heap memory
	//new Employee --JVM invokes deafult constructor
	//Constructor is a special method used to create object space at runtime on heap memory
	emp.setDetails();
	emp.getDetails();
	
	
	//Parameterised constructor is called
	Employee emp1=new Employee("Milton",145,435345345,"68668686","milton@gmail.com");
	emp1.getDetails();
}
}
