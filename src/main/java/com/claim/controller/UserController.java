package com.claim.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.claim.entity.Job;
import com.claim.entity.User;
//import com.claim.repository.UserRepository;
import com.claim.service.UserService;


@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	
	@RequestMapping("/login")
	public ModelAndView login()
	{
		return new ModelAndView("login", "user", new User());
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("user") User user, HttpSession session) {
		User myUser = userService.loginUser(user.getEmail(), user.getPassword());
		
		if(myUser != null)
		{
			session.setAttribute("loggedInUser", myUser);
			return new ModelAndView("profile");
		}
		else
			session.setAttribute("wrongLogin", "Invalid login.  Please try again.");
			return new ModelAndView("login", "user", new User());
	}
	
	
	@RequestMapping("/signUp")
	public ModelAndView register()
	{
		ModelAndView modelAndView = new ModelAndView("signUp", "job", new Job());
		modelAndView.addObject("user", new User());
		return modelAndView;
/*		return new ModelAndView("signUp", "user", new User());*/
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public ModelAndView register(@ModelAttribute("user") User user) {
		//save user object to database
		userService.saveUser(user);
		return new ModelAndView("login","user", new User());
	}
	
	
	
}
