package com.lcwd.rating.RatingService.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwd.rating.RatingService.entities.Rating;
import com.lcwd.rating.RatingService.repositories.RatingRepository;
import com.lcwd.rating.RatingService.service.RatingService;
@Service
public class RatingServiceImpl implements RatingService{

	@Autowired
	RatingRepository ratingRepository;
	
	@Override
	public List<Rating> getAllRating() {
		List<Rating> listRating = ratingRepository.findAll();
		return listRating;
	}

	@Override
	public List<Rating> getRatingByUserId(String userId) {
		List <Rating> listRqatingByUserId = ratingRepository.findByUserId(userId);
		return listRqatingByUserId;
		
	}

	@Override
	public List<Rating> getRatingByHotelId(String hotelId) {
		return ratingRepository.findByHotelId(hotelId);
	}

	@Override
	public Rating creatRating(Rating rating) {
		Rating rating1 = ratingRepository.save(rating);
		return rating1;
	}

}
