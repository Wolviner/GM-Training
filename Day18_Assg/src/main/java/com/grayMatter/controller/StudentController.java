package com.grayMatter.controller;



import com.grayMatter.model.Student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

	List<Student> st=new ArrayList<>();
	

	@RequestMapping("/doLogin")
	public ModelAndView doLogin() {
		ModelAndView we=new ModelAndView("login");
		return we;
	}
	
	@RequestMapping("/welcome")
	public ModelAndView welcome() {
		ModelAndView we=new ModelAndView("welcome");
		return we;
	}
	
	@RequestMapping("/login")
	public ModelAndView login(@RequestParam String name,@RequestParam String pwd) {
		System.out.println(st);
		st.add(new Student("Ponner",1,"1234",23,"ponner@gmail.com"));
		ModelAndView mv=new ModelAndView("welcome");
		boolean isValid = false;
		
        for (Student student : st) {
            if (student.getName().equals("Ponner") && student.getPwd().equals("1234")) {
                isValid = true;
                break;
            }
        }
		
		
		if(isValid) {
			mv=new ModelAndView("welcome");
			mv.addObject("name",name);
		}
		else
			mv=new ModelAndView("login");
		
		return mv;
	}
	
	@RequestMapping("/addSt")
	public ModelAndView addSt() {
		ModelAndView as=new ModelAndView("addStudent");
		return as;
	}
    @RequestMapping("/addStudent")
    public void showAddStudentPage(@RequestParam String name,@RequestParam String id,@RequestParam
    		String pwd,@RequestParam String age,@RequestParam String email) {
    	st.add(new Student(name,Integer.parseInt(id),pwd,Integer.parseInt(age),email));
    	
       
    }
    @RequestMapping("/getAS")
    public ModelAndView getAS() {
    	ModelAndView mv=new ModelAndView("getAllStudent");
    	mv.addObject("StudentList",st);
    	return mv;
    }
    @RequestMapping("/US")
	public ModelAndView UP() {
		ModelAndView we=new ModelAndView("updateStudent");
		return we;
	}
    @RequestMapping("/updateStudent")
    public void upStudent(@RequestParam String id, @RequestParam String newEmail) {
    	for (Student student : st) {
            if (student.getId()==(Integer.parseInt(id))) 
                student.setEmail(newEmail);
         }
    }
    @RequestMapping("/DS")
	public ModelAndView DE() {
		ModelAndView we=new ModelAndView("deleteStudent");
		return we;
	}
    @RequestMapping(value = "/deleteStudent", method = RequestMethod.POST)
    public ResponseEntity<String> deleteStudent(@RequestParam String id) {
        for (Student student : st) {
            if (student.getId() == Integer.parseInt(id)) {
                st.remove(student);
                
                return ResponseEntity.ok("Successfully deleted");
            }
        }
       
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Student not found");
    }

	
	@RequestMapping("/GSI")
	public ModelAndView GEI() {
		ModelAndView we=new ModelAndView("getById");
		return we;
	}
	@RequestMapping("/getStudentID")
	public ModelAndView gSID(@RequestParam String id) {
		ModelAndView mv=new ModelAndView("getAllStudent");
		for(Student s:st) {
			if(s.getId()==Integer.parseInt(id)) {
				mv.addObject("StudentList",st);
				return mv;
			}
		}
    	return mv;
	}
	


}
