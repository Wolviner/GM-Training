package com.grayMatter;

public class DemoOnStatic {
	//Static block has more priority than static main method
	//Static methods are invoked by JVM directly rather than creating an object in case of nonstatic methods
	//Static methods are class methods so it can be accessed through class name as well as by creating an object for it
    //Static variables are to the whole of class so if u change it however even through objects the value of the variable changes for entirety of its
	//existence (only a single copy of variable for whole of class ie it is shared)
	//Static variables to be written for within class(outside methods not inside)
	static String thorappan;
	public static void sayHello() {
	
	System.out.println("Hello");
}
static {
	System.out.println("Static Block1");
	
}
static {
	System.out.println("Static Block2");
	
}
static {
	System.out.println("Static Block3");
	
}
	public static void main(String[] args) {
		DemoOnStatic.sayHello();//same as sayHello()
		DemoOnStatic ds1=new DemoOnStatic();
		ds1.sayHello();//same as sayHello()
		//sayHello();
        System.out.println("Indise Main Method");
        main();//DemoOnStatic.main();(same as main())
	}
	public static void main() {
		System.out.println("Static main without argument");
	}
	static {
		System.out.println("Static Block4");
		
	}
}

//javac Hello.java-------Hello.class
//java Hello.main
