package com.grayMatter.assg;

public class IfElseMax {

	public static void main(String[] args) {
		int a=10,b=20,c=30,d=40,e=50;
		//4 variable
		
		if(a>=b&&a>=c&&a>=d)
			System.out.println(a);
		else if(b>=c&&b>=d)
			System.out.println(b);
		else if(c>=d)
			System.out.println(c);
		else
			System.out.println(d);
		
		//5 variable
		
		if(a>=b&&a>=c&&a>=d&&a>=e)
			System.out.println(a);
		else if(b>=c&&b>=d&&b>=e)
			System.out.println(b);
		else if(c>=d&&c>=e)
			System.out.println(c);
		else if (d>=e)
			System.out.println(d);
		else 
			System.out.println(e);
		

	}

}
