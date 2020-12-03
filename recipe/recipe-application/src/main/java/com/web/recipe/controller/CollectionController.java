package com.web.recipe.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.web.recipe.application.service.RecipeServices;
import com.web.recipe.application.service.UserServices;
import com.web.recipe.domain.User;
import com.web.recipe.webdomain.GetRecipeRequestDomain;

@Controller
public class CollectionController {
	@Autowired
	private RecipeServices getRecipesService; 
	
	@Autowired
	private UserServices userService; 
	
	@GetMapping("/collection/{uname}")
	public String collection(Model model, @PathVariable("uname") String uname) {
		List<User> user = userService.getOneUser(String.format("%s%s", uname,"@gmail.com"));
		model.addAttribute("user", user);
		model.addAttribute("user2", "szia");
		return "collection";
	}
	
	
}
