package com.web.recipe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.recipe.application.service.RecipeServices;

@Controller
public class DeleteRecipeController {
	@Autowired
	private RecipeServices deleteRecipe;
	
	@GetMapping("/deleterecipe")
    public String deleteRecipe(@RequestParam("id") int id) {
		deleteRecipe.deleteRecipe(id);
		return "redirect:/"; 
    } 
}
