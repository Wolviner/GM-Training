package com.grayMatter.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import org.springframework.beans.factory.annotation.Autowired;

@Component
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Customer {
	@Value("${Customer.cusName}")
	private String cusName;
	@Value("${Customer.id}")
	private int id;
	@Value("${Customer.mobile}")
	private String mobile;
	@Value("${Customer.email}")
	private String email;
	@Autowired
	private Order order;
}
