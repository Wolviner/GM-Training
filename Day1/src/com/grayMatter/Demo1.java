package com.grayMatter;

public class Demo1 {

	public static void main(String[] args) {
		int num=5;
		System.out.println("num ="+num);
		boolean flag=false;
		System.out.println(flag);
		
		int num1=99,num2=11,num3=87;
		int sum,mul,div,sub;
		sum=num1+num2;
		mul=num1*num2;
		div=num1/num2;
		sub=num1-num2;
		System.out.println("sumConcat"+num1+num2);
		System.out.println("sum"+(num1+num2));
		System.out.println("diff"+sub);
		System.out.println("mul"+mul);
		System.out.println("div"+div);
		System.out.println("divDec"+((float)(num1/num2)));
		
		System.out.println("Max of 2 nums"+(num1>num2?num1:num2));
		System.out.println("Max of 3 nums"+(num1>num2?num1>num3?num2:num1:num3));
		
		int a=10,b=20,c=30;
		int d=(a>b && a>c)?a:(b>c?b:c);
		
		int e=a>b? (a>c?a:c) : (b>c?b:c);
		System.out.println(e);
		System.out.println(d);
		
		//Swapping
		int temp=a;
		a=b;
		b=temp;
		//2 nos
		a=a+b;
		b=a-b;
		a=a-b;
		//3 nos
		a=a+b+c;
		b=a-b-c;
		c=a-b-c;
		a=a-b-c;
		//Check even
		System.out.println(a%2==0?"even":"odd");
		
		int i=3,j=5;
		System.out.println(i&j);
		System.out.println(i|j);
		System.out.println(60>>3);//consider floor value, half of original val by 3 times
		System.out.println(-60>>3);//consider ceil for -ve
		System.out.println(~3);
		
		//Casting
		i=10;
		float f=i; //Widening casting (implicit)
		
		float f1=5.6f;
		i=(int)f1;//Narrowing (Explicit)
		
		
		
	}

}
