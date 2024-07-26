package com.grayMatter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AppEngine {
	private List<Student> students;
    private List<Course> courses;
    private List<Enroll> enrollments;


		public AppEngine() {
			 this.students = new ArrayList<>();
		        this.courses = new ArrayList<>();
		        this.enrollments = new ArrayList<>();
		}

		public void introduce(Course course) {
			courses.add(course);
	        Info info = new Info();
	        new Info().display(course);
	    }

	    public void register(Student student) {
	        
	    	students.add(student);
	    	new Info().display(student);
	    }

	    public Student[] listOfStudents() {
	    	return students.toArray(new Student[0]);
	    }

	    public Course[] listOfCourses() {
	    	 return courses.toArray(new Course[0]);
	    }

	    public void enroll(Student student, Course course) {
	    	Enroll er=new Enroll(student,course, LocalDate.now());
	    	enrollments.add(er);
	    		
	    	
	    		
	    }

	    public Enroll[] listOfEnrollments() {
	        
	    	 return enrollments.toArray(new Enroll[0]);
	    	 
	    }
	

}
