package com.claim.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FileUploads implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int fileUploadsId;
	
	@Column(columnDefinition = "BLOB")
	private byte[] bytes;
	
	private String originalFilename;
	
	private String contentType;

	private Integer CompanyProfileId;
	
	
	
	
	
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
	
	
	
}
