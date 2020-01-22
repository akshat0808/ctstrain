package comm.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import comm.example.entity.Instructor;
import comm.example.entity.InstructorDetail;


public class App 
{
    public static void main( String[] args )
    {
        try {
        	SessionFactory factory= new Configuration().configure().addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Instructor.class).buildSessionFactory();
        	Session session=factory.openSession();
        	Instructor instructor=new Instructor("Akshat", "Vishnoi", "abc@gmail.com");
			instructor.setInstructorDetail(new InstructorDetail("https://www.youtube.com/akshat", "Volleyball"));
			session.getTransaction().begin();
			session.save(instructor);
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
