package com.web.recipe.webdomain;

public class GetOneRecipeDomain{
	private final int id;
	
	private final String name;

	private final String ingredients;
	
	private final String description;
	
	private final String type;
	
	private final int userId;

	public GetOneRecipeDomain(int id, String name, String ingredients, String description, String type, int userId) {
		super();
		this.id = id;
		this.name = name;
		this.ingredients = ingredients;
		this.description = description;
		this.type = type;
		this.userId = userId;
	}

	public int getId() {
		return id;
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

	public int getUserId() {
		return userId;
	}
}