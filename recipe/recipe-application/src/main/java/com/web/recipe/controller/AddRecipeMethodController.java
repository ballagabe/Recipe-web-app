package com.web.recipe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.web.recipe.application.service.RecipeServices;
import com.web.recipe.webdomain.AddRecipeRequestDomain;

@Controller
public class AddRecipeMethodController {

	@Autowired
	private RecipeServices createRecipe;
	
	@PostMapping("/addrecipemethod")
    public String addRecipe(AddRecipeRequestDomain requestRecipe) {
		createRecipe.createAndSaveRecipe(requestRecipe.getName(), requestRecipe.getIngredients(), requestRecipe.getDescription(), requestRecipe.getType(), requestRecipe.getUserId());
		return "redirect:login";
    }
}
