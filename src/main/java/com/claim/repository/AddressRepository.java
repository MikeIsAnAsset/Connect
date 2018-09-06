package com.claim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.claim.entity.Address;
import com.claim.entity.CompanyProfile;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
