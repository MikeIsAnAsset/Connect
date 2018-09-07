package com.claim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.claim.entity.CompanyProfile;

@Repository
public interface CompanyProfileRepository extends JpaRepository<CompanyProfile, Integer> {

//	@Query("Select C from CompanyProfile C where ")
	
    @Query(value="SELECT * FROM CompanyProfile c where c.companyName = ?1 AND c.phone = ?2", nativeQuery=true) 
    Integer findCompanyIdByNameAndPhone(String name, String phone);
	
}
