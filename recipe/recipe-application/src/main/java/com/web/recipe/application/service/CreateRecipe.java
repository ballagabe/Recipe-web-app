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
	public void createAndSaveRecipe(String name, String ingredients, String description, String img, RecipeType type, int userId) {
		User user = userRepository.findById(userId).get();
		Recipe newRecipe = createRecipe(name, ingredients, description, img, type, user);
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
