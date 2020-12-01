package com.web.recipe.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.web.recipe.application.service.RecipeServices;
import com.web.recipe.webdomain.GetOneRecipeDomain;
 
@Controller
public class GetRecipeController {

	@Autowired
	private RecipeServices getRecipesService; 
	
	@GetMapping("/recipe/{id}")
    public String recipe(Model model, @PathVariable("id") int id) {
		List<GetOneRecipeDomain> responseRecipe = new ArrayList<>();
		getRecipesService.getAllRecipe().forEach(r -> {
		if(r.getId() == id){
			responseRecipe.add(new GetOneRecipeDomain(r.getId(), r.getName(), r.getIngredients(), r.getDescription(), r.getType().toString(), r.getUser().getId()));
		}});
		int userid = responseRecipe.get(0).getUserId();
		model.addAttribute("recipe", responseRecipe);
		model.addAttribute("id", id);
		model.addAttribute("userid", userid);
        return "recipe";
    }
}