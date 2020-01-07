package comm.example;
import java.util.Scanner;

public class Tester {
	public static final int MAX=5;
	
	private static Scanner scanner= new Scanner(System.in);

	public static void main(String[] args) 
	{
		int counter=-1;
		ToDo todos[]=new ToDo[MAX];
		int choice =0;
		ToDo todo=new ToDo();
		ToDo temoToDo=null;
		do {
			
		
		System.out.println("1.add new todo.");
		System.out.println("2.display all todo.");
		System.out.println("0.exit");
		System.out.println("select your choice");
		//System.out.println("");
		choice=scanner.nextInt();
		ToDo tempToDo;
		switch(choice) {
		case 1:
			if(counter==MAX-1)
			{
				System.out.println("Cant not create more todo...");
				break;	
			}
			System.out.print("task author: ");
			String author=scanner.next();
			System.out.print("task name: ");
			String taskName=scanner.next();
			System.out.print("Is Completed? ");
			boolean isCompleted=scanner.nextBoolean();
			tempToDo=todo.createToDo(author, taskName, isCompleted);
			todos[++counter]=tempToDo;
			break;
		case 2:
			for(int i=0;i<counter;i++)
			{
				System.out.println("\n"+todos[i].getToDoDetails());
			}
			break;
		case 0:
			System.exit(0);
			System.out.println("bye!!!!");

		default:
			System.out.println("invalid choice");
			break;
		}
		}
		while (choice!=0);
		/*
		ToDo todo = new ToDo(new Task(),new RandomFortuneService());
		todo.createToDo("john", "Learning angular", false);
		System.out.println(todo.getToDoDetails());
		// TODO Auto-generated method stub
*/
	}

}
