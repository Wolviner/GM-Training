package assignment;





public class AbstractMainClass {
    public static void main(String[] args) {
        Customer customer = new Customer("Thankan", 333, "Software Developer");
        Employee employee = new Employee("Milton", 222, "Engineering");
        Admin admin = new Admin("Milan", 01, "Manager");

        customer.getDetails();
        employee.getDetails();
        admin.getDetails();

        customer.setDetails("Milton", 11);
        employee.setDetails("James ", 002);
        admin.setDetails("Lupin", 03);

        customer.getDetails();
        employee.getDetails();
        admin.getDetails();
    }
}