package com.grayMatter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Employee implements Comparable,Cloneable{
	private String empname;
	private int empid;
	private double empsal;
	private String city;
	
	
	public Employee() {
		super();
	}


	public Employee(String empname, int empid, double empsal,String city) {
		super();
		this.empname = empname;
		this.empid = empid;
		this.empsal = empsal;
		this.city=city;
	}
	

	
	
	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", empid=" + empid + ", empsal=" + empsal + ", city=" + city + "]";
	}


	public String getEmpname() {
		return empname;
	}


	public void setEmpname(String empname) {
		this.empname = empname;
	}


	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public double getEmpsal() {
		return empsal;
	}


	public void setEmpsal(double empsal) {
		this.empsal = empsal;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public int compareTo(Object o) {
		Employee e =new Employee();
		e=(Employee)o;
		//return this.getEmpid()-e.getEmpid();//sort based on empid
		
		
		//return this.getEmpname().compareTo(e.getEmpname());//get based on empname (compareto is used for string only)
		
		return (int)(this.getEmpsal()-e.getEmpsal());//based on empsal
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}

//The Comparable interface in Java is used to define the natural ordering of objects of
//a class. When a class implements Comparable, it must override the compareTo method,
//which compares the current object (this) with another object of the same type (o).
//The compareTo method returns a negative integer, zero, or a positive integer
//if this object is less than, equal to, or greater than the specified object, respectively.
//
//Here, Employee implements Comparable<Employee> and overrides the compareTo method
//to compare employees based on their salary (empsal). This method will be used to determine 
//the natural order when Employee objects are stored in a TreeSet<Employee> or when sorting 
//using Collections.sort().
//
//A Comparator<Employee> is an interface used to compare two objects of the Employee class based on specific criteria other than the natural order defined by Comparable. Unlike Comparable, 
//which is implemented within the class being compared, Comparator can be implemented separately
//for more flexible sorting options.
//
//Here, NameComparator implements Comparator<Employee> and overrides the compare
//method to compare Employee objects based on their empname (employee name). This allows
//sorting or ordering of Employee objects by name without modifying the Employee class itself.
