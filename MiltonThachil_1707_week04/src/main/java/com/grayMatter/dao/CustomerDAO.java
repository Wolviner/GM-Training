
package com.grayMatter.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.grayMatter.model.Customer;
import com.grayMatter.model.Orders;
@Component
public class CustomerDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}
	
	public int addCustomer(Customer cus) {
		
		String query="insert into customer values ("+cus.getId()+",'"+cus.getName()+"','"+
		cus.getEmail()+"','"+cus.getPwd()+"')";
		return jdbcTemplate.update(query);
		
	}

	
	public List<Customer> getAllCustomer(){
		String query="select * from customer";
		List<Customer> cusList=jdbcTemplate.query(query,new CustomerRowMapper());
		return cusList;
	}
	 public int updateCustomer(Customer cus) {
		 String query="update customer set name='"+cus.getName()+"',email='"+
	 cus.getEmail()+"'where id="+cus.getId();
		 
	 return jdbcTemplate.update(query);
	 }
	 public int deleteCustomer(int id) {
		 String query="delete from customer where id="+id;
		 
	 return jdbcTemplate.update(query);
	 }

	public List<Customer> getCustomerById(int i) {
		String query="select * from  customer where id="+i;
		List<Customer> cusList=jdbcTemplate.query(query,new CustomerRowMapper());
		return cusList;
	}

	
	

}
