package com.claim.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.claim.entity.CompanyProfile;
import com.claim.service.CompanyProfileService;



@CrossOrigin
@RestController
public class CompanyProfileController {

	@Autowired
	CompanyProfileService companyProfileService;
	
	@RequestMapping(value="/addCompanyProfile",
			consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE,
			method=RequestMethod.POST)
	public ResponseEntity<CompanyProfile> addCompanyProfile(@RequestBody CompanyProfile companyProfile){
		System.out.println(companyProfile);
		companyProfileService.saveCompanyProfile(companyProfile);
		return new ResponseEntity<>(companyProfile, HttpStatus.CREATED);
	}
}
