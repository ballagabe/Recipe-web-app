package com.web.recipe.repository;

import org.springframework.data.repository.CrudRepository;

import com.web.recipe.domain.Ingredients;

public interface IngredientsRepository extends CrudRepository<Ingredients, Integer>{

}
