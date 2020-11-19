package com.web.recipe.webdomain;

public class GetRecipeRequestDomain{
	private final String name;

	private final String ingredients;
	
	private final String description;
	
	private final String img;
	
	private final String type;

	public GetRecipeRequestDomain(String name, String ingredients, String description, String img, String type) {
		super();
		this.name = name;
		this.ingredients = ingredients;
		this.description = description;
		this.img = img;
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

	public String getImg() {
		return img;
	}

	public String getType() {
		return type;
	}
}