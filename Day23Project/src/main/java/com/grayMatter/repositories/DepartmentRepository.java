package com.grayMatter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grayMatter.entities.Department;

public interface DepartmentRepository extends JpaRepository<Department,Integer>{

}
