package com.lcwd.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lcwd.service.entities.Hotel;
import com.lcwd.service.services.HotelService;

@RestController
@RequestMapping("/hotels")
public class HotelServiceController {

	@Autowired
	private HotelService hotelService;

	@GetMapping("/")
	public String getServiceName() {
		return "Hotel Service Called!!!";
	}

	@GetMapping("/getAllHotels")
	public ResponseEntity<List<Hotel>> getAllHotels() {
		List<Hotel> listHotels = hotelService.getAllHotel();
		return ResponseEntity.status(HttpStatus.CREATED).body(listHotels);
	}

	@GetMapping("/getHotelById/{hotelId}")
	public ResponseEntity<Hotel> getHotelById(@PathVariable(name = "hotelId") String hotelId) {
		Hotel hotel = hotelService.findbyHotelId(hotelId);
		return  ResponseEntity.status(HttpStatus.CREATED).body(hotel);
	}
	
	@PostMapping("/saveHotel")
	public ResponseEntity<Hotel> getServiceName(@RequestBody Hotel hotel) {
		Hotel savedhotel = hotelService.saveHotel(hotel);
		return ResponseEntity.status(HttpStatus.CREATED).body(savedhotel);
	}

}
