package com.grayMatter;

/**
 * Hello world!
 *
 */
public class App 
{
	public static String printName(String name) {
//		System.out.println(name);
		return name;
	}
	
	public static double add(double d ,double e) {
		return d+e;
	}
	public static int sub(int a ,int b) {
		return a-b;
	}
	public static int mul(int a ,int b) {
		return a*b;
	}
	public static double div(double a ,double b) {
		return a/b;
	}
	

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        printName("user");
    }
}
