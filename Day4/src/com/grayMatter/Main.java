package com.grayMatter;

public class Main {

	public static void main(String[] args) throws AgeNotSufficientException {
		// TODO Auto-generated method stub
		Person p=new Person("Milton",12,"762367526");
		
		if (p.getAge()<18)
			throw new AgeNotSufficientException("Age should be above 18");
		else
		{
			System.out.println("Eligible to vote");
			System.out.println(p);
		}

	}

}
