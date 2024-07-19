package com.grayMatter;

public class DemoRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1=new Thread(new MyRunnable());//thread class has a constructor that has runnable
//		parameter so this works by passing myrunnable 
		t1.start();

	}

}
