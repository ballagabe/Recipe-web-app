package com.web.recipe.webdomain;

public class GetRecipeRequestDomain{
	private final String name;

	private final String ingredients;
	
	private final String description;
	
	private final String type;

	public GetRecipeRequestDomain(String name, String ingredients, String description, String type) {
		super();
		this.name = name;
		this.ingredients = ingredients;
		this.description = description;
		this.type = type;
	}

	public String getName() {
		return name;
	}
	
	public String getIngredients() {
		return ingredients;
	}

	public String getDescription() {
		return description;
	}

	public String getType() {
		return type;
	}
}