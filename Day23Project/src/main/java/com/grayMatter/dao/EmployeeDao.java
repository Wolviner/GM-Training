package com.grayMatter.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import com.grayMatter.entities.Employee;
import com.grayMatter.exceptions.ResourceNotFoundException;
import com.grayMatter.repositories.EmployeeRepository;

@Repository
public class EmployeeDao {

	@Autowired
	EmployeeRepository repository;
	public List<Employee> getAllEmployee(){
		return repository.findAll();
		
	}
	public Employee addEmployee(Employee employee) {
		return repository.save(employee);
	}
	public List<Employee> getAllEmployeeByCity(String city) {
		// TODO Auto-generated method stub
		return repository.findByCity(city);
	}
//	public Employee getEmployeeById(int id) {
//		
//		return repository.findById(id);
//	}
	public List<Employee> getEmployeeByDeptId(int deptId) {
		// TODO Auto-generated method stub
		return repository.findByDepartment_DeptId(deptId);
		
	}
	public List<Employee> getAllEmployeeStartsWith(String letter) {
		// TODO Auto-generated method stub
		return repository.findAllEmployeeStartsWith(letter);
	}
	
	//Custom exception if element not present
//public Employee getById(int id)throws ResourceNotFoundException {
//		
//		return repository.findById(id).orElseThrow(()->new ResourceNotFoundException("No such id "
//				+ "is present")) ;
//	}
	
	//global exception implemented here
	public Employee getById(int id)throws ResourceNotFoundException {
		
		return repository.findById(id).get() ;
	}
}
