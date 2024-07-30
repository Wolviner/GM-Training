package com.grayMatter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloTest {
	
	HelloClass hv=new HelloClass();
@Test
	public void testSayHello() {
		String expected="Hello....!";
		
		
		String actual=hv.sayHello();
		assertEquals(expected,actual);//comparing both expected and actual
		
	}
@Test
public void testAdd() {
	assertEquals(5, hv.add(2,3));
}
}
