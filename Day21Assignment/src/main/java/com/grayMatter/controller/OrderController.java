package com.grayMatter.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.grayMatter.model.Orders;

import jakarta.annotation.PostConstruct;
import jakarta.websocket.server.PathParam;

@RestController
public class OrderController {
	
	List<Orders> list ;
	
	@PostConstruct
	public void loadData() {
		list = new ArrayList<>();
		list.add(new Orders(1,"books",100,2));
		list.add(new Orders(2,"chair",800,4));
		list.add(new Orders(3,"mattress",3000,7));
		list.add(new Orders(4,"pillows",400,8));
		list.add(new Orders(5,"cushions",400,12));
	}
	
	
	
	
	@PostMapping("/addOrder")
	public ResponseEntity<String> addOrder(@RequestBody Orders order) {
		
		for(Orders o : list) {
			if(o.getId() == order.getId()) {
				return new ResponseEntity(HttpStatus.ALREADY_REPORTED);
			}
		}
		list.add(order);
		return new ResponseEntity(HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/getOrders")
	public List<Orders> getAllData() {
		if(list.isEmpty()) return null;
		return list;
	}
	
	
	@GetMapping("/getOrder/{id}")
	public Orders getData(@PathVariable String id) {
		
		if(list.isEmpty()) return null;
		
		for(Orders o : list) {
			if(o.getId() == Integer.parseInt(id)) {
				return o;
			}
		}
		return null;
	}
	
	
	@DeleteMapping("/deleteOrder/{id}")
	public ResponseEntity addOrder(@PathVariable int id) {
		
		for(Orders o : list) {
			if(o.getId() == id) {
				list.remove((Orders)o);
				return new ResponseEntity(HttpStatus.ACCEPTED);
			}
		}
	
		return new ResponseEntity(HttpStatus.BAD_REQUEST);
	}
		
	
	@PutMapping("/updateOrder/{id}")
	public ResponseEntity<String> update(@RequestBody Orders order, @PathVariable int id) {
	    if (list.isEmpty()) {
	        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Order list is empty");
	    }

	    for (Orders s : list) {
	        if (s.getId() == id) {
	            s.setItemName(order.getItemName());
	            return ResponseEntity.ok("Order updated successfully");
	        }
	    }

	    return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Order not found");
	}

	
	
	

}