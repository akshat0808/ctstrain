package comm.example.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="todo")


public class Todo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="todo_name")
	private String todoName;
	@Column(name="date")
	private String date;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="task_id")
	private Task task;
	
	
	public Todo() {
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTodoName() {
		return todoName;
	}


	public void setTodoName(String todoName) {
		this.todoName = todoName;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public Task getTask() {
		return task;
	}


	public void setTask(Task task) {
		this.task = task;
	}


	@Override
	public String toString() {
		return "Todo [id=" + id + ", todoName=" + todoName + ", date=" + date + ", task=" + task + "]";
	}


	public Todo(String todoName, String date) {
		super();
		this.todoName = todoName;
		this.date = date;
	}
	
	

	



	
	

}
