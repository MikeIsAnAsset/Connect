package com.claim.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.claim.entity.JobSeekerProfile;
import com.claim.service.JobSeekerProfileService;


@CrossOrigin
@RestController
public class JobSeekerProfileController {

	@Autowired
	JobSeekerProfileService jobSeekerProfileService;
	
	@RequestMapping(value="/profile",
			consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE,
			method=RequestMethod.POST)
	public ResponseEntity<JobSeekerProfile> join(@RequestBody JobSeekerProfile jobSeekerProfile){
		jobSeekerProfileService.saveJobSeekerProfile(jobSeekerProfile);
		return null;
	}
}
