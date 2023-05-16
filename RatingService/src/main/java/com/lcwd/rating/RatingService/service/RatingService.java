package com.lcwd.rating.RatingService.service;

import java.util.List;

import com.lcwd.rating.RatingService.entities.Rating;


public interface RatingService {
	
	Rating creatRating(Rating rating);
	List<Rating> getAllRating();
	List<Rating> getRatingByUserId(String userId);
	List<Rating> getRatingByHotelId(String HotelId);
}
