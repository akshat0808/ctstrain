package comm.example.spring.hibernate.demo;

import java.util.UUID;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import comm.example.spring.hibernate.demo.entity.UserDetail;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
       try {
		
    	   ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
           UserService service=context.getBean("service",UserService.class);
           UserDetail userd=new UserDetail();
           String str[]=UUID.randomUUID().toString().split("-");
           userd.setUserId(str[0]);
           userd.setUserName("akshat");
           userd.setEmail("abc@gmail.com");
           service.createUser(userd);
           System.out.println(userd);
	} catch (Exception e) {
		e.printStackTrace();
	}
        
    }
}
