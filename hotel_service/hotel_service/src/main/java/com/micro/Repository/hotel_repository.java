package com.micro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.micro.Entity.HotelEntity;

@Repository
public interface hotel_repository extends JpaRepository<HotelEntity, String>{

}
