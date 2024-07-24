package com.grayMatter;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class BuilyInFunctionalInterface {
	public static void main(String[] args) {
		Consumer<Integer> cons=(i)->System.out.println(i);
		cons.accept(89);
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(56);
		al.add(57);
		al.add(58);
		al.add(59);
		
		al.forEach(cons);
		
		Supplier<String> supplier=()->"hello";
		System.out.println(supplier.get());
		System.out.println(supplier);//gives reference
		
		Predicate <Integer> predicate=(num)->num%2==0;//always return boolean
//		System.out.println(predicate.test(9000));
	    
		int arr[]= {100,23,32323,87};
		for(int i:arr) {
			if(predicate.test(i))
				System.out.println("Ibde"+i);
		}
		
		Function<Integer,Integer> function=(num)->{
			int fact=1;
			for(int i=1;i<=num;i++) 
				fact*=i;
			return fact;
			
		};
		System.out.println(function.apply(5));
		
	}
	
	  

}
//consider a clss person with name age and dob, create an aray list of 5persons
//print only those persons whose age isgreater than 35 and ame starts with a or A

//consider an employee class with properties name,id,salary
//create collection of 10 members and add bonus of 5000 id sal is above 50k 
//else give a bonus of 2k
