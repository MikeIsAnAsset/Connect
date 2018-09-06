package com.claim.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claim.entity.Address;
import com.claim.entity.CompanyProfile;
import com.claim.repository.AddressRepository;

@Service
public class AddressService {

	@Autowired
	AddressRepository addressRepository;
	
	public void saveAddress(Address address) {
		addressRepository.save(address);
	}
}
