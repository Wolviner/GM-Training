package com.grayMatter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grayMatter.dao.EmployeeDao;
import com.grayMatter.model.Employee;


@Service
public class EmployeeService {
	@Autowired
	private EmployeeDao empDao;
	
	public List<Employee> getAllEmployee(){
		return empDao.getAllEmployee();
	}

	
	public int addEmployee(Employee employee) {
		return empDao.addEmployee(employee);
	}
	
	public int updateEmployee(Employee employee) {
		return empDao.updateEmployee(employee);
	}
	public List<Employee> getEmployeeById(int empId) {
		return empDao.getEmployeeById(empId);
	}
	public int deleteEmployee(int id) {
		return empDao.deleteEmployee(id);
	}
}
