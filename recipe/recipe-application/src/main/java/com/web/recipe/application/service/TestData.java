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
public class TestData {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RecipeRepository recipeRepository;
	
	@Transactional
	public void createTestData() {
		User adam = createUser("Adam", "Adam90", "adam@test.com", "str0ngpassw0rd");
		userRepository.save(adam);
		Recipe piritos = createRecipe("piritos", "sos kenyer", "fozd", "img", RecipeType.type1);
		recipeRepository.save(piritos);
	}

	private User createUser(String name, String nickname, String email, String password) {
		User user = new User();
		user.setName(name);
		user.setNickname(nickname);
		user.setEmail(email);
		user.setPassword(password);
		return user;
	}

	private Recipe createRecipe(String name, String ingredients, String description, String img, RecipeType type) {
		Recipe recipe = new Recipe();
		recipe.setName(name);
		recipe.setIngredients(ingredients);
		recipe.setDescription(description);
		recipe.setImg(img);
		recipe.setType(type);
		return recipe;
	}
}
