package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.ToDo;

@Repository

public class ToDoDAOImpl implements ToDoDAO {
	
	private List<ToDo> todoList;
	{
		todoList=new ArrayList<ToDo>();
		todoList.add(new ToDo("1001", "Akshat"));
		
		todoList.add(new ToDo("1002", "Sakshi"));
		todoList.add(new ToDo("1003", "Khatri"));
		
		todoList.add(new ToDo("1004", "Vishnoi"));
		todoList.add(new ToDo("1005", "ABC"));
	}
	
	

	@Override
	public List<ToDo> getAllToDos() {
		// TODO Auto-generated method stub
		return todoList;
	}

}
