package com.grayMatter;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1,Employee o2) {
		
		return (int) (o1.getEmpsal()-o2.getEmpsal());
		
	}
}
