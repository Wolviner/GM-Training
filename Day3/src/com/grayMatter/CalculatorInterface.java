package com.grayMatter;

public interface CalculatorInterface {
	
	public void add(int a,int b);
	public void sub(int a,int b);
	public void mult(int a,int b);
	public void div(int a,int b);
	//Example can be seen in MyScientificCalculatorExDefault---for the ones below
	//for default curly braces for method body is must
	
	//Default methods are used in interfaces -----when overriding it is required
	
	//Static methods are used----when it needs to remain constant and shouldnt be changed and 
	//cannot be overridden 
	default void pow(int a,int b) {};
	default void sqrt(int a) {};
	static void getDeveloperInfo() {
		System.out.println("From Static");
	};
	//Static methods cannot be overridden in implemented class
	//so the method can be accessed only using directly the interface name rather than the 
	//implemented class name
	//Ex;  CalculatorInterface.getDeveloperInfo() has to be used
	//We cannot use CalculatorInterface obj=new MyScientificCalculatorExDefault();
	//because 
}
//In interfaces from java 8 u can use static and default can be used so that not all the methods 
//present in interface has to be used in a class that implements it
//Ex; in arithmetic calculator u dont hv to use power and sqrt so they can be made default in calculatorinterface(here)
