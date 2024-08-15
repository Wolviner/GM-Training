package com.grayMatter.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="project23employee")
public class Employee {
	@Id
	private int empId;
	private String empName;
	private double empSal;
	private String city;
	@ManyToOne
	@JoinColumn(name="departmentId",referencedColumnName ="deptId")
	private Department department;

}
