package com.grayMatter.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="project23department")
public class Department {
	
	private String deptName;
	@Id
	private int deptId;
	@OneToMany(mappedBy="department")
	@JsonIgnore
	private List<Employee> empList;

}
