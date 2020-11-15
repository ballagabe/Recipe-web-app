package com.web.recipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.web.recipe.application.service.SaveRecipe;
import com.web.recipe.application.service.TestData;

@SpringBootApplication
public class RecipeApplication {

	
	@Autowired
	private TestData testDataGenerator;
	
	@Autowired
	private SaveRecipe saveRecipe;
	
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
		testDataGenerator.createTestData();
		
		saveRecipe.saveRecipes(2);
	}
	

}
