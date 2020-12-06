package com.web.recipe.repository;

import org.springframework.data.repository.CrudRepository;

import com.web.recipe.domain.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, Integer>{

}
