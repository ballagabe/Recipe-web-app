package com.web.recipe.repository;

import org.springframework.data.repository.CrudRepository;

import com.web.recipe.domain.SavedRecipes;

public interface SavedRecipesRepository extends CrudRepository<SavedRecipes, Integer>{

}
