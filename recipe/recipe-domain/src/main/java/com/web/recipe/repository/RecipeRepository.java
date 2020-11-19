package com.web.recipe.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.web.recipe.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Integer>{

	ArrayList<Recipe> findAllById(int userId);

}
