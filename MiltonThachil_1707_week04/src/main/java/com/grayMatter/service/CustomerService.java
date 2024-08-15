package com.grayMatter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grayMatter.dao.CustomerDAO;
import com.grayMatter.model.Customer;
import com.grayMatter.model.Orders;


@Service
public class CustomerService {
	@Autowired
	private CustomerDAO cusDao;
	
	public List<Customer> getAllCustomer(){
		return cusDao.getAllCustomer();
	}
	
	public List<Customer> getByCustomerById(int id) {
		return cusDao.getCustomerById(id);
		
	}
	
	public int addCustomer(Customer cus) {
		return cusDao.addCustomer(cus);
	}
	
	public int updateCustomer(Customer cus) {
		return cusDao.updateCustomer(cus);
	}
	public List<Customer> getCustomerById(int empId) {
		return cusDao.getCustomerById(empId);
	}
	public int deleteCustomer(int id) {
		return cusDao.deleteCustomer(id);
	}


	


	
}