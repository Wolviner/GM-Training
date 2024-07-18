package assignment;

public class Main {
    public static void main(String[] args) {
    	EmployeeArray[] employees = {
            new EmployeeArray("Milton", 99,876353),
            new EmployeeArray("Milan", 2, 243424165),
            new EmployeeArray("Kannapi", 5332, 43545),
        };

    	EmployeeArray maxNetSalaryEmployee = employees[0];

        for (EmployeeArray emp : employees) {
            System.out.println("Name: " + emp.getName() + ", ID: " + emp.getId() +
                               ", Salary: " + emp.getSalary() + ", Gross Salary: " + emp.getGrossSalary() +
                               ", Net Salary: " + emp.getNetSalary());

            if (emp.getNetSalary() > maxNetSalaryEmployee.getNetSalary()) {
                maxNetSalaryEmployee = emp;
            }
        }

        System.out.println("\nEmployee with Max Net Salary:");
        System.out.println("Name: " + maxNetSalaryEmployee.getName() + ", ID: " + maxNetSalaryEmployee.getId() +
                           ", Net Salary: " + maxNetSalaryEmployee.getNetSalary());
    }
}
