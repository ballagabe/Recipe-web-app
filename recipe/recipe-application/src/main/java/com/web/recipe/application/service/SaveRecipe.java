package com.web.recipe.application.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.web.recipe.domain.Recipe;
import com.web.recipe.domain.SavedRecipes;
import com.web.recipe.domain.User;
import com.web.recipe.repository.RecipeRepository;
import com.web.recipe.repository.SavedRecipesRepository;
import com.web.recipe.repository.UserRepository;

import org.springframework.stereotype.Service;


@Service
public class SaveRecipe {

	@Autowired
	private RecipeRepository recipeRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private SavedRecipesRepository savedRecipesRepository;


	public Iterable<Recipe> findAllRecipe() {
		return recipeRepository.findAll();
	}

	
	public SavedRecipes saveRecipes(int recipeId) {
		Recipe recipe = recipeRepository.findById(recipeId).get();
		User user = userRepository.findByEmail("adam@test.com");
		
		SavedRecipes savedRecipe = new SavedRecipes();
		savedRecipe.setRecipe(recipe);
		savedRecipe.setUser(user);
		
		return savedRecipesRepository.save(savedRecipe);
		
		
	}
	
	
}
