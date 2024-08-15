package com.grayMatter.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor


public class Employee {
	private int empId;
	private String employee;
	private double empSal;

}
