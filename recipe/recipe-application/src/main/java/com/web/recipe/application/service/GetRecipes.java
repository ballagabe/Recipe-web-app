package com.web.recipe.application.service;

<<<<<<< HEAD
=======
import java.util.ArrayList;
>>>>>>> d3150877a373678ca4377f4714befdd274fdda44
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
<<<<<<< HEAD
		List<Recipe> recipe = (List<Recipe>) recipeRepository.findAll();
=======
		ArrayList<Recipe> recipe = (ArrayList<Recipe>) recipeRepository.findAll();
>>>>>>> d3150877a373678ca4377f4714befdd274fdda44
		Random rnd = new Random();
		int random = rnd.nextInt(recipe.size());
		return recipe.get(random);
	}
	
	@Transactional
<<<<<<< HEAD
	public List<Recipe> getAllRecipe() {
		List<Recipe> recipes = (List<Recipe>) recipeRepository.findAll();
=======
	public ArrayList<Recipe> getAllRecipe() {
		ArrayList<Recipe> recipes = (ArrayList<Recipe>) recipeRepository.findAll();
>>>>>>> d3150877a373678ca4377f4714befdd274fdda44
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
