package com.web.recipe.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.recipe.application.service.RecipeServices;
import com.web.recipe.webdomain.AddRecipeRequestDomain;
import com.web.recipe.webdomain.GetOneRecipeDomain;

@Controller
public class ModifyRecipeController {
	@Autowired
	private RecipeServices recipeServices;
	
	
	@GetMapping("/recipemodify")
	public String modifyrecipe(@RequestParam("id") int id,  Model model) {
		List<GetOneRecipeDomain> responseRecipe = new ArrayList<>();
		recipeServices.getAllRecipe().forEach(r -> {
			if(r.getId() == id) {
				responseRecipe.add(new GetOneRecipeDomain(r.getId(), r.getName(), r.getIngredients(), r.getDescription(), r.getType().toString(), r.getUser().getId()));
			}
		});
		model.addAttribute("recipeid", responseRecipe.get(0).getId());
		model.addAttribute("recipename", responseRecipe.get(0).getName());
		model.addAttribute("recipedescription", responseRecipe.get(0).getDescription());
		model.addAttribute("recipeingredients", responseRecipe.get(0).getIngredients());
		model.addAttribute("recipetype", responseRecipe.get(0).getType());
		return "recipemodify";
	}
	
	@PostMapping("/recipemodifymethod")
    public String recipemodifymethod(AddRecipeRequestDomain requestRecipe) {
		recipeServices.updateRecipe(requestRecipe.getName(), requestRecipe.getIngredients(), requestRecipe.getDescription());
		return "redirect:/";
    }
}
