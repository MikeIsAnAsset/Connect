package com.claim.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.claim.entity.FileUploads;


@Repository
public interface FileUploadsRepository extends JpaRepository<FileUploads, Integer> {
	@Query(value="SELECT * FROM FileUploads", nativeQuery=true)
	public ArrayList<FileUploads> getAllFiles();
}