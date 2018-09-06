package com.claim.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claim.entity.GoogleMapPins;
import com.claim.repository.GoogleMapPinsRepository;

@Service
public class GoogleMapPinsService {

	@Autowired
	GoogleMapPinsRepository mapPinsRepository;
	
//	public void addGoogleMapPins(String business) {
//		mapPinsRepository.
//	}
	
	
	
	
	
	public ArrayList<GoogleMapPins> findAllMapPins() {
		ArrayList<GoogleMapPins> googleMapPin = (ArrayList<GoogleMapPins>) mapPinsRepository.findAll();
		return googleMapPin;
	}

	public void saveGoogleMapPinsObject(GoogleMapPins googleMapPinsObject) {
		mapPinsRepository.save(googleMapPinsObject);
		
	}
	
	
}
