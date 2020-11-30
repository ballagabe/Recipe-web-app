package com.web.recipe.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.web.recipe.application.service.RecipeServices;
import com.web.recipe.domain.RecipeType;
import com.web.recipe.webdomain.GetRecipeRequestDomain;

@Controller
public class CategoriesController {

	@Autowired
	private RecipeServices getRecipesService; 
	
	@GetMapping("/breakfast")
    public String breakfast(Model model) {
		List<GetRecipeRequestDomain> responseRecipeList = new ArrayList<>();
		getRecipesService.getAllRecipe().forEach(r -> responseRecipeList.add(new GetRecipeRequestDomain(r.getId(), r.getName(), r.getIngredients(), r.getDescription(), r.getType().toString())));
		List<GetRecipeRequestDomain> filteredResponseRecipeList = new ArrayList<>();
        for (GetRecipeRequestDomain recipe: responseRecipeList) {
            if (recipe.getType() == RecipeType.Breakfast.toString()) {
            	filteredResponseRecipeList.add(recipe);
            }
        }
		
		model.addAttribute("recipes", filteredResponseRecipeList);
		return "breakfast";
    }
	
	@GetMapping("/dinner")
    public String dinner(Model model) {
		List<GetRecipeRequestDomain> responseRecipeList = new ArrayList<>();
		getRecipesService.getAllRecipe().forEach(r -> responseRecipeList.add(new GetRecipeRequestDomain(r.getId(), r.getName(), r.getIngredients(), r.getDescription(), r.getType().toString())));
		List<GetRecipeRequestDomain> filteredResponseRecipeList = new ArrayList<>();
        for (GetRecipeRequestDomain recipe: responseRecipeList) {
            if (recipe.getType() == RecipeType.Dinner.toString()) {
            	filteredResponseRecipeList.add(recipe);
            }
        }
		
		model.addAttribute("recipes", filteredResponseRecipeList);
		return "dinner";
    }
	
	@GetMapping("/dessert")
    public String dessert(Model model) {
		List<GetRecipeRequestDomain> responseRecipeList = new ArrayList<>();
		getRecipesService.getAllRecipe().forEach(r -> responseRecipeList.add(new GetRecipeRequestDomain(r.getId(), r.getName(), r.getIngredients(), r.getDescription(), r.getType().toString())));
		List<GetRecipeRequestDomain> filteredResponseRecipeList = new ArrayList<>();
        for (GetRecipeRequestDomain recipe: responseRecipeList) {
            if (recipe.getType() == RecipeType.Dessert.toString()) {
            	filteredResponseRecipeList.add(recipe);
            }
        }
		
		model.addAttribute("recipes", filteredResponseRecipeList);
		return "dessert";
    }
	
	@GetMapping("/soup")
    public String soup(Model model) {
		List<GetRecipeRequestDomain> responseRecipeList = new ArrayList<>();
		getRecipesService.getAllRecipe().forEach(r -> responseRecipeList.add(new GetRecipeRequestDomain(r.getId(), r.getName(), r.getIngredients(), r.getDescription(), r.getType().toString())));
		List<GetRecipeRequestDomain> filteredResponseRecipeList = new ArrayList<>();
        for (GetRecipeRequestDomain recipe: responseRecipeList) {
            if (recipe.getType() == RecipeType.Soup.toString()) {
            	filteredResponseRecipeList.add(recipe);
            }
        }
		
		model.addAttribute("recipes", filteredResponseRecipeList);
		return "soup";
    }
	
	@GetMapping("/salad")
    public String salad(Model model) {
		List<GetRecipeRequestDomain> responseRecipeList = new ArrayList<>();
		getRecipesService.getAllRecipe().forEach(r -> responseRecipeList.add(new GetRecipeRequestDomain(r.getId(), r.getName(), r.getIngredients(), r.getDescription(), r.getType().toString())));
		List<GetRecipeRequestDomain> filteredResponseRecipeList = new ArrayList<>();
        for (GetRecipeRequestDomain recipe: responseRecipeList) {
            if (recipe.getType() == RecipeType.Salad.toString()) {
            	filteredResponseRecipeList.add(recipe);
            }
        }
		
		model.addAttribute("recipes", filteredResponseRecipeList);
		return "salad";
    }
	
	@GetMapping("/snack")
    public String snack(Model model) {
		List<GetRecipeRequestDomain> responseRecipeList = new ArrayList<>();
		getRecipesService.getAllRecipe().forEach(r -> responseRecipeList.add(new GetRecipeRequestDomain(r.getId(), r.getName(), r.getIngredients(), r.getDescription(), r.getType().toString())));
		List<GetRecipeRequestDomain> filteredResponseRecipeList = new ArrayList<>();
        for (GetRecipeRequestDomain recipe: responseRecipeList) {
            if (recipe.getType() == RecipeType.Snack.toString()) {
            	filteredResponseRecipeList.add(recipe);
            }
        }
		
		model.addAttribute("recipes", filteredResponseRecipeList);
		return "snack";
    }
}
