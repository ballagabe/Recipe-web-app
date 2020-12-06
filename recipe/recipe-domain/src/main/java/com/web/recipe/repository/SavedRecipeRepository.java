package com.web.recipe.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.web.recipe.domain.SavedRecipe;

public interface SavedRecipeRepository extends CrudRepository<SavedRecipe, Integer>{

	ArrayList<SavedRecipe> findAllById(int id);
	
}
