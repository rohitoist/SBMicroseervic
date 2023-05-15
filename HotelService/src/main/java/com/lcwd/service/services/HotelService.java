package com.lcwd.service.services;

import java.util.List;

import com.lcwd.service.entities.Hotel;

public interface HotelService {

	
	//create/save
	
	public Hotel saveHotel(Hotel hotel);
	
	public List<Hotel> getAllHotel();
	
	public Hotel findbyHotelId(String hotelId);
	
	public void deleteHoteById(String hotelId);
	
}
