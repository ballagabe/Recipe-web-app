package com.web.recipe.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.web.recipe.application.service.GetRecipes;
import com.web.recipe.webdomain.GetRecipeRequestDomain;

@Controller
public class IndexController {

	@Autowired
	private GetRecipes getRecipesService;
	
	@GetMapping("/index")
    public String index(Model model) {
		List<GetRecipeRequestDomain> responseRecipeList = new ArrayList<>();
		getRecipesService.getAllRecipe().forEach(r -> responseRecipeList.add(new GetRecipeRequestDomain(r.getName(), r.getIngredients(), r.getDescription(), r.getImg(), r.getType().toString())));
		model.addAttribute("recipes", responseRecipeList);
		return "index";
    }
}
