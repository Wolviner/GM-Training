package EmpLinkedHashSet;


	


import java.util.LinkedHashSet;


public class LinkedHashSetEx {
    public static void main(String[] args) {

        LinkedHashSet<Employee> employees = new LinkedHashSet<>();

        employees.add(new Employee(1222, "Kora", "Business Analyst"));
        employees.add(new Employee(265, "Shubham", "Engineering"));
        employees.add(new Employee(3, "Thankan", "Produt Analyst"));
       
        
        for (Employee employee : employees) {
            System.out.println(employee);
        }


        employees.add(new Employee(1788, "Yoma", "SD Dev"));


        
        for (Employee employee : employees) {
            System.out.println(employee);
        }


        employees.remove(new Employee(3, "Thankan", "Produt Analyst"));

        
       
        for (Employee employee : employees) {
            System.out.println(employee);
        }

     
        System.out.println("See if employee is present" + employees.contains(new Employee(1222, "Kora", "Business Analyst")));

        employees.clear();
        //Cleared employee set
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
