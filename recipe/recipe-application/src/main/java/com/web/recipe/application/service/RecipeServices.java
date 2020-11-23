package com.web.recipe.application.service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.recipe.domain.Recipe;
import com.web.recipe.domain.RecipeType;
import com.web.recipe.domain.SavedRecipe;
import com.web.recipe.domain.User;
import com.web.recipe.repository.RecipeRepository;
import com.web.recipe.repository.SavedRecipeRepository;
import com.web.recipe.repository.UserRepository;

@Service
public class RecipeServices {
	
	@Autowired
	private RecipeRepository recipeRepository;

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private SavedRecipeRepository savedRecipesRepository;
	
	//Find services
	@Transactional
	public Recipe getRandomRecipe() {
		List<Recipe> recipe = (List<Recipe>) recipeRepository.findAll();
		Random rnd = new Random();
		int random = rnd.nextInt(recipe.size());
		return recipe.get(random);
	}
	
	@Transactional
	public List<Recipe> getAllRecipe() {
		List<Recipe> recipes = (List<Recipe>) recipeRepository.findAll();
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
	
	//Save
	@Transactional
	public void saveRecipe(int userId, int recipeId) {
		Recipe recipe = recipeRepository.findById(recipeId).get();
		User user = userRepository.findById(userId).get();
		
		SavedRecipe savedRecipe = new SavedRecipe();
		savedRecipe.setRecipe(recipe);
		savedRecipe.setUser(user);
		
		savedRecipesRepository.save(savedRecipe);
	}
	
	//Create
	@Transactional
	public void createAndSaveRecipe(String name, String ingredients, String description, String img, int type, int userId) {
		User user = userRepository.findById(userId).get();
		Recipe newRecipe = createRecipe(name, ingredients, description, img, RecipeType.values()[type], user);
		recipeRepository.save(newRecipe);
	}

	private Recipe createRecipe(String name, String ingredients, String description, String img, RecipeType type, User user) {
		Recipe recipe = new Recipe();
		recipe.setName(name);
		recipe.setIngredients(ingredients);
		recipe.setDescription(description);
		recipe.setImg(img);
		recipe.setType(type);
		recipe.setUser(user);
		return recipe;
	}
}
