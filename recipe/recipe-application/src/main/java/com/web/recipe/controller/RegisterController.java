package com.web.recipe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.web.recipe.application.service.UserServices;
import com.web.recipe.webdomain.RegisterUserDomain;

@Controller
public class RegisterController {

	@GetMapping("/register")
	public String registerForm() {
		return "register";
	}
	
	@Autowired
	private UserServices userServices;

	@PostMapping("/registermethod")
	public String registermethod(RegisterUserDomain requestUser) {
		userServices.createAndSaveUser(requestUser.getUsername(), requestUser.getNickname(), requestUser.getEmail(), requestUser.getPassword());
		return "redirect:login"; 
	}
}