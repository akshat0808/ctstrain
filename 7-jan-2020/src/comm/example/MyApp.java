package comm.example;

import java.util.UUID;

public class MyApp {

	public static void main(String[] args) {
		Coach myCoach1=new Coach(UUID.randomUUID().toString(),"akshat","vishnoi","tennis");
		Coach myCoach2=new Coach(UUID.randomUUID().toString(),"akshat","vishnoi","cricket");
		System.out.println("Coach1 Details: \n"+myCoach1+"\nCoach2 Details: \n"+myCoach2);
		System.out.println(myCoach1==myCoach2 );
		System.out.println(myCoach1.equals(myCoach2));

	}

}
