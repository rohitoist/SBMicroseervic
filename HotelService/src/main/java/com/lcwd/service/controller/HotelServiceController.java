package com.lcwd.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hotels")
public class HotelServiceController {

	@GetMapping("/")
	public String getServiceName() {
		return "Hotel Service Called!!!";
	}
}
