package com.web.recipe.controller;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.recipe.application.service.RecipeServices;
import com.web.recipe.webdomain.GetRecipeRequestDomain;

@Controller
public class IndexController {

	@Autowired
	private RecipeServices getRecipesService; 
	
	@GetMapping("/")
    public String index(Model model) {
		List<GetRecipeRequestDomain> responseRecipeList = new ArrayList<>();
		getRecipesService.getAllRecipe().forEach(r -> responseRecipeList.add(new GetRecipeRequestDomain(r.getId(), r.getName(), r.getIngredients(), r.getDescription(), r.getType().toString())));
		Random rnd = new Random();
		int random = rnd.nextInt(responseRecipeList.size());
		model.addAttribute("recipes", responseRecipeList);
		model.addAttribute("random", random);
		return "index";
    }
	
	@GetMapping("/index")
    public String searchIndex(Model model, @RequestParam(required = false) String s) {
		List<GetRecipeRequestDomain> responseRecipeList = new ArrayList<>();
		getRecipesService.getAllRecipe().forEach(r -> responseRecipeList.add(new GetRecipeRequestDomain(r.getId(), r.getName(), r.getIngredients(), r.getDescription(), r.getType().toString())));
		List<GetRecipeRequestDomain> searchRecipeList = new ArrayList<>();
		getRecipesService.getAllRecipe().forEach(r -> {
		if(r.getName().contains(s) && s != ""){
			searchRecipeList.add(new GetRecipeRequestDomain(r.getId(), r.getName(), r.getIngredients(), r.getDescription(), r.getType().toString()));
		}});
		Random rnd = new Random();
		int random = rnd.nextInt(responseRecipeList.size());
		model.addAttribute("recipes", responseRecipeList);
		model.addAttribute("random", random);
		model.addAttribute("searchrecipes", searchRecipeList);
		return "index";
    }
}
