package com.claim.entity;

import java.io.Serializable;
import java.util.Base64;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class FileUploads implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int fileUploadsId;
	
	@Column(columnDefinition = "LONGBLOB")
	private byte[] bytes;
	
	private String originalFilename;
	
	private String contentType;

	private Integer CompanyProfileId;
	
	
	
	
	
	public FileUploads() {
		super();
	}

	public FileUploads(byte[] bytes, String originalFilename, String contentType, Integer companyId) {
		super();
		this.bytes = bytes;
		this.originalFilename = originalFilename;
		this.contentType = contentType;
		this.CompanyProfileId = companyId;

	}

	public byte[] getBytes() {
		return bytes;
	}

	public void setBytes(byte[] bytes) {
		this.bytes = bytes;
	}

	public String getOriginalFilename() {
		return originalFilename;
	}

	public void setOriginalFilename(String originalFilename) {
		this.originalFilename = originalFilename;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

/*	fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,*/
	@OneToOne(mappedBy = "companyId")
	public Integer getCompanyProfileId() {
		return CompanyProfileId;
	}

	public void setCompanyProfileId(Integer companyProfileId) {
		CompanyProfileId = companyProfileId;
	}
	
	// add a method for converting the byte array to Base64 string: 

		public String showPicture(){

		    String encoded = "";

		    if(bytes != null && bytes.length>0){

		            encoded = Base64.getEncoder().encodeToString(bytes);
		    }

		     return encoded;
		}
	
}
