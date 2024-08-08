package com.grayMatter.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.grayMatter.model.Employee;

public class EmployeeDao {
	
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}
	
	public int addEmployee(Employee emp) {
		
		String query="insert into employee values ("+emp.getEmpId()+",'"+emp.getEmpName()+"',"+
		emp.getEmpSal()+")";
		return jdbcTemplate.update(query);
		
	}

	
	public List<Employee> getAllEmployee(){
		String query="select * from employee";
		List<Employee> empList=jdbcTemplate.query(query,new EmployeeRowMapper());
		return empList;
	}
	 public int updateEmployee(Employee emp) {
		 String query="update employee set empSal="+emp.getEmpSal()+"where empId="+emp.getEmpId();
		 
	 return jdbcTemplate.update(query);
	 }
	 public int deleteEmployee(Employee emp) {
		 String query="delete from employee where empId="+emp.getEmpId();
		 
	 return jdbcTemplate.update(query);
	 }

	public List<Employee> getEmployeeById(int i) {
		String query="select * from  employee where empId="+i;
		List<Employee> empList=jdbcTemplate.query(query,new EmployeeRowMapper());
		return empList;
	}
	

}
