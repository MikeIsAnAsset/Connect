package com.claim.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claim.entity.FileUploads;
import com.claim.repository.FileUploadsRepository;

@Service
public class FileUploadsService {

	@Autowired
	private FileUploadsRepository fileUploadsRepository;

	// Save the object to the repo
	public void saveFile(FileUploads fileUpload){
		fileUploadsRepository.save(fileUpload);
	}
	 
	public ArrayList<FileUploads> getAllMyFiles(){
		return fileUploadsRepository.getAllFiles();
	}

}