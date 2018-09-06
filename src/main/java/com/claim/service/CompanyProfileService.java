package com.claim.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claim.entity.CompanyProfile;
import com.claim.repository.CompanyProfileRepository;

@Service
public class CompanyProfileService {

	@Autowired
	CompanyProfileRepository companyProfileRepository;
	
	public void saveCompanyProfile(CompanyProfile companyProfile) {
		companyProfileRepository.save(companyProfile);
		
	}

}
