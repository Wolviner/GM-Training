package com.grayMatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


public class StreamProject {

		public static void main(String[] args) {
			Integer arr[]=new Integer[] {10,45,23,78,44,90};
//			Arrays.stream(arr).forEach(i->System.out.println(i));
//			System.out.println("^^^^^^^^^   "+Arrays.stream(arr));
			
			Arrays.stream(arr)//stream generation
			.limit(5)//limit number of elements taken here its 5
			.filter(i->i%2==0)
			.map(i->i+10)//intermediate operations
			.forEach(i->System.out.println(i));//stream operation

			
			List<Integer> list=Arrays.stream(arr)
			.limit(5)
			.filter(i->i%2==0)
			.map(i->i+10)//intermediate operations
			.collect(Collectors.toList());//to convert to list
			
			ArrayList<Integer> aa=new ArrayList<Integer>();
			aa.add(34);
//			aa.add(34);
			aa.add(12);
			aa.add(39);
			aa.add(900);
			
			ArrayList<String> alist=new ArrayList<String>();
			alist.add("Kuttz");
			alist.add("Kuttz");
			alist.add("Rathume");
			
//			alist.stream().filter(null)
			
			alist.stream()
			.filter(s->s.endsWith("e"))
			.map(s->s.toUpperCase())
			.forEach(s->System.out.println(s));
			
			System.out.println(Arrays.stream(arr).skip(3).reduce(0,(a,b)->a+b)+"\n**********");
			//reduce perform operation required
			
			//factorial
			
			Arrays.stream(arr).map(i->{
				int f=1;
				for(int j=1;j<=i;j++)
					f*=j;
				return f;
			}).forEach(i->System.out.println(i));
			
			System.out.println(Arrays.stream(arr).mapToInt(i->i).sum());
			System.out.println(Arrays.stream(arr).mapToInt(i->i).max());
			System.out.println(Arrays.stream(arr).mapToInt(i->i).min());
			System.out.println("*****************\n\n");
			
			Arrays.stream(arr).mapToInt(i->i).sorted().forEach(i->System.out.println(i));//to sort
			
			System.out.println(Arrays.asList(arr).stream().mapToInt(i->i).max().getAsInt());
			System.out.println(Arrays.asList(arr).stream().max(Integer::compareTo).get());
		Integer arr1[]= {1,2,3,4,5};	
		
		System.out.println("*******"+aa.stream().sorted().skip(1).findFirst().get());//to find 2nd element
		
		System.out.println("$$$$$  "+aa.stream().sorted().skip(aa.size()-2).findFirst().get());//to find 2nd last element
		
		
		
//		COnverting hashmap to set
		
		HashMap<Integer,String> hm=new HashMap<Integer, String>();
		  hm.put(1, "One");
	        hm.put(2, "Two");
	        hm.put(3, "Three");

	        // Convert HashMap to Set using entrySet()
	        Set<Map.Entry<Integer, String>> entrySet = hm.entrySet();

	        // Create a HashSet to store entries
	        Set<Map.Entry<Integer, String>> set = new HashSet<>(entrySet);

	        // Print the set
	        for (Map.Entry<Integer, String> entry : set) {
	            System.out.println(entry.getKey() + " => " + entry.getValue());
		
		
		}

	

		}
		}

//implement a lambda exprsn to sort strings in alphabetical order
//lambda exprsn to find average of list of doubles
//lambda exprsn to check num is prime
//lambda exprsn to count the number of words in paragraph

//create a person class with the properties name,age,city,aadhar num, create a hashset of n
//numbers of person and check for whether person is eligible for casting vote or else throw
//AgeNotSufficientException using streams

