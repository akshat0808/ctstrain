package comm.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import comm.example.entity.Course;
import comm.example.entity.Instructor;
import comm.example.entity.InstructorDetail;
public class CreateInstructorDemo {
	public static void main(String[] args) {
	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		try {			
			Instructor tempInstructor = 
					new Instructor("Akki", "Vishnoi", "av@cognizant.com");
			
			InstructorDetail tempInstructorDetail =new InstructorDetail("www.youtube/av.com","volleyball");		
			tempInstructor.setInstructorDetail(tempInstructorDetail);
			session.beginTransaction();
			System.out.println("Saving instructor: " + tempInstructor);
			session.save(tempInstructor);					
			session.getTransaction().commit();
			System.out.println("Done!");
		}
		finally {
			//session.close();
			factory.close();
		}
	}

}