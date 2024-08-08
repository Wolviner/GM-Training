package com.grayMatter.model;
import lombok.ToString;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.Getter;
//import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Employee {

	
	private int empId;
	private String empName;
	private double empSal;
}
