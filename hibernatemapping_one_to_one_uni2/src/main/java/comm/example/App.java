package comm.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import comm.example.entity.Todo;
import comm.example.entity.Task;


public class App 
{
    public static void main( String[] args )
    {
        try {
        	SessionFactory factory= new Configuration().configure().addAnnotatedClass(Task.class).addAnnotatedClass(Todo.class).buildSessionFactory();
        	Session session=factory.openSession();
        	Todo todo=new Todo("akshat","01-01-2020");
			todo.setTask(new Task("design","akki"));
			session.getTransaction().begin();
			session.save(todo);
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
