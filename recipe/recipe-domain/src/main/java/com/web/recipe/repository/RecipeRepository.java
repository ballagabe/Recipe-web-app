package com.web.recipe.repository;

import org.springframework.data.repository.CrudRepository;

import com.web.recipe.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Integer>{

}
