package com.web.recipe.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class SavedRecipes {

	@Id
	@GeneratedValue
	private int id;

	@ManyToOne
	private User user;
	
	@ManyToOne
	private Recipe recipe;
}