package com.web.recipe;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.web.recipe.application.service.*;
import com.web.recipe.domain.User;

@SpringBootApplication
public class RecipeApplication {

	
	@Autowired
	private UserServices userServices;
	
	@Autowired
	private RecipeServices recipeServices;
	
	@Autowired
	private IngredientServices ingredientServices;
	
	@Autowired
	private RecipeApplication recipeApplication;
	
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
		userServices.createAndSaveUser("Zsofi", "Zsofi123", "zsofi@gmail.com", "jelszo");
		userServices.createAndSaveUser("Gabor", "Gabor123", "gabor@gmail.com", "jelszo");
		
		recipeServices.createAndSaveRecipe("piritos", "so kenyer", "fozd", 0, 1);
		recipeServices.createAndSaveRecipe("hamburger", "hus pogacsa", "fozd es susd", 3, 2);
		
		ingredientServices.createAndSaveIngredients(1, "Só");
		
		recipeServices.saveRecipe(1,1);
	}
}
