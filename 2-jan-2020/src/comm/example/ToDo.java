package comm.example;

import java.time.LocalDate;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class ToDo
{
	private Task task;
	//private RandomFortuneService fortuneService;
	private String todoId;
	private LocalDate date;
	private boolean isCompleted;
	
	public ToDo(Task task /*RandomFortuneService fortuneservice*/) 
	{
		//super();
		this.task = task;
		//this.fortuneService=fortuneService;
	}
	public ToDo createToDo(String author,String taskName, boolean isCompleted)
	{
		/*if (task == null) {
			System.out.println("can't create task existing system");
			System.exit(0);
		}
		if(fortuneService==null)
		{
			System.out.println("bad day today. try again stay quiet stay healthy keep smiling.");
			System.exit(0);
			
		}
		*/
		task=new Task();
		ToDo todo=new ToDo();
		//System.out.println("Your Daily Fortune>>> "+fortuneService.getDailyFortune());
		System.out.println("creating new task.");
		task=task.createTask(author,taskName);
		//task.createTask(author,taskName);
		System.out.println("successfully created task \n creating new todo..");
		todo.setTodoId(UUID.randomUUID().toString());
		todo.setDate(LocalDate.now());
		todo.setCompleted(isCompleted);
		todo.setTask(task);
		return todo;
		
	}
	
	public String getToDoDetails()
{
		return getTask().getTaskDetails()+"todo id:"+getTodoId()+"todo date:"+getDate()+"completed:"+isCompleted;
}

	
}