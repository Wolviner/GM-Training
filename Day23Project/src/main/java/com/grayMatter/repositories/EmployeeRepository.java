package com.grayMatter.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.grayMatter.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	
	public List<Employee> findByCity (String city);
//	public Employee findById (int id);
	
//	@Query(value="select * from project23employee e where e.department_id=?",nativeQuery=true)
//without using query too it works
//	OR
	
	
	public List<Employee> findByDepartment_DeptId(int departmentId);
	
//	@Query(value="select * from project23employee where emp_name like ?%",nativeQuery=true)
//	public List<Employee> findAllEmployeeStartsWith(@Param("letter" )String letter);
	
	public List<Employee> findByEmpNameStartsWith(String letter);
	
	@Query("select e from Employee e where empName like ?1%")//used when table isnt known properly
//	not using table name correctly
	public List<Employee> findAllEmployeeStartsWith(@Param("letter" )String letter);
	
	
	

}
