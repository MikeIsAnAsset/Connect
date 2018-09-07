package com.claim.controller;

import java.lang.reflect.InvocationTargetException;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.claim.entity.Helper;
import com.claim.entity.Job;
import com.claim.entity.Skills;
import com.claim.service.SkillsService;

@Controller
public class SearchController {
	
	@Autowired
	Helper helper;
	
	@Autowired
	SkillsService skillsService;

	@RequestMapping(value="/search", method=RequestMethod.GET)
	public ModelAndView searchJobs(){
		ModelAndView modelAndView = new ModelAndView("search", "fieldNames", helper.obtainFieldNames());
		modelAndView.addObject("job", new Job());  // The modal from the navbar requires this
		return modelAndView;
	}
	
	
	
	@RequestMapping(value="/searchSkills", method=RequestMethod.POST)
	public ModelAndView searchJobs(@ModelAttribute("job") Job job) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
//		skillsToSearch = setSkills();
		// Create a skills object with selected skills
		Skills skillsToSearch = helper.createSkillsObject(job);
		TreeMap<Integer, Integer> jobsWithMatchingSkills = skillsService.findAllJobsWithMatchingSkills(skillsToSearch);
		System.out.println(jobsWithMatchingSkills.toString());
		ModelAndView modelAndView = new ModelAndView("search");
		modelAndView.addObject("jobsWithMatchingSkills", jobsWithMatchingSkills);
		modelAndView.addObject("fieldNames", helper.obtainFieldNames());
		return modelAndView;
	}
	
}
