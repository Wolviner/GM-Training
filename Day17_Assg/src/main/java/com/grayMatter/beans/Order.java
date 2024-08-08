package com.grayMatter.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

@Component
public class Order {
	
	@Value("${Order.orderID}")
	private String orderID;
	@Value("${Order.orderDate}")
	private String orderDate;
//	@Value("#{'${Order.item}'.split(',')}")
	private List<Item> item;
//	@Autowired
//	private Item items;

}
