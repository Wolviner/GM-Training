package com.grayMatter;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.grayMatter.dao.EmployeeDao;
import com.grayMatter.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("jdbc-bean.xml");
        EmployeeDao dao=(EmployeeDao)context.getBean("empdao");
       int i=dao.addEmployee(new Employee(27,"thankan",233273));
       System.out.println("row inserted");
       
       List<Employee> empList=dao.getAllEmployee();
       for(Employee emp:empList)
    	   System.out.println(emp);
       
       dao.updateEmployee(new Employee(23,"ponner",23327317));
       System.out.println("row updated, updated table is:");
       for(Employee emp:empList)
    	   System.out.println(emp);
       dao.deleteEmployee(new Employee(23,"ponner",23327317));
       
       System.out.println("Employee By ID: "+dao.getEmployeeById(26));
    }
}
