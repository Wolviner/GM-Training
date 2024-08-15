package com.grayMatter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grayMatter.entities.Department;
import com.grayMatter.entities.Employee;
import com.grayMatter.exceptions.ResourceNotFoundException;
import com.grayMatter.services.EmployeeService;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployee(){
		return service.getAllEmployee();
	}
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee){
		return service.addEmployee(employee);
	}
	@GetMapping("/employee/city/{city}")
	public List<Employee> getAllEmployeeByCity(@PathVariable("city") String city){
		return service.getAllEmployeeByCity(city);
	}
	
	@GetMapping("/employee/id/{id}")
	public Employee getById(@PathVariable("id")int id) throws ResourceNotFoundException{
		return service.getEmployeeById(id);
	}
	@GetMapping("/employee/dept_id/{deptId}")
	public List<Employee> getByDeptId(@PathVariable int deptId)
	{
		return service.getEmployeeByDeptId(deptId);
	}
	
	@GetMapping("/employee/startswith/{letter}")
	public List<Employee> getByDeptId(@PathVariable String letter)
	{
		return service.getAllEmployeeStartsWith(letter);
	}
	
	
}
