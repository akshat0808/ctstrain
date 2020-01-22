package comm.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import comm.example.entity.Instructor;
import comm.example.entity.InstructorDetail;

public class GetInstructorDetailDemo 
{
	
	
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		try {
			int theId=1;
			session.getTransaction().begin();
			InstructorDetail tempInstructorDetail = session.get(InstructorDetail.class, theId);
			session.getTransaction().commit();
			System.out.println("tempInstructorDetail: " + tempInstructorDetail);
			System.out.println("the associated instructor: " + tempInstructorDetail.getInstructor());
			System.out.println("Done!");
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		finally
		{
			
			factory.close();
		}
	}
}
