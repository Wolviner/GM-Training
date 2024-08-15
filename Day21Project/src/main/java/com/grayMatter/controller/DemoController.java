package com.grayMatter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@ResponseBody
public class DemoController {
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "hello";
	}
	@RequestMapping("/login")
	public ModelAndView login() {
		ModelAndView mv=new ModelAndView("welcome");
		return mv;
	}
	@RequestMapping("/DL")
	public ModelAndView DL() {
		ModelAndView mv=new ModelAndView("login");
		return mv;
	}
	

}
