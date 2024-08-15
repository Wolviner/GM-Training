package com.grayMatter.controller;

import java.util.List;

import com.grayMatter.dto.StudentDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.grayMatter.services.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@GetMapping("/dto")
	public List<StudentDto> getAllStudents(){
		return service.getAllStudents();
	}
	@PostMapping("/dto")
	public StudentDto addStudent(@RequestBody StudentDto studentdto){
		return service.addStudent(studentdto);
	}

}
