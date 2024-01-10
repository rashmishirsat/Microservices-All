package com.micro.Controller;

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

import com.micro.Entity.HotelEntity;
import com.micro.Service.hotelService;


@RestController
@RequestMapping("/hotels")
public class holet_Controller {
	
	
	@Autowired
	private hotelService service;
	
	@PostMapping
	public ResponseEntity<HotelEntity> createhotel(@RequestBody HotelEntity enHotelEntity)
	{
		
	  HotelEntity entity= service.createhotel(enHotelEntity);
	  
	  return ResponseEntity.ok(entity);
		
	}
	
	@GetMapping
	public  ResponseEntity<List<HotelEntity>> getall()
 {
	
		
      List<HotelEntity> listdata= service.getlist();
     return ResponseEntity.ok(listdata);
	 
 }
	

	@GetMapping("/{hotelId}")
	public ResponseEntity<HotelEntity> getUserId(@PathVariable("hotelId") String hotelId)
	{
		
		HotelEntity entity = service.getoneId(hotelId);
		
		return ResponseEntity.status(HttpStatus.OK).body(entity);
		
	}
	
	
}
