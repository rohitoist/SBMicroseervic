package com.lcwd.service.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.lcwd.service.entities.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel,String> {

}
