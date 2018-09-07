package com.claim.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.claim.entity.CompanyProfile;
import com.claim.repository.CompanyProfileRepository;

@Service
public class CompanyProfileService {

	@Autowired
	CompanyProfileRepository companyProfileRepository;
	
	public CompanyProfile saveCompanyProfile(CompanyProfile companyProfile) {
		return companyProfileRepository.save(companyProfile);
	}

	public Integer getCompanyProfileId(String name, String phone) {
		Integer id = companyProfileRepository.findCompanyIdByNameAndPhone(name, phone);
		return id;
	}
		


	
	
}
