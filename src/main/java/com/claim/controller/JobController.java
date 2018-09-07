package com.claim.controller;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.claim.entity.Address;
import com.claim.entity.CompanyProfile;
import com.claim.entity.FileUploads;
import com.claim.entity.Helper;
import com.claim.entity.Job;
import com.claim.entity.Skills;
import com.claim.service.AddressService;
import com.claim.service.CompanyProfileService;
import com.claim.service.FileSystemFileUploadService;
import com.claim.service.FileUploadsService;
import com.claim.service.JobService;
import com.claim.service.SkillsService;

@Controller
public class JobController {

	@Autowired
	Helper helper;
	
	@Autowired
	JobService jobService;
	
	@Autowired
	AddressService addressService;
	
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
	
	@RequestMapping("/addJobFirstTime")
	public ModelAndView PlainForm() {
		return new ModelAndView("PlainForm");
	}
	
	//headers = "content-type=multipart/form-data", produces = MediaType.APPLICATION_JSON_VALUE
	
	@RequestMapping(value="/addJobFirstTime", method=RequestMethod.POST)
	public @ResponseBody ModelAndView addJob( @ModelAttribute("job") Job job, @RequestParam("companyVideoPitch") MultipartFile file) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException{
		
		// Get files for testing
		ArrayList<FileUploads> allsmFiles = fileUploadsService.getAllMyFiles();
		System.out.println("This is all my picture files");
		System.out.println(allsmFiles);
		
		Skills skillsHoldingSelections = helper.createSkillsObject(job);
		
		
		
		
		
		
		
		
		job.setSkills(skillsHoldingSelections);
		
		System.out.println(job.getSelectedSkills().toString());	
		System.out.println(job.getSkills().toString());	
		
		/*System.out.println(job.getCompanyProfile().getCompanyVideoPitch().getClass());*/
		
		//@TODO comment the following out so it skips being entered into the db!
		
		
		// Returned db job has auto-generated ID
		Job jobFromDatabase = jobService.saveJob(job);

		
		// GetjobId so it can be stored as foreign key in Skills, CompanyProfile, and PerksBenefits tables
		Integer jobId = jobFromDatabase.getJobId();
		
		// Save Skills with jobId
		skillsHoldingSelections.setJobId(jobId);
		skillsService.saveSkills(skillsHoldingSelections);
		
		// Save PerksBenefits with jobId
				
		// Save CompanyProfile with jobId and return a db companyProfile with auto-generated ID
		jobFromDatabase.getCompanyProfile().setJobId(jobId);
		CompanyProfile companyProfile = companyProfileService.saveCompanyProfile(jobFromDatabase.getCompanyProfile());
		
		// Save file to local file system and to database
		fileSystemFileUploadService.store(file, companyProfile.getCompanyId());

		// Save address with companyId
		Address addressTemp = jobFromDatabase.getCompanyProfile().getAddress();
		addressTemp.setCompanyProfileId(companyProfile.getCompanyId());
		addressService.saveAddress(addressTemp);
		
		

		// Get companyId so it can be stored as the foreign key in FileUploads table
		// Integer companyId = companyProfileService.getCompanyProfileId(job.getCompanyProfile().getCompanyName(), job.getCompanyProfile().getPhone());
		
		

		
		
		System.out.println(job.toString());
		System.out.println(job.getDescription());
		
		ModelAndView modelAndView = new ModelAndView("jobPreview", "job", job);
		modelAndView.addObject("allsmFiles", allsmFiles);
		
		return modelAndView;
	}
	
}
