package com.micro.Service;

import java.util.List;

import com.micro.Entity.HotelEntity;

public interface hotelService {
	

	HotelEntity createhotel(HotelEntity entity);
	
	List<HotelEntity> getlist();
	
	HotelEntity getoneId(String id);
	
	 
}
