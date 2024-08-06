package com.grayMatter.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;

public class Order {
	
	@Value("${Order.orderID}")
	private String orderID;
	@Value("${Order.orderDate}")
	private String orderDate;
	@Autowired
	private List<Item> item;

}
