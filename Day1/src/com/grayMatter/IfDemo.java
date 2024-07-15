package com.grayMatter;

import java.util.*;

public class IfDemo {

	public static void main(String[] args) {
//		boolean flag=true;
//		if(flag==true)
//		{
//				System.out.println("hello");
//		}
//		else 
//			System.out.println("Bye");
//		
//		Scanner sc=new Scanner(System.in);
//		int num1,num2;
//		System.out.println("Enter 2 nums");
//		num1=sc.nextInt();
//		num2=sc.nextInt();
//		
//		if(num1>num2)
//			System.out.println("num1 is greater"+num1);
//		else
//			System.out.println("num2 is greater"+num2);
		
//		---------------------------------
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a num to check");
//		int num=sc.nextInt();
//		if (num%2==0)
//			System.out.println("even");
//		else
//			System.out.println("odd");
		//MAX of 3
		
		int a,b,c;
		System.out.println("Enter 3 nums");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(a>b && a>c) 
				System.out.println("A is max");
		else if (b>a && b>c)
				System.out.println("B is max");
		else 
			System.out.println("C is max");
	}

}
