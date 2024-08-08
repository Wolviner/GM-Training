package com.grayMatter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.grayMatter.model.Employee;

import com.grayMatter.service.EmployeeService;

@Controller
//@ResponseBody
public class EmployeeController {

	
	@Autowired
	private EmployeeService service;
	
	
	@RequestMapping("/back")
	public ModelAndView welcome() {
		ModelAndView we=new ModelAndView("welcome");
		return we;
	}
	@RequestMapping("/UP")
	public ModelAndView UP() {
		ModelAndView we=new ModelAndView("updateEmp");
		return we;
	}
	@RequestMapping("/DE")
	public ModelAndView DE() {
		ModelAndView we=new ModelAndView("deleteEmp");
		return we;
	}
	@RequestMapping("/GEI")
	public ModelAndView GEI() {
		ModelAndView we=new ModelAndView("getById");
		return we;
	}
	@RequestMapping("/doLogin")
	public ModelAndView doLogin() {
		ModelAndView we=new ModelAndView("login");
		return we;
	} 
	@RequestMapping("/AE")
	public ModelAndView AE() {
		ModelAndView we=new ModelAndView("addEmployee");
		return we;
	}
	@RequestMapping("/login")
	public ModelAndView login(@RequestParam String name,@RequestParam String pwd) {
		
		
		ModelAndView mv=new ModelAndView("welcome");
		boolean isValid = false;
		
		if(name.equals("Ponner")&&pwd.equals("1234")) {
			mv=new ModelAndView("welcome");
			mv.addObject("name",name);
		}
		else
			mv=new ModelAndView("login");
		
		return mv;
	}
	@RequestMapping("/display")
	public ModelAndView getAllEmployees(){
		
		List<Employee> empList=service.getAllEmployee();
		for(Employee emp:empList)
			System.out.println(emp);
		ModelAndView mv=new ModelAndView("employee");
		mv.addObject("emp",empList);
		return mv;
	}
	
	@RequestMapping("/displayID")
	public ModelAndView displayID(@RequestParam String empId){
		
		List<Employee> emp=service.getEmployeeById(Integer.parseInt(empId));
		 ModelAndView mv=new ModelAndView("employee");
		 mv.addObject("emp",emp);
		return mv;
	}
	
	@RequestMapping("/update")
	public ModelAndView updateEmployee(@RequestParam String empName,@RequestParam String empId,
			@RequestParam String empSal)
	{
	    service.updateEmployee(new Employee(empName,Integer.parseInt(empId),Double.parseDouble(empSal)));
	    ModelAndView mv=new ModelAndView("updateDone");
		return mv;
	}
	
	@RequestMapping("/delete")
	public ModelAndView deleteEmployee(@RequestParam String empId)
	{
	    service.deleteEmployee(Integer.parseInt(empId));
	    ModelAndView mv=new ModelAndView("deleteDone");
		return mv;
	}
	@RequestMapping("/addEmployee")
	public ModelAndView addEmployee(@RequestParam String empName,@RequestParam String empId,
			@RequestParam String empSal)
	{
	    service.addEmployee(new Employee(empName,Integer.parseInt(empId),Double.parseDouble(empSal)));
	    ModelAndView mv=new ModelAndView("addDone");
		return mv;
	}
}

 