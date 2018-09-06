package com.claim.controller;

import java.lang.reflect.Field;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.claim.entity.Helper;
import com.claim.entity.Job;
import com.claim.entity.Skills;
import com.claim.repository.UserRepository;

@Controller
public class HomeController {

	@Autowired
	private Helper helper;
	
	@RequestMapping("/")
	public ModelAndView index()
	{
		ModelAndView modelAndView = new ModelAndView("index", "job", new Job());
		modelAndView.addObject("fieldNames", helper.obtainFieldNames());
/*		modelAndView.addObject("upload", "upload", new MultipartFile());*/
/*		System.out.println(fieldNames);*/
		return modelAndView;
	}
	
	@RequestMapping("/about")
	public ModelAndView about()
	{
		return new ModelAndView("about");
	}
	
	
	
	
}
