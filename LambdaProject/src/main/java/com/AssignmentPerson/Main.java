package com.AssignmentPerson;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        
        Set<Person> persons = new HashSet<>();
        try {
            persons.add(new Person("Alice", 25, "New York", "1234567890"));
            persons.add(new Person("Bob", 17, "Los Angeles", "0987654321"));
            persons.add(new Person("Charlie", 30, "Chicago", "5678901234"));
        } catch (AgeNotSufficientException e) {
            System.out.println(e.getMessage());
        }

        persons.stream()
               .filter(person -> person.getAge() >= 18)
               .forEach(person -> System.out.println(person.getName() + " is eligible for voting."));
    }
}
