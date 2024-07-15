package com.grayMatter;
import java.util.*;
public class CalculatorIf {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a,b;
		char c;
		System.out.println("enter 2 num");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Enter operator");
		c=sc.next().charAt(0);
		if(c=='+')
			System.out.println(a+b);
		else if(c=='-')
			System.out.println(a-b);
		else if(c=='*')
			System.out.println(a*b);
		else if(c=='/')
			System.out.println(a/b);
		else 
			System.out.println("Invalid operator");
			
		

	}

}
