package com.claim.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.claim.entity.Skills;
import com.claim.repository.SkillsRepository;
import com.claim.service.SkillsService;

@Controller
public class SkillsController {

	@Autowired
	SkillsService skillsService = new SkillsService();
	
	
	@Autowired
	SkillsRepository skillsRepository;
	
/*	@RequestMapping(value="/search",
			consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE,
			method=RequestMethod.GET)
	public ResponseEntity<TreeMap<Integer, Integer>> searchJobs(@RequestBody Skills skillsToSearch){
//		skillsToSearch = setSkills();
		TreeMap<Integer, Integer> jobsWithMatchingSkills = skillsService.findAllJobsWithMatchingSkills(skillsToSearch);
		System.out.println(jobsWithMatchingSkills.toString());
		return new ResponseEntity<>(jobsWithMatchingSkills, HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/fetchAllSkills",
			consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE,
			method=RequestMethod.GET)
	public ResponseEntity<ArrayList<Skills>> fetchAllSkills(){
		return skillsService.fetchAllSkills();
	}*/

	@RequestMapping(value="/getSkillObject",
			consumes=MediaType.APPLICATION_JSON_VALUE,
			produces=MediaType.APPLICATION_JSON_VALUE,
			method=RequestMethod.GET)
	public ResponseEntity<Skills> getSkillObject(){
		Skills SkillObjectInstance = new Skills();
		return new ResponseEntity<>(SkillObjectInstance, HttpStatus.CREATED);
	}
	
	@RequestMapping("/createSomeSkills")
	public void createSomeSkills() {
	skillsService.createSomeSkills();
	try {
		skillsService.sendMessage();
	} catch (Exception e) {
		System.out.println("You got an error");
		e.printStackTrace();
	}
	}
	
	
	
//	@RequestMapping(value="/setSkills",
//	consumes=MediaType.APPLICATION_JSON_VALUE,
//	produces=MediaType.APPLICATION_JSON_VALUE,
//	method=RequestMethod.GET)
//	public  ResponseEntity<HttpStatus> setSkills() {
//		
//		Skills skillset1 = new Skills();
//		skillset1.setDotNet(true);
//		skillset1.setA_B_Testing(true);
//		skillsRepository.save(skillset1);
//		
//		Job testJob = new Job(skillset1);
//		Job.addToJobs(testJob);
//		
//		TreeMap<Integer, Integer> jobsWithMatchingSkills = new TreeMap<Integer, Integer> ();
//		jobsWithMatchingSkills = skillsService.findAllJobsWithMatchingSkills(skillset1);
//		System.out.println(jobsWithMatchingSkills.toString());
//		
//		return new ResponseEntity<>(HttpStatus.OK);
//	}
	
	
	
	

	
}
