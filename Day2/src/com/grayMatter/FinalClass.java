package com.grayMatter;

public class FinalClass {

private final String name="Amit";//Constant cannot be changed since it is given final keyword
protected String companyName;
public void changeName(String name) {
	//this.name=name;(will give error)
}
//public FinalClass(String name) {
//	this.name=name;
//}


public  void printCompanyDetails() {
	System.out.println(this.companyName);
	
}

public final class InnerClass{
}
}

