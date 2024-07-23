package com.grayMatter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class DemoArrayList {
	public static void main(String[] args) throws CloneNotSupportedException {
		ArrayList <Employee> empList=new ArrayList<Employee>();
		Employee e1=new Employee("Milton",999,9900000,"Angamaly");
		Employee e2=new Employee("Mi",666,9900000,"Chennai");
		Employee e3=new Employee("Milan",33,9900000,"DElhi");
		Employee e4=new Employee("Thorappan",222,3,"DElhi");
		Employee e5=new Employee("loom",33,0000,"DElhi");
		Employee e6=new Employee("doon",1111,1,"DElhi");
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		empList.add(e6);
		System.out.println("With to string");
		System.out.println(empList);
		System.out.println("Enhanced for loop");
		for(Employee emp:empList)
			System.out.println(emp);
		System.out.println("Using iterator");
		Iterator<Employee> itr=empList.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("Sort operation");
		Collections.sort(empList);//calls compareto method in employee class
		for(Employee e:empList)
			System.out.println("After sort pananna  "+e);
		
		//compare city then name and lastly salary to sort
		
		empList.sort(new CityComparator().thenComparing(new NameComparator()).thenComparing(new SalaryComparator()));

//		OR U CAN DO THIS WAY BOTH ARE SAME
		//		Collections.sort(empList,new CityComparator().thenComparing(new NameComparator()).thenComparing(new SalaryComparator()));
		for(Employee emp:empList)
			
			System.out.println(emp);
//		sorting based on individual attribute (here city)
		//		CityComparator cc=new CityComparator();
//		Collections.sort(empList,cc);
//		for(Employee emp:empList)
			
//			System.out.println("oooj"+emp);
		
		Employee emp=new Employee();
		Employee emp1=(Employee)emp.clone();
		
		System.out.println(emp.hashCode()+" "+emp1.hashCode());
		
	}

}
