package com.grayMatter.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grayMatter.dao.EmployeeDao;
import com.grayMatter.entities.Employee;
import com.grayMatter.exceptions.ResourceNotFoundException;

import java.util.List;

@Service
public class EmployeeService implements EmployeeServiceInterface{

	
	@Autowired
	EmployeeDao empdao;
	
	@Override
	public List<Employee> getAllEmployee() {
		
		return empdao.getAllEmployee();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		
		return empdao.addEmployee(employee);
	}

	public List<Employee> getAllEmployeeByCity(String city) {
		
		return empdao.getAllEmployeeByCity(city);
	}

	public Employee getEmployeeById(int id)throws ResourceNotFoundException {
		
		return empdao.getById(id);
	}

	public List<Employee> getEmployeeByDeptId(int deptId) {
		// TODO Auto-generated method stub
		return empdao.getEmployeeByDeptId(deptId);
	}

	public List<Employee> getAllEmployeeStartsWith(String letter) {
		
		return empdao.getAllEmployeeStartsWith(letter);
	}

}
