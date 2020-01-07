package comm.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



import java.util.UUID;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class Task {
	private String taskId;
	private String author;
	private String taskName;
	
	public Task createTask(String author,String taskName) {
		Task task=new Task();
		task.setTaskName(taskName);
		task.setAuthor(author);
		task.setTaskId(UUID.randomUUID().toString());
		return task;
		
	}
	public String getTaskDetails()
	{
		return "Task Id: "+getTaskId()+
				" Task name: "+getTaskName()+" Created by: "+getAuthor();
	}
}
