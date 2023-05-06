
package com.lcwd.service.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/staffs")
public class HotelServiceStaffController {

	@RequestMapping("/")
	public String getServiceName() {
		return "staff Service Called!!!";
	}
	@RequestMapping("/getAllStaff")
	public ResponseEntity<List<String>> getAllStaff() {
		
		List list = Arrays.asList("Viru","sachin","virat","rohit");
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
	
	
}
