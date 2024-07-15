package com.grayMatter;

import java.util.Scanner;

//POJO --plain old java object when it has no main class and 
//Drivef class --when it has main class
public class Employee {


		
		//properties, instance variables
		String name;
		int id;
		double sal;
		String mobile;
		String email;
		
		//static String companyName;//static variables
		
		//Default constructor
		public Employee() {
			System.out.println("From deafult constructor");
		}
		public void setDetails() {
		 Scanner sc =new Scanner(System.in);
		 System.out.println("Enter emp details, name,id,sal,mob,email");
		 this.name=sc.next();
		 this.id=sc.nextInt();
		 this.sal=sc.nextDouble();
		 this.mobile=sc.next();
		 this.email=sc.next();
		 
		}
		
		public void getDetails() {
			System.out.println(this.name+this.id+this.sal+this.sal+this.email);
			
		}
		//Parameterised constructor
		public Employee(String name, int id, double sal, String mobile, String email) {
			super();
			this.name = name;
			this.id = id;
			this.sal = sal;
			this.mobile = mobile;
			this.email = email;
		}

}
