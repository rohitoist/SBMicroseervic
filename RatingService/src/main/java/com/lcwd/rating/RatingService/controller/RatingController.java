package com.lcwd.rating.RatingService.controller;

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

import com.lcwd.rating.RatingService.entities.Rating;
import com.lcwd.rating.RatingService.service.RatingService;

@RestController
@RequestMapping("/ratings")
public class RatingController {

	@Autowired
	RatingService ratingService;
	
	@GetMapping("/")
	public String getServicename() {
		return "Rating service";
	}
	
	
	@PostMapping("/createRating")
	public ResponseEntity<Rating> creatRating(@RequestBody Rating rating){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.creatRating(rating));
	}
	
	@GetMapping("/getAlRatings")
	public ResponseEntity<List<Rating>> getAllRating(){
		
		return ResponseEntity.status(HttpStatus.OK).body(ratingService.getAllRating());
	}
	
	@GetMapping("/getRatingByUserId/{userId}")
	public ResponseEntity<List<Rating>> getAllRatingbyUserId(String userId){
		
		return ResponseEntity.status(HttpStatus.OK).body(ratingService.getAllRating());
	}
	
	@GetMapping("/getRatingByHotelId/{hotelId}")
	public ResponseEntity<List<Rating>> getAllRatingByHotelId(@PathVariable(name = "hotelId")String hotelId){
		
		return ResponseEntity.status(HttpStatus.OK).body(ratingService.getAllRating());
	}
	
}
