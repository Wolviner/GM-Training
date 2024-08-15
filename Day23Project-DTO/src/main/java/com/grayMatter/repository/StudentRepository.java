package com.grayMatter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grayMatter.entities.Student;


public interface StudentRepository extends JpaRepository<Student,Integer>{


}
