package com.grayMatter.controller;


import com.grayMatter.model.Employee;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
//@RequestMapping("/empctrl")
public class EmployeeController {
	
	@RequestMapping("/doLogin")
	public String doLogin() {
		return "login";
	}
	
	@RequestMapping("/login")
	public ModelAndView login(@RequestParam String uname,@RequestParam String pwd) {
		
		ModelAndView mv=new ModelAndView("welcome");
		
		if(uname.equals("Ponner")&&pwd.equals("1234")) {
			mv=new ModelAndView("welcome");
			mv.addObject("uname",uname);
		}
		else
			mv=new ModelAndView("login");
		
		return mv;
	}
	@RequestMapping("/employee")
	public ModelAndView getEmpInfo() {
		Employee emp=new Employee("Ponner",32,4355.98);
		ModelAndView mv=new ModelAndView("emp");
		mv.addObject("emp1",emp);
//		mv.addObject("emp");
		return mv;
	}
	@RequestMapping("/doAddEmp")
	public String doAddEmp() {
		return "addEmp";
	}
	@RequestMapping("/employee/add")
		public ModelAndView addEmp(@RequestParam String empName,
				@RequestParam String empId,@RequestParam String empSal)
		{
			Employee e=new Employee(empName,Integer.parseInt(empId),Double.parseDouble(empSal));
			ModelAndView mv=new ModelAndView("emp");
			mv.addObject("emp1",e);
			return mv;
		}
		
	}


