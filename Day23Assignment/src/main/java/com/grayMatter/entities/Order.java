package com.grayMatter.entities;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name="project23order")
public class Order {
	
	@Id
	private int orderId;
	private Date orderDate;
	@ManyToMany
	@JoinTable(joinColumns= @JoinColumn(name="itemId"),
	inverseJoinColumns = @JoinColumn(name="orderId"))
	private List<Items> itemList;
	

}
