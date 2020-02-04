package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.BookDAO;
import com.example.demo.model.Book;

@SpringBootApplication
public class SpringbootJpaIntegrationApplication implements CommandLineRunner {

	private BookDAO bookDAO;
	
	@Autowired
	public SpringbootJpaIntegrationApplication(BookDAO bookDAO) {
		super();
		this.bookDAO = bookDAO;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJpaIntegrationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		bookDAO.save(new Book(100,"Book-1","English","Author-1"));
		bookDAO.save(new Book(101,"Book-2","English","Author-2"));
		bookDAO.save(new Book(102,"Book-3","English","Author-3"));
		bookDAO.save(new Book(103,"Book-4","English","Author-4"));
		bookDAO.save(new Book(104,"Book-5","English","Author-5"));
		bookDAO.save(new Book(105,"Book-6","English","Author-6"));
	
	}

	
	
}