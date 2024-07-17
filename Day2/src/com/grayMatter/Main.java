package com.grayMatter;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Employee emp=new Employee();
		System.out.println(emp);
		
		Employee emp1=new Employee("Milton",234,"997979797","milton@gmail.com",new Date("19/4/2024"),"accounts",454545,new Date("23/9/2024"));
        System.out.println(emp1);
//        
        System.out.println(emp instanceof Person);

	}

}
