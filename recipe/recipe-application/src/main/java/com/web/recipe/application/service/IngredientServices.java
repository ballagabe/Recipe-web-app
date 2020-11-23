package com.web.recipe.application.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.web.recipe.domain.Ingredient;
import com.web.recipe.domain.User;
import com.web.recipe.repository.IngredientRepository;
import com.web.recipe.repository.UserRepository;


@Component
public class IngredientServices {

	@Autowired
	private IngredientRepository ingredientRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Transactional
	public void createAndSaveIngredients(int userId, String name) {
		User user = userRepository.findById(userId).get();
		Ingredient newIngredients = createIngredients(user, name);
		ingredientRepository.save(newIngredients);
	}
	
	private Ingredient createIngredients (User user, String name) {
		Ingredient ingr = new Ingredient();
		ingr.setName(name);
		ingr.setUser(user);
		return ingr;
	}
}
