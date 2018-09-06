package com.claim.entity;

import java.io.Serializable;
import java.util.LinkedList;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

@Entity
public class JobSeekerProfile implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int jobSeekerId;
	
	@Column
	private String location;
	
	@Column 
	private String state;
	
	@Column
	private String headline;
	
	@Column
	private int industry;
	
	@Column
	private int numLinkedInConnections;
	
	@Column
	private String summary;
	
	@Column
	private String specialities;
	
	@Column
	private LinkedList<Position> positions;
	
	@Column
	private String formattedLinkedInPictureURL;
	
	@Column
	private String unformattedLinkedInPictureURL;
	
	@Column
	private String publicLinkedInProfile;
	
	@Column
	private Skills skills;
	
	@Column
	private PerksBenefits perksBenefitsWanted;
	
	@Column
	private String employmentType;
	
	@Column
	private String resume;
	
	@Column
	private Address address;
	
	
	
	public JobSeekerProfile() {
		// TODO Auto-generated constructor stub
	}

	
	@OneToOne(mappedBy = "PerksBenefits", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	public PerksBenefits getPerksBenefitsWanted() {
		return perksBenefitsWanted;
	}



	public void setPerksBenefitsWanted(PerksBenefits perksBenefitsWanted) {
		this.perksBenefitsWanted = perksBenefitsWanted;
	}



	@OneToOne(mappedBy = "Address", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	public Address getAddress() {
		return address;
	}
	
	
	public int getJobSeekerId() {
		return jobSeekerId;
	}

	public void setJobSeekerId(int jobSeekerId) {
		this.jobSeekerId = jobSeekerId;
	}


	public String getLocation() {
		return location;
	}

	public void setCity(String city) {
		this.location = location;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Skills getSkills() {
		return skills;
	}

	public void setSkills(Skills skills) {
		this.skills = skills;
	}

	public PerksBenefits getperksBenefitsWanted() {
		return perksBenefitsWanted;
	}

	public void setperksBenefitsWanted(PerksBenefits perks) {
		this.perksBenefitsWanted = perks;
	}

	public String getEmploymentType() {
		return employmentType;
	}

	public void setEmploymentType(String employmentType) {
		this.employmentType = employmentType;
	}
	
	

}
