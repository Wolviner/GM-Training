package com.grayMatter;

public  abstract class AbstractClass {
	//Abstract cannot be applied at property level
private String name;
	public String printName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
		return this.name;
	}

	public abstract void sayHello(); {
		// TODO Auto-generated method stub
		
	}

}
//If a method is abstract the its class must also be abstract
