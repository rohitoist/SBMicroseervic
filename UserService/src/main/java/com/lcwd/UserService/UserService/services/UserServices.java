package com.lcwd.UserService.UserService.services;

import java.util.List;
import java.util.Optional;

import com.lcwd.UserService.UserService.entities.User;

public interface UserServices {

	User saveUser(User user);
	
	List<User> getAlluser();
	
	User getUser(String userId);
	
	void deleteUser(String userId);
	
}
