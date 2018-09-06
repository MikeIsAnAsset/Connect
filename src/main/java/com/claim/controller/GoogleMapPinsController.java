package com.claim.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.claim.entity.GoogleMapPins;
import com.claim.service.GoogleMapPinsService;

@Controller
public class GoogleMapPinsController {
	
	@Autowired
	GoogleMapPinsService mapPinsService;
	
	@RequestMapping("/resources")
	public ModelAndView resources() {
		
		GoogleMapPins initialGoogleMapPin = new GoogleMapPins();
		initialGoogleMapPin.mapPinsTraining("Claim Academy");
		initialGoogleMapPin.mapPinsTraining("LaunchCode");
		
		initialGoogleMapPin.mapPinsCoworking("T-Rex");
		initialGoogleMapPin.mapPinsCoworking("Cortex");
		
		initialGoogleMapPin.mapPinsFunding("ArchGrants");
		initialGoogleMapPin.mapPinsFunding("AngelList");
		
		// save to database
		mapPinsService.saveGoogleMapPinsObject(initialGoogleMapPin);

		ArrayList<GoogleMapPins> googleMapPins = (ArrayList<GoogleMapPins>) mapPinsService.findAllMapPins();
		System.out.println(googleMapPins);
		return new ModelAndView("resources", "mapPins", googleMapPins);
	}
	
	@RequestMapping("/map")
	public ModelAndView handlePinSelection(@RequestParam("q")String business) {
		System.out.println("Training parameter received: "+business);
		
		ArrayList<GoogleMapPins> googleMapPins = (ArrayList<GoogleMapPins>) mapPinsService.findAllMapPins();
		System.out.println(googleMapPins);
		
		ModelAndView model = new ModelAndView("resources", "mapPins", googleMapPins);
		model.addObject("q", business);
		System.out.println(model);
		return model;
		
	}


}
