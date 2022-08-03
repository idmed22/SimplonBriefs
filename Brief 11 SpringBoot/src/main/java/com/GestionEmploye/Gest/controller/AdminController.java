package com.GestionEmploye.Gest.controller;

import com.GestionEmploye.Gest.model.Admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {
	
	// get login
	@RequestMapping(value="/login", method= RequestMethod.GET)
	public String getLoginAdmin() {
		return "login";
		
	}
	
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	
     public  String login(@ModelAttribute(name="Admin") Admin admin, Model model) {

		
	
		String username = admin.getUsername();
		String password = admin.getPassword();
		
		if("admin".equals(username) && "admin".equals(password)) {
			// if username & password correct
	        return "redirect:/";
		}
	       // if username & password incorrect !!!
		model.addAttribute("invalidCondition",true);
		
		return "login";
		
	}
	
	

}
