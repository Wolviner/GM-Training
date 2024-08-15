package com.grayMatter.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.grayMatter.dto.StudentDto;
import com.grayMatter.dto.StudentMapper;
import com.grayMatter.entities.Student;
import com.grayMatter.repository.StudentRepository;

@Service
//@Profile(value="dev")
public class StudentService {
	
	@Autowired
	StudentRepository repository;
	
	@Autowired
	StudentMapper mapper;

	public List<StudentDto> getAllStudents() {

		 List<Student> sList=repository.findAll();
//		 StudentMapper mapper=new StudentMapper();
		 return sList.stream().map((s)->mapper.mapToStudentDto(s)).collect(Collectors.toList());
		 
//		 return repository.findAll().stream().map((s)->mapper.mapToStudentDto(s.collect(Collectors.toList())));
	}

	public StudentDto addStudent(StudentDto studentDto) {
		return mapper.mapToStudentDto(repository.save(mapper.mapToStudent(studentDto)));
		
	}
	


}
