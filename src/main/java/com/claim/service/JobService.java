package com.claim.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claim.entity.Job;
import com.claim.repository.JobRepository;

@Service
public class JobService {

	@Autowired
	private JobRepository jobRepository;
	
	public void saveJob(Job job) {
		jobRepository.save(job);
	}
	
	
}
