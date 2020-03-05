package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProxyController {
	
	
	@Autowired
	private UserServiceClient userServiceClient;
	@RequestMapping("/groups")
	public List<Groups> getAllGroups(){
		
		return userServiceClient.getAllGroups();
	}

}
