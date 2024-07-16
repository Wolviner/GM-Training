package com.grayMatter;

public class ChildClass extends FinalClass//If FinalClass is final it can be extended
{
//public ChildClass(String name) {
//		super(name);
//	}//If FinalClass property (variable) ie name is final and its initialised through constructor then
	//this should be added

public void printCompanyDeatils(){
	System.out.println("My company name is"+companyName);
}
}
