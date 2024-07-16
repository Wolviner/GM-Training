package com.grayMatter;

import com.grayMatter.DemoAccessModifiers;

public class DemoClass{
	
	public String name;//Package level
	
	DemoAccessModifiers.Inner obj=new DemoAccessModifiers().new Inner();
	
	
	//Protected
	
	
	
	
}

              //Property                               //Method                              //Class

//Public      Within project(across packages)         Within project(across packages)        

//Private     Within same class                       Within same class                      Cannot be given in outer class level but only at inner class level

//Protected   Within same package across classes
             // and by subclasses

//Default     Within same package across classes      Within same package across classes