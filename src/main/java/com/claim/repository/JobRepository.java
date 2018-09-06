package com.claim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.claim.entity.Job;

@Repository
public interface JobRepository extends JpaRepository<Job, Integer> {

}
