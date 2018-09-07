package com.claim.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int addressId;
	
	private Integer CompanyProfileId;
	
	private String address;
	private String city;
	private String state;
	private String zip;

	/*private JobSeekerProfile jobSeekerProfile;*/

	@OneToOne(mappedBy = "companyId")
	public Integer getCompanyProfileId() {
		return CompanyProfileId;
	}

	public void setCompanyProfileId(Integer companyProfileId) {
		CompanyProfileId = companyProfileId;
	}
	
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}
	

}
