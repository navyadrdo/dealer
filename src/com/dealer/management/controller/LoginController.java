package com.dealer.management.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/access")
public class LoginController {
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(ModelMap model,Principal principal) {
		System.out.println("for dispalying login page");
		model.addAttribute("message", "Spring Security Custom Form example");
		return "login";
	}

	@RequestMapping(value = "/accessdenied", method = RequestMethod.GET)
	public String loginerror(ModelMap model) {
		model.addAttribute("error", "true");
		return "denied";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(ModelMap model) {
		return "logout";
	}

	@RequestMapping(value = "/process", method = RequestMethod.GET)
	public String processRequest(ModelMap model) {
		return "mainpage";
	}
	
}
