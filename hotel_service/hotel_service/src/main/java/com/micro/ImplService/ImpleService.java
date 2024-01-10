package com.micro.ImplService;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micro.Entity.HotelEntity;
import com.micro.Exception.ResourceNotFoundException;
import com.micro.Repository.hotel_repository;
import com.micro.Service.hotelService;

@Service
public class ImpleService implements hotelService {


	@Autowired
	private hotel_repository repository;
	
	
	


	@Override
	public List<HotelEntity> getlist() {
		// TODO Auto-generated method stub
		
		
		return repository.findAll();
	}

	@Override
	public HotelEntity createhotel(HotelEntity entity) {
		// TODO Auto-generated method stub
		
		String random= UUID.randomUUID().toString();
		
		entity.setId(random);
		
		return repository.save(entity);
	}

	@Override
	public HotelEntity getoneId(String id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(" Resource ID Not Found"+id));
	}
	
	//ResourceNotFoundException("not found id")+id)

}
