package com.grayMatter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;

@Controller
public class DemoController {

	
//	@RequestMapping("/hello")
//	public String sayHello() {
//		return "hello";
//	}
	@RequestMapping("/name")
	public String printName(Model model) {
		model.addAttribute("name","ponner");
		return "ponner";
	}
	@RequestMapping("/hello")
	public ModelAndView printName(String name) {
		ModelAndView mv=new ModelAndView("hello");
		
		mv.addObject("username","Sokka");
		
		return mv;
		
	}
//	@RequestMapping("/say")//
//	public Model printNew(Model model) {
//		ModelAndView mv=new ModelAndView("hello");
//		
//		model.addAttribute("name","kiriao");
//		
//		return model;
//		
//	}
}
