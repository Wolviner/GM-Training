package com.grayMatter.config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.grayMatter.beans.Customer;
import com.grayMatter.beans.Item;
import com.grayMatter.beans.MyDataSource;
import com.grayMatter.beans.Order;

@Configuration
////configuration title to the application
@ComponentScan("com.grayMatter.beans")
@PropertySource("classpath:data.properties")
public class ShopConfig {
	
	@Bean(name="customer")
	public Customer customer()
	{
		return new Customer("Tyor",99,"8923234","gg@mmadd",order());
	}

	
	@Bean
	public Order order() {
		return new Order("adfasf","4/09",item());
	}
	@Bean
	public List<Item> item()
	{
		List<Item> itemList=new ArrayList<Item>();
		Item it1=new Item(100,"Opps",2300);
		Item it2=new Item(120,"Opps1",2400);
		Item it3=new Item(130,"Opps2",2500);
		itemList.add(it1);
		itemList.add(it2);
		itemList.add(it3);
		return itemList;
		
	}
	@Bean
	public MyDataSource myDataSource() {
		return new MyDataSource();
	}
	
}
