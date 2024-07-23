package com.grayMatter;

import java.util.Stack;

//initial cap is 10 (similar to vector)		

public class DemoStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st=new Stack<Integer>();
		st.push(78);
		st.push(2424);
		st.push(345);
		System.out.println(st);
		System.out.println(st.capacity());
		//size and capacity are diferent (SIZE -actual elements present) (CAP-memory allocated here is 10)
		
		st.trimToSize();
		System.out.println(st.capacity());
		
		st.add(3434);
		System.out.println(st.capacity());//size doubles when u add another elmnt more than the 
		//assigned capacity (here becomes 6)
		
		
		
		
	}

}

//
//ORder class 10 objects
//orderid
//order date
//itrmlist<item>
//
//calc. total order cost and find max(order)


//implement arra

//implement linked hashset of employees , perform various operations


