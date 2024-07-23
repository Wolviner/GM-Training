package com.grayMatter;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arrays {
	 public static void main(String[] args) {

	        ArrayDeque<User> arr = new ArrayDeque<>();

	        arr.add(new User(99999, "Thankan"));
	        arr.add(new User(3333, "Ponan"));
	        arr.add(new User(10101, " "));
	        arr.add(new User(343434, "Ramanan"));
	        
	       

	      
	        for (User user : arr) {
	            System.out.println(user.getId() + " " + user.getName());
	        }
	        
	       

	        System.out.println("First User Removed: " + arr.remove());

	        
	        for (User user : arr) {
	            System.out.println(user.getId() + " " + user.getName());
	        }

	        System.out.println();
	        User a = new User(455, "Ponappan");
	        System.out.println(arr.contains(a));

	        
	        arr.add(new User(00, "Sahoo"));
	 
	        
	        for (User user : arr) {
	            System.out.println(user.getId() + " " + user.getName());
	        }
	        
	        
	        System.out.println();
	        List<User> usera = new ArrayList<>(arr);

	        usera.sort(new NameCompa());

	        for (User user :usera ) {
	            System.out.println(user.getId() + " " + user.getName());
	        }
	    }

}
