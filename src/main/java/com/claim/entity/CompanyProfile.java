package com.claim.entity;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartFile;

@Entity
//@Table(name="company_profile")
public class CompanyProfile implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int companyId;
	private String companyName;
	private boolean isCompanyNameConfidential;
	private String companyLogo;
	
	// Why work at this company
	private String companyOneLineTextPitch;
	private File companyVideoPitch;
	
	@Column
	private PerksBenefits companyPerksBenefits;
	
	// i.e. 1 to 9 employees
	private int companySize;
	
	@Column
	private Address address;
	
	@Column
	private String phone;
	
	@Column
	private String website;
	
	private TreeSet<User> users;

	private TreeSet<Job> jobs;
	
	private ArrayList<Address> addresses;
	
	@Column
	private String industry;
	
	// Constructors
	
	public CompanyProfile() {
		// TODO Auto-generated constructor stub
	}
	
	public CompanyProfile(String companyName) {
		this.companyName = companyName;
	}
	
	// This doesn't include fields users, jobs, addresses
	public CompanyProfile(String companyName, boolean isCompanyNameConfidential, String companyLogo,
			String companyOneLineTextPitch, File companyVideoPitch, PerksBenefits companyPerksBenefits,
			int companySize, Address address, String phone, String website, String industry) {
		super();
		this.companyName = companyName;
		this.isCompanyNameConfidential = isCompanyNameConfidential;
		this.companyLogo = companyLogo;
		this.companyOneLineTextPitch = companyOneLineTextPitch;
		this.companyVideoPitch = companyVideoPitch;
		this.companyPerksBenefits = companyPerksBenefits;
		this.companySize = companySize;
		this.address = address;
		this.phone = phone;
		this.website = website;
		this.industry = industry;
	}

	// Getters & Setters

	@OneToOne(mappedBy = "PerksBenefits", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	public PerksBenefits getCompanyPerksBenefits() {
		return companyPerksBenefits;
	}

	public void setCompanyPerksBenefits(PerksBenefits companyPerksBenefits) {
		this.companyPerksBenefits = companyPerksBenefits;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public boolean isIsCompanyNameConfidential() {
		return isCompanyNameConfidential;
	}

	public void setIsCompanyNameConfidential(boolean isCompanyNameConfidential) {
		this.isCompanyNameConfidential = isCompanyNameConfidential;
	}

	public void setAddresses(ArrayList<Address> addresses) {
		this.addresses = addresses;
	}

	public String getCompanyLogo() {
		return companyLogo;
	}

	public void setCompanyLogo(String companyLogo) {
		this.companyLogo = companyLogo;
	}

	public String getCompanyOneLineTextPitch() {
		return companyOneLineTextPitch;
	}

	public void setCompanyOneLineTextPitch(String companyOneLineTextPitch) {
		this.companyOneLineTextPitch = companyOneLineTextPitch;
	}

	public File getCompanyVideoPitch() {
		return companyVideoPitch;
	}

	public void setCompanyVideoPitch(File companyVideoPitch) {
		this.companyVideoPitch = companyVideoPitch;
	}

	public int getCompanySize() {
		return companySize;
	}

	public void setCompanySize(int companySize) {
		this.companySize = companySize;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public Address getAddress() {
		return address;
	}

	@OneToMany(mappedBy = "CompanyProfile", cascade = CascadeType.ALL)
	public ArrayList<Address> getAddresses() {
		return addresses;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	@OneToMany(mappedBy = "CompanyProfile", cascade = CascadeType.PERSIST)
	public TreeSet<User> getUsers() {
		return users;
	}
	
	public void setUsers(TreeSet<User> users) {
		this.users = users;
	}
	
	@OneToMany(mappedBy = "CompanyProfile", cascade = CascadeType.PERSIST)
	public TreeSet<Job> getJobs() {
		return jobs;
	}
	
	public void setJobs(TreeSet<Job> jobs) {
		this.jobs=jobs;
	}


	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}



	@Override
	public String toString() {
		return "CompanyProfile [companyId=" + companyId + ", companyName=" + companyName + ", companyLogo="
				+ companyLogo + ", isCompanyNameConfidential=" + isCompanyNameConfidential
				+ ", companyOneLineTextPitch=" + companyOneLineTextPitch + ", companyVideoPitch=" + companyVideoPitch
				+ ", companyPerksBenefits=" + companyPerksBenefits + ", companySize=" + companySize + ", address="
				+ address + ", users=" + users + ", jobs=" + jobs + ", addresses=" + addresses + ", industry="
				+ industry + "]";
	}
	
	
}
