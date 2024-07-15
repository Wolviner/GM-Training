package com.grayMatter;
import java.util.*;
import java.math.*;
public class Prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//to show error in highlight
//		System.err.println("Error message");
		System.out.println("Enter a num");
		int num=sc.nextInt();
		int i=2;
		if(num==0 || num==1)
			System.out.println("Not a prime");
		boolean flag=true;
		while(i<=Math.sqrt(num))
		{
			if(num%i==0)
			{
				flag=false;
				break;
			}
			i++;
		}
		if (flag)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");

	}

}
