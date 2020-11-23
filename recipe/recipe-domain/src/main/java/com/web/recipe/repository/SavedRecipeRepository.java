package com.web.recipe.repository;

import org.springframework.data.repository.CrudRepository;

import com.web.recipe.domain.SavedRecipe;

public interface SavedRecipeRepository extends CrudRepository<SavedRecipe, Integer>{

}
