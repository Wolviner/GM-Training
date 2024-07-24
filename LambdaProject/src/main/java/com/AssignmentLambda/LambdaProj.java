package com.AssignmentLambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class LambdaProj {
	public static void main(String[] args) {
		//implement a lambda exprsn to sort strings in alphabetical order
//		List<String> strings = Arrays.asList(,"apple", "orange",  "grape");
		ArrayList<String> strings =new ArrayList<>();
		strings.add("banana");
		strings.add("orange");
		strings.add("grape");
		
		strings.stream()
		.sorted((s1, s2)->s1.compareToIgnoreCase(s2))
		.forEach(i->System.out.println(i));
		
		//lambda exprsn to find average of list of doubles
		List<Double> doubles = Arrays.asList(1.5, 2.5, 3.5, 4.5);
		double average = doubles.stream().mapToDouble(d -> d).average().orElse(0.0);
		System.out.println("Average: " + average); 
		
		//lambda exprsn to check num is prime
		int[] arr = {19, 31, 53, 67, 89, 113, 137, 163, 211, 257};

		
		Predicate<Integer> isPrime = val ->{
			if(val <= 1)
				return false;
			for(int i=2; i<=Math.sqrt(val);i++)
				if(val % i == 0)
					return false;
			return true;
		};
		
		
        for (int temp : arr) {
        	if(isPrime.test(temp))
        		System.out.println(temp + " : is a Prime Number");
        	else
        		System.out.println(temp + " : is Not a Prime Number");
        }
		
		//lambda exprsn to count the number of words in paragraph
		String paragraph = "This is a sample paragraph with some words in it.";
		long wordCount = Arrays.stream(paragraph.split("\\s+")).count();
		System.out.println("Word count: " + wordCount); 
		
		//lambda exprsn to concat two strings
		String str1 = "CON";
		String str2 = "CAT";
		
		String str3 = Stream.concat(Stream.of(str1), Stream.of(str2)).reduce((a,b)->a+b).orElse("UnAble to concat two Strings!!");
		System.out.println(str3);
		



	}

}
