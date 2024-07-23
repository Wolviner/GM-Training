package com.grayMatter;


//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
//
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@ToString

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
