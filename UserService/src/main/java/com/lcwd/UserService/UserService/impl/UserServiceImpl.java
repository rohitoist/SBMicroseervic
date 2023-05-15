package com.lcwd.UserService.UserService.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwd.UserService.UserService.entities.User;
import com.lcwd.UserService.UserService.exception.ResourceNotFound;
import com.lcwd.UserService.UserService.repositories.UserRepository;
import com.lcwd.UserService.UserService.services.UserServices;

@Service
public class UserServiceImpl implements UserServices {
 
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User saveUser(User user) {
		user.setUserId(UUID.randomUUID().toString());
		return userRepository.save(user);
	}

	@Override
	public List<User> getAlluser() {
		return userRepository.findAll();
	}

	@Override
	public User getUser(String userId) {
		return userRepository.findById(userId).orElseThrow( () -> new ResourceNotFound("user not found with id :"+ userId));
	}

	@Override
	public void deleteUser(String userId) {
		userRepository.deleteById(userId);
	}

}
