package com.grayMatter.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.grayMatter.entities.Department;
import com.grayMatter.repositories.DepartmentRepository;


@Repository
public class DepartmentDao {
	@Autowired
	DepartmentRepository repository;
	public List<Department> getAllDepartment(){
		return repository.findAll();
	}
	public Department addDepartment(Department department) {
		return repository.save(department);
	}

}
