package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.BookDAO;
import com.example.demo.model.Book;

@SpringBootApplication
public class SpringbootJpaIntegration1Application implements CommandLineRunner {

	private BookDAO bookDAO;
	
	@Autowired
	public SpringbootJpaIntegration1Application(BookDAO bookDAO) {
		super();
		this.bookDAO = bookDAO;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJpaIntegration1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		bookDAO.save(new Book(100,"Chup Rehne Ka","English","Tinku Hatela"));
		bookDAO.save(new Book(101,"Baaju Hatt","English","Baabu Chhapri"));
		bookDAO.save(new Book(102,"Seedhe Pahad Se","English","Choti Chhapariya"));
		bookDAO.save(new Book(103,"Aao Art Karein","English","Pablo Bhai"));
		bookDAO.save(new Book(104,"Khelo","English","Chotu Chatka"));
		bookDAO.save(new Book(105,"Salaam","English","Rocky Bhai"));
	
	}

	
	
}