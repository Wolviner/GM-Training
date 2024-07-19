package com.grayMatter;

public class DemoThreads extends Thread {

	
	@Override
	public void run() {
		System.out.println("In run method");
		System.out.println(currentThread().getName());//Thread-0 , Thread-1 maybe output
		System.out.println(currentThread().getId());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(currentThread().getName());
		System.out.println(currentThread().getId());
		System.out.println(currentThread().getPriority());
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		
		System.out.println(currentThread().isAlive());
		System.out.println(currentThread().isDaemon());//Daemon threads are typically used for tasks that 
//		are not essential for the operation of the program. Ex;garbage collection threads
		
		DemoThreads dot=new DemoThreads();
		DemoThreads dot1=new DemoThreads();
		dot.start();
		dot1.start();
		//Cannot predict the order of execution in run method it can vary in case for threads
		
		
		
		

	}

}
