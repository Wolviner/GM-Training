package com.Assignment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Predicate;

public class PersonClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Person> ap=new ArrayList<Person>();
		
		ap.add(new Person("Alice", 40, LocalDate.of(1984, 7, 15)));
        ap.add(new Person("Bob", 30, LocalDate.of(1994, 5, 25)));
        ap.add(new Person("Amy", 45, LocalDate.of(1979, 9, 5)));
        ap.add(new Person("Anna", 25, LocalDate.of(1999, 12, 10)));
        ap.add(new Person("Andrew", 50, LocalDate.of(1974, 3, 20)));
        
        Predicate<Person> predicate = person ->
        person.getAge() > 35 && person.getName().toUpperCase().startsWith("A");
        		
        		for(Person i:ap) {
        			if(predicate.test(i))
        				System.out.println(i.getName());
        		}

	}

}
