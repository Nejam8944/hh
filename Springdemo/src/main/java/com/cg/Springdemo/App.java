package com.cg.Springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args ) {
    	
//    	ApplicationContext contex = new AnnotationConfigApplicationContext(AppConfig.class);
//    	Employee emp1 = (Employee) contex.getBean("getEmployee");
    	
    	
    	ApplicationContext contex2 = new ClassPathXmlApplicationContext("spring.xml");
    	
    	System.out.println(contex2.getBean("emp3"));
    	
//    	//Singleton
//    	Employee emp1 = (Employee) contex2.getBean("emp1");
//    	System.out.println(emp1);
//    	emp1.setName("Rahul");
//    	System.out.println(emp1);
//    	
//    	Employee emp5 = (Employee) contex2.getBean("emp1");
//    	System.out.println(emp5);
//    	
//    	System.out.println("*****************************************************");
//    	
//    	//prototype
//    	Employee emp3 = (Employee) contex2.getBean("emp2");
//    	System.out.println(emp3);
//    	emp3.setName("Rahul");
//    	System.out.println(emp3);
//    	
//    	Employee emp4 = (Employee) contex2.getBean("emp2");
//    	System.out.println(emp4);
//    	Employee emp2 =  (Employee)contex.getBean("emp2");
//    	System.out.println(emp2.getName());
    	
    }
     
}
