package com.Assignment;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class EmployeeClass {

    public static void main(String[] args) {
        
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 101, 60000));
        employees.add(new Employee("Alice", 102, 45000));
        employees.add(new Employee("Bob", 103, 70000));
        employees.add(new Employee("Carol", 104, 30000));
        employees.add(new Employee("David", 105, 80000));
        employees.add(new Employee("Eve", 106, 40000));
        employees.add(new Employee("Frank", 107, 55000));
        employees.add(new Employee("Grace", 108, 48000));
        employees.add(new Employee("Henry", 109, 62000));
        employees.add(new Employee("Ivy", 110, 35000));

        
        Predicate<Employee> above50k = e -> e.getSalary() > 50000;
//        Predicate<Employee> belowOrEqual50k =  e -> e.getSalary() <= 50000;

       
        employees.forEach(employee -> {
            if (above50k.test(employee)) {
                employee.setSalary(employee.getSalary() + 5000);
            } 
            else {
            	
                employee.setSalary(employee.getSalary() + 2000);
            }
        });

        
        employees.forEach(x -> System.out.println(x));
    }
}

//Using Function instead of predicate
//import java.time.LocalDate;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.function.Consumer;
//import java.util.function.Function;
//
//public class EmployeeManagement {
//
//  public static void main(String[] args) {
//      // Create a list of Employee objects
//      List<Employee> employees = new ArrayList<>();
//      employees.add(new Employee("John", 101, 60000));
//      employees.add(new Employee("Alice", 102, 45000));
//      employees.add(new Employee("Bob", 103, 70000));
//      employees.add(new Employee("Carol", 104, 30000));
//      employees.add(new Employee("David", 105, 80000));
//      employees.add(new Employee("Eve", 106, 40000));
//      employees.add(new Employee("Frank", 107, 55000));
//      employees.add(new Employee("Grace", 108, 48000));
//      employees.add(new Employee("Henry", 109, 62000));
//      employees.add(new Employee("Ivy", 110, 35000));
//
//      // Define a function to calculate bonus based on salary
//      Function<Employee, Double> bonusCalculator = employee -> {
//          if (employee.getSalary() > 50000) {
//              return 5000.0 + employee.getSalary; // Bonus of 5000 for salary > 50000
//          } else {
//              return 2000.0+employee.getSalary; // Bonus of 2000 for salary <= 50000
//          }
//      };
//
//      // Apply bonuses using lambda expressions and function
//      employees.forEach(employee -> {
//          double bonus = bonusCalculator.apply(employee);
//          employee.setSalary(employee.getSalary() + bonus);
//      });
//
//      // Print employees after applying bonuses
//      employees.forEach(System.out::println);
//  }
//}

