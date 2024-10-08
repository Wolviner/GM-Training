package com.grayMatter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.grayMatter.beans.Book;
import com.grayMatter.beans.Employee;
import com.grayMatter.config.BookConfig;


public class App 
{
    public static void main( String[] args )
    {
//        ApplicationContext context=new ClassPathXmlApplicationContext("employee-bean.xml");
//        Employee emp=context.getBean(Employee.class);
//        System.out.println(emp);
    	
    	ApplicationContext context=new AnnotationConfigApplicationContext(BookConfig.class);
    	Book book=(Book)context.getBean("book");
    	System.out.println(book);
    	
    }
}
