package com.web.recipe.application.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.web.recipe.domain.Ingredients;
import com.web.recipe.domain.User;
import com.web.recipe.repository.IngredientsRepository;
import com.web.recipe.repository.UserRepository;


@Component
public class CreateIngredients {

	@Autowired
	private IngredientsRepository ingredientsRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Transactional
	public void createAndSaveIngredients(int userId, String name) {
		User user = userRepository.findById(userId).get();
		Ingredients newIngredients = createIngredients(user, name);
		ingredientsRepository.save(newIngredients);
	}
	
	private Ingredients createIngredients (User user, String name) {
		Ingredients ingr = new Ingredients();
		ingr.setName(name);
		ingr.setUser(user);
		return ingr;
	}
}
