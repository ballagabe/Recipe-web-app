package com.web.recipe.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.web.recipe.domain.Recipe;
@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Integer>{

	ArrayList<Recipe> findAllById(int userId);
	Integer deleteByName(String name);
	Recipe findByName(String name);
	
}
