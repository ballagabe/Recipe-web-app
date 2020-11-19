package com.web.recipe.application.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.web.recipe.domain.Recipe;
import com.web.recipe.domain.RecipeType;
import com.web.recipe.domain.User;
import com.web.recipe.repository.RecipeRepository;
import com.web.recipe.repository.UserRepository;


@Component
public class CreateRecipe {
	
	@Autowired
	private RecipeRepository recipeRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Transactional
<<<<<<< HEAD:recipe/recipe-application/src/main/java/com/web/recipe/application/service/CreateRecipe.java
	public void createAndSaveRecipe(String name, String ingredients, String description, String img, int type, int userId) {
		User user = userRepository.findById(userId).get();
		Recipe newRecipe = createRecipe(name, ingredients, description, img, RecipeType.values()[type], user);
=======
	public void createAndSaveRecipe(String name, String ingredients, String description, String img, RecipeType type, int userId) {
		User user = userRepository.findById(userId).get();
		Recipe newRecipe = createRecipe(name, ingredients, description, img, type, user);
>>>>>>> d3150877a373678ca4377f4714befdd274fdda44:recipe/recipe-application/src/main/java/com/web/recipe/application/service/TestData.java
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
