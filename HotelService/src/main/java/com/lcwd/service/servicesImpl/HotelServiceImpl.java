package com.lcwd.service.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwd.service.entities.Hotel;
import com.lcwd.service.exception.ResourceNotFound;
import com.lcwd.service.repositories.HotelRepository;
import com.lcwd.service.services.HotelService;

@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	private HotelRepository hotelRepository;

	@Override
	public Hotel saveHotel(Hotel hotel) {
		Hotel hotel1 = hotelRepository.save(hotel);
		return hotel1;
	}

	@Override
	public List<Hotel> getAllHotel() {
		List<Hotel> listHotels = hotelRepository.findAll();
		return listHotels;
	}

	@Override
	public Hotel findbyHotelId(String hotelId) {
		Hotel hotelById = hotelRepository.findById(hotelId)
				.orElseThrow(() -> new ResourceNotFound("Resouce not avaibale in db"));
		return hotelById;
	}

	@Override
	public void deleteHoteById(String hotelId) {
		// return null;
	}
}
