package com.grayMatter;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.grayMatter.beans.Student;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
//        ApplicationContext context=new ClassPathXmlApplicationContext("student-bean.xml");
//        Student st=(Student) context.getBean("student");
//        System.out.println(st);
       
        ApplicationContext context1=new ClassPathXmlApplicationContext("student-bean.xml");
        Student st1=(Student) context1.getBean("student1");
        System.out.println(st1);
        
        ApplicationContext context2=new ClassPathXmlApplicationContext("student-bean.xml");
        Student st2=(Student) context2.getBean("student2");
        System.out.println(st2);
        
        Student st3=(Student) context1.getBean("student1");
        System.out.println(st3);
        System.out.println(st3.hashCode());//same hash
        Student st4=(Student) context1.getBean("student1");
        System.out.println(st4.hashCode());//same hash
        
//        ApplicationContext context3=new ClassPathXmlApplicationContext("student-bean.xml");
//        Student st3=(Student) context3.getBean("student3");
//        System.out.println(st3);
        
        XmlBeanFactory factory=new XmlBeanFactory(new ClassPathResource("bean-new.xml"));
        DataSource ds=(DataSource) factory.getBean("dbCon");
        Connection con=ds.getConnection();
        if(con!=null)
        	System.out.println("Connection established");
    }
}
