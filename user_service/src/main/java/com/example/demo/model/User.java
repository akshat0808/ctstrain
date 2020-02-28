package com.example.demo.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;


@Data
@Document
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer userId;
	private String name;
	private String email;
	
	

}
