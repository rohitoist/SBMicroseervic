package com.lcwd.UserService.UserService.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserServiceController {

	@RequestMapping("/")
	public String getServiceName() {
		return"User Service";
	}
}
