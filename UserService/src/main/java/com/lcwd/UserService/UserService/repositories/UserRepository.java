package com.lcwd.UserService.UserService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lcwd.UserService.UserService.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

	// we can add custom methods here
}
