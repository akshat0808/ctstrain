package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.UserDao;
import com.example.demo.model.User;

@Service
public class UserServcieImpl implements UserService {
	
	private UserDao userDao;

	public UserServcieImpl(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	@Transactional
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return userDao.save(user);
	}

	@Override
	@Transactional
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

	@Override
	public Optional<User> findById(Integer userId) {
		// TODO Auto-generated method stub
		return userDao.findById(userId);
	}

	@Override
	public void deleteUser(Integer userId) {
		// TODO Auto-generated method stub
		
		userDao.deleteById(userId);
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		userDao.deleteAll();
		
	}
	
	
	

}
