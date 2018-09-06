package com.claim.controller;

import java.util.ArrayList;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.claim.entity.Address;
import com.claim.entity.CompanyProfile;
import com.claim.entity.FileUploads;
import com.claim.entity.Job;
import com.claim.entity.Skills;
import com.claim.service.AddressService;
import com.claim.service.CompanyProfileService;
import com.claim.service.FileSystemFileUploadService;
import com.claim.service.FileUploadService;
import com.claim.service.FileUploadsService;
import com.claim.service.JobService;
import com.claim.service.SkillsService;

@Controller
public class JobController {

	@Autowired
	JobService jobService;
	
	@Autowired
	AddressService address;
	
	@Autowired
	CompanyProfileService companyProfileService;
	
	@Autowired
	SkillsService skillsService;
	
	private final FileSystemFileUploadService fileSystemFileUploadService;
	
	@Autowired
	FileUploadsService fileUploadsService;

	@Autowired
	public JobController(FileSystemFileUploadService fileSystemFileUploadService) {
		this.fileSystemFileUploadService = fileSystemFileUploadService;
	}
	
	// See each controller for inclusion of fieldNames
/*	@RequestMapping("/addJobFirstTime")
	public ModelAndView addJob(HttpSession session) {
		
		// Create list of field names from Skills
		ArrayList<String> fieldNames = new ArrayList<String>() ;
		Skills blankSkills = new Skills();
		System.out.println(blankSkills.getClass().getDeclaredFields().toString());
		for (Field obj: blankSkills.getClass().getDeclaredFields())
        {
			if (!obj.toString().substring(40).contains("SkillLevel") ) {
				fieldNames.add(obj.toString().substring(40));
			}
        		
        		
        		// remove id field
        		
        		System.out.println(obj.toString());
        }
		fieldNames.remove(0);
		ModelAndView modelAndView = new ModelAndView("addJobFirstTimeModal");
		
		//modelAndView.addObject(fieldNames);
		modelAndView.addObject("fieldNames", fieldNames);
		return modelAndView;
	}*/
	
	
	@RequestMapping(value="/addJobFirstTime", method=RequestMethod.POST)
	public ModelAndView addJob( @ModelAttribute("job") Job job, @RequestParam("file") MultipartFile file) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException{
		Skills skillsHoldingSelections = new Skills();
		
		// Save file to local file system and to database
		fileSystemFileUploadService.store(file, job.getCompanyProfile().getCompanyId());
		
		// Get files for testing
		ArrayList<FileUploads> allsmFiles = fileUploadsService.getAllMyFiles();
		
		
		// Add selected skills to the skills object
		// Loop through selected skills
		for (int i=0; i < job.getSelectedSkills().size(); i++) 
		{
			// Loop through fields of Skills object to match a selected skill
			for (Field obj: skillsHoldingSelections.getClass().getDeclaredFields()) 
			{
				if (obj.toString().endsWith(job.getSelectedSkills().get(i)) && !obj.toString().contains("SkillLevel")) 
				{
					System.out.println("This is wherehappening");
					System.out.println(obj.toString());
					// Change first letter of selected to uppercase
					String skillsSetter = job.getSelectedSkills().get(i).substring(0, 1).toUpperCase();
					
					// Concatenate remaining string of selected skill
					skillsSetter += job.getSelectedSkills().get(i).substring(1);
					
  					// Concatenate "set" to the matching skill to match the skill's setter
					skillsSetter = "set" + skillsSetter;
					System.out.println(skillsSetter);
					
					// Loop through the methods of Skills object to find/invoke the skill's setter
					for (Method meth: skillsHoldingSelections.getClass().getDeclaredMethods()) 
					{
						/*System.out.println(meth.toString());*/
						if (meth.toString().contains(skillsSetter) && !meth.toString().contains("SkillLevel")) 
						{
							// 
							System.out.println(meth.toString());
							meth.invoke(skillsHoldingSelections, true);
							System.out.println("IF THIS PRINTS SOMETHING WORKD");
						}
					}
				}
			}
		}
		
		job.setSkills(skillsHoldingSelections);
		
		System.out.println(job.getSelectedSkills().toString());	
		System.out.println(job.getSkills().toString());	
		
		/*System.out.println(job.getCompanyProfile().getCompanyVideoPitch().getClass());*/
		
		//@TODO comment the following out so it skips being entered into the db!
		
		jobService.saveJob(job);
		address.saveAddress(job.getCompanyProfile().getAddress());
		
		companyProfileService.saveCompanyProfile(job.getCompanyProfile());
		skillsService.saveSkills(job.getSkills());

		
		
		
		System.out.println(job.toString());
		System.out.println(job.getDescription());
		
		ModelAndView modelAndView = new ModelAndView("jobPreview", "job", job);
		modelAndView.addObject("allfiles", allsmFiles);
		
		return modelAndView;
	}
	
}
