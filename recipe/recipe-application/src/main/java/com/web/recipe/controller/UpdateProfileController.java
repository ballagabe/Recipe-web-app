package com.web.recipe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.web.recipe.application.service.UserServices;
import com.web.recipe.webdomain.UpdateProfileDomain;

@Controller
public class UpdateProfileController {
	@Autowired
	private UserServices userServices;

	@PostMapping("/updateprofile")
	public String updateProfile(UpdateProfileDomain requestUser) {
		userServices.updateUser(requestUser.getOldnickname(), requestUser.getUsername(), requestUser.getNickname(), requestUser.getPassword());
		return "redirect:/logout"; 
	}
}