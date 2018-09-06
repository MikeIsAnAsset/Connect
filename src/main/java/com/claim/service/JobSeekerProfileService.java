package com.claim.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claim.entity.JobSeekerProfile;
import com.claim.repository.JobSeekerProfileRepository;

@Service
public class JobSeekerProfileService {

	@Autowired
	private JobSeekerProfileRepository jobSeekerProfileRepository;
	
	public void saveJobSeekerProfile(JobSeekerProfile jobSeekerProfile) {
		jobSeekerProfileRepository.save(jobSeekerProfile);
	}
}
