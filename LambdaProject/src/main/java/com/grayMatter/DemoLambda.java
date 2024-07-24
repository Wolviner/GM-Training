package com.grayMatter;


//lambda is anonymous expression, no object is expected, similar to inline function
//interface hvng single abstr method is called fntnl intrfce
//lambda can be used with fntnl interface, collections, and on streams
interface HelloInterface {
	public String sayHello();
}

interface PrintNameInterface{
	public void printName(String name);
}

interface AdditionInterface
{
public int add(int a,int b);
}

interface DisplayInterface
{
public void display();
}
public class DemoLambda //implements HelloInterface (when lambda isnt used )
{
	public static void main(String[] args)  {
//		HelloInterface hi=new DemoLambda();
//		System.out.println(hi.sayHello());
		
		
		HelloInterface hi1=()->"Hello";//no parameters but with return
		System.out.println(hi1.sayHello());
//		OR
		HelloInterface hi=()->{//no parameters but with return
			return "Hello";
		};
		System.out.println(hi.sayHello());
		
		PrintNameInterface pni=(name)->System.out.println(name);//with par no return
		pni.printName("Milton");
		
		AdditionInterface ai=(a,b)->a+b;//with par and with return
		System.out.println(ai.add(100, 200));
		
		DisplayInterface d1=()-> System.out.println("Dispaly");//no par and no return
		d1.display();
		
	}
	
	
	
	
	//When Not using lambda this is required
//	@Override
//	public String sayHello() {
//		return "Hello..";
//	}
}
