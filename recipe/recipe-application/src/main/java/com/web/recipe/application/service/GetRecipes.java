package com.web.recipe.application.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.web.recipe.domain.Recipe;
import com.web.recipe.domain.User;
import com.web.recipe.repository.RecipeRepository;
import com.web.recipe.repository.UserRepository;

@Component
public class GetRecipes {
	
	@Autowired
	private RecipeRepository recipeRepository;

	@Autowired
	private UserRepository userRepository;
	
	@Transactional
	public Recipe getRandomRecipe() {
		ArrayList<Recipe> recipe = (ArrayList<Recipe>) recipeRepository.findAll();
		Random rnd = new Random();
		int random = rnd.nextInt(recipe.size());
		return recipe.get(random);
	}
	
	@Transactional
	public ArrayList<Recipe> getAllRecipe() {
		ArrayList<Recipe> recipes = (ArrayList<Recipe>) recipeRepository.findAll();
		return recipes;
	}
	
	@Transactional
	public Recipe getRecipeWithId(int recipeId) {
		Optional<Recipe> recipe = recipeRepository.findById(recipeId);
		return recipe.isPresent() ? recipe.get() : null;
	}
	
	@Transactional
	public List<Recipe> getOwnRecipes(int userId) {
		Optional<User> user = userRepository.findById(userId);
		return user.isPresent() ? user.get().getRecipes() : null;
	}
}
