package com.web.recipe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.web.recipe.application.service.RecipeServices;
import com.web.recipe.webdomain.SaveRecipeDomain;

@Controller
public class SaveRecipeController {
	@Autowired
	private RecipeServices recipeServices;

	@PostMapping("/saverecipe")
	public String saverecipe(SaveRecipeDomain requestSR) {
		recipeServices.saveRecipe(requestSR.getUserid(), requestSR.getRecipeid());
		return "redirect:/"; 
	}
}