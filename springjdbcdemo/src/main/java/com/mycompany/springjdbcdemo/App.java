package com.mycompany.springjdbcdemo;

import java.util.UUID;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Hello world!
 *
 */
@Component
public class App 

	
	{
		
	    public static void main( String[] args )
	    {
	      try {
	    	  ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	    	  CustomerDao dao=context.getBean("dao",CustomerDao.class);
	    	 // String str[]=UUID.randomUUID().toString().split("-");
	    	  Customer c=dao.createCustomer(new Customer(UUID.randomUUID().toString(),"Akshat", "Vishnoi", "abc@email.com"));
	    	  Customer c1=dao.createCustomer(new Customer(UUID.randomUUID().toString(),"Akki", "akki", "aabc@email.com"));
	    	  System.out.println(c+"\n"+c1);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	    }
	}
	
   
