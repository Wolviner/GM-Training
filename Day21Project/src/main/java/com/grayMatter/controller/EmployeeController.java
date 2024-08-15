package com.grayMatter.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.grayMatter.model.Employee;

import jakarta.annotation.PostConstruct;

@Controller
@ResponseBody
//@RequestMapping("/api/v1")
public class EmployeeController {
	List<Employee> empList=null;
	@PostConstruct
	public void setUpEmpList() {
		empList=new ArrayList<Employee>();
		empList.add(new Employee(123,"Ponjikkara",5000));
		empList.add(new Employee(11,"Ponji",5000));
		empList.add(new Employee(100,"Pranji",5000));
		
	}
	@RequestMapping(value="/employee")
	public ModelAndView getAllEmployees(){
		ModelAndView mv=new ModelAndView("welcome");
		mv.addObject("empList",empList);
		return mv;
		
	}
	@RequestMapping(value="/employee",method=RequestMethod.POST)
	public Employee addEmployee(@RequestBody Employee employee){
		
		empList.add(employee);
		return employee;
		
	}
	
	@RequestMapping("/employee/{id}")
	public Employee getEmployeeById(@PathVariable("id") int empid) {
		for(Employee e:empList)
			if(e.getEmpId()==empid)
			return e;
			
		return null;
	}

	@RequestMapping(value="/employee/{id}", method=RequestMethod.PUT)
	public Employee updateEmployee(@RequestBody Employee emp,@PathVariable ("id")int empId) {
		for (Employee e:empList)
			if(e.getEmpId()==empId)
			{
				e.setEmployee(emp.getEmployee());
				e.setEmpSal(emp.getEmpSal());
				return e;
			}
		return null;
			
	}
	
}
