package com.lcwd.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hotels")
public class HotelServiceController {

	@RequestMapping("/")
	public String getServiceName() {
		return "Hotel Service Called!!!";
	}
}
