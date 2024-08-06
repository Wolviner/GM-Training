package com.grayMatter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.grayMatter.beans.Customer;
import com.grayMatter.beans.HelloBeans;
import com.grayMatter.beans.Order;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        HelloBeans hb=new HelloBeans();
//        hb.sayHello();
        
        ApplicationContext context=new ClassPathXmlApplicationContext("hello-bean.xml");
        HelloBeans hb=(HelloBeans) context.getBean("hello");//down casting
        hb.sayHello();
//        
//        HelloBeans hb1=(HelloBeans) context.getBean("hello");//down casting
//        hb1.sayHello();
//        
//        Customer c =new Customer("Thaor",100,"345345345");
//        System.out.println();
        
    	
//        ApplicationContext context1=new ClassPathXmlApplicationContext("customer-bean.xml");
//       Customer c1=(Customer) context1.getBean("cust");
//       System.out.println(c1);
//       
//       Customer c2=(Customer) context1.getBean("cust1");
//       System.out.println(c2);
//       
//       ApplicationContext context2=new ClassPathXmlApplicationContext("customer-bean.xml");
//       Customer c3=(Customer) context2.getBean("cust2");
//       System.out.println(c3);
//       
//       Order ord=(Order)context2.getBean("ord");
//       System.out.println(ord);
    }
}
