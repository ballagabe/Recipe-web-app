package com.web.recipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.web.recipe.application.service.*;

@SpringBootApplication
public class RecipeApplication {

	
	@Autowired
	private CreateUser createUser;
	
	@Autowired
	private CreateRecipe createRecipe;
	
	@Autowired
	private CreateIngredients createIngredients;
	
	@Autowired
	private SaveRecipe saveRecipe;
	
	@Autowired
	private RecipeApplication recipeApplication;
	
	@Autowired
	private GetRecipes getRecipes;
	
	public static void main(String[] args) {
		SpringApplication.run(RecipeApplication.class, args);
	}
	
	@Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) { 
        return args -> {
            recipeApplication.writeToConsole(); 
            
        }; 
    } 
	  
	
	public void writeToConsole() {
		createUser.createAndSaveUser("Zsofi", "Zsofi123", "zsofi@gmail.com", "jelszo");
		createUser.createAndSaveUser("Gabor", "Gabor123", "gabor@gmail.com", "jelszo");
		
		createRecipe.createAndSaveRecipe("piritos", "so kenyer", "fozd", "img", 1, 1);
		createRecipe.createAndSaveRecipe("hamburger", "hus pogacsa", "fozd es susd", "img", 3, 2);
		
		createIngredients.createAndSaveIngredients(1, "Só");
		
		saveRecipe.saveRecipes(1,1);
		
		System.out.println(getRecipes.getRandomRecipe().getName());
		System.out.println(getRecipes.getOwnRecipes(2).get(0).getName()); 
	} 
	

}
