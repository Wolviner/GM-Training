package com.grayMatter.model;
import java.sql.Date;

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

public class Orders {
	private int id;
	private Date orderDate;
	private double totalAmount;
	private int customerId;
	

}
