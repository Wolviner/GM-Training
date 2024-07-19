package com.grayMatter;

public class CounterClass {
private int count=0;

public synchronized void updateCount() {
//	synchronized (this) { Both synchronised block and method have the same functionality in this case
		count++;
		printCount();
		
//	}
	
}
public void printCount() {
	System.out.println(count);
}
}
