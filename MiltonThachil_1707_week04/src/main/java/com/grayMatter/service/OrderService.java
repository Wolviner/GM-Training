package com.grayMatter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.grayMatter.dao.OrderDAO;
import com.grayMatter.model.Customer;
import com.grayMatter.model.Orders;
@Service
public class OrderService {
	@Autowired
	OrderDAO orderDao;
	public List<Orders> getOrders(){
		return orderDao.getOrder();
	}
	public List<Orders> getOrdersByCustomerId(int id) {
		return orderDao.getOrderById(id);
		
	}
	public int updateOrder(Orders orders) {
		return orderDao.updateOrder(orders);
		
	}
	public int deleteOrder(int int1, int int2) {
		return orderDao.deleteOrder(int1, int2);
		
	}
	public int placeOrder(Orders orders) {
		return orderDao.placeOrder(orders);
		
	}
	

}
