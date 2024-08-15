package com.grayMatter.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.grayMatter.model.*;
@Component
public class OrderDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate1;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate1=jdbcTemplate;
	}
	public List<Orders> getOrderById(int i) {
		String query="select * from  orders where customerId="+i;
		List<Orders> orderList=jdbcTemplate1.query(query,new OrderRowMapper());
		return orderList;
	}
	public List<Orders> getOrder() {
		String query="select * from  orders";
		List<Orders> orderList=jdbcTemplate1.query(query,new OrderRowMapper());
		return orderList;
		
	}
//	public void updateOrder(int orderId, int customerId, java.sql.Date newOrderDate, double newTotalAmount) {
//        String query = "UPDATE Orders SET orderDate = ?, totalAmount = ? WHERE id = ? AND customerId = ?";
//        jdbcTemplate1.update(query, newOrderDate, newTotalAmount, orderId, customerId);
//    }
	 public int deleteOrder(int orderId, int customerId) {
	        String query = "DELETE FROM Orders WHERE id = ? AND customerId = ?";
	        return jdbcTemplate1.update(query, orderId, customerId);
	    }
	public int updateOrder(Orders orders) {
		String query="update orders set orderDate='"+orders.getOrderDate()+"', totalAmount="+
				 orders.getTotalAmount()+" where id="+orders.getCustomerId()+" and customerId="+orders.getId();
					 int rows=jdbcTemplate1.update(query);
					 System.out.println("rows"+rows+"query"+query);
					 
				 return jdbcTemplate1.update(query);
	}
//	 public int updateOrder(Orders orders) {
//		    // Use parameterized queries to avoid SQL injection and handle special characters
//		    String query = "UPDATE Orders SET orderDate = ?, totalAmount = ? WHERE id = ? AND customerId = ?";
//		    return jdbcTemplate1.update(query, 
//		                                orders.getOrderDate(), 
//		                                orders.getTotalAmount(), 
//		                                orders.getId(), 
//		                                orders.getCustomerId());
//		}
	public int placeOrder(Orders orders) {
		String query="insert into orders values ("+orders.getId()+",'"+orders.getOrderDate()+"',"+
				orders.getTotalAmount()+","+orders.getCustomerId()+")";
				return jdbcTemplate1.update(query);
	}


}
