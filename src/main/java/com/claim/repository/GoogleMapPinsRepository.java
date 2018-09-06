package com.claim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.claim.entity.GoogleMapPins;

@Repository
public interface GoogleMapPinsRepository extends JpaRepository <GoogleMapPins, Integer>{
	
}
