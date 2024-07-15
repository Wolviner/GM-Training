package com.grayMatter;
import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		char c;
		System.out.println("enter 2 num");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Enter operator");
		c=sc.next().charAt(0);
		
		switch(c) {
		
		case '+': System.out.println(a+b);break;// if no break then rest of case gets executed called fall through
		case '-': System.out.println(a-b);break;
		case '*': System.out.println(a*b);break;
		case '/': System.out.println((float)a/b);break;
		default:
			System.out.println("Inavlid operator");
		}

	}

}
