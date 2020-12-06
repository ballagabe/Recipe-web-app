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
	private UserServices userServices;
	
	@Autowired
	private RecipeServices recipeServices;
	
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
		userServices.createAndSaveUser("Wei Zsófia", "Zsofa", "zsofi@gmail.com", "12345");
		userServices.createAndSaveUser("Balla Gábor", "Gabor123", "gabor@gmail.com", "12345");
		userServices.createAndSaveUser("Kovács János", "Jani", "kjani@mail.com", "12345");
		userServices.createAndSaveUser("Hajós Anna", "Annus", "annuska14@mail.com", "12345");
		userServices.createAndSaveUser("Katona Kata", "KKatus", "kkatus@mail.com", "12345");
		userServices.createAndSaveUser("Séf Róbert", "Robi", "robisef@mail.com", "12345"); 

		recipeServices.createAndSaveRecipe("Zsíros kenyér hagymával", "só, kenyér, zsír, hagyma", "Kend", 0, 1);
		recipeServices.createAndSaveRecipe("HATLAPOS SÜTEMÉNY KAKAÓS KRÉMMEL", "tej, rétesliszt, búzaliszt, zsír, porcukor, tojás, olvasztott méz, kristálycukor, víz, kakaópor, vaj, vaníliás cukor", "A tésztához meleg tejben felfuttatjuk a szalalkálit-", 2, 2);
		recipeServices.createAndSaveRecipe("Hamburger", "buci, húspogácsa, sajt, uborka, paradicsom, ketchup, majonéz", "Süsd meg a pogácsákat, majd pakold a buciba kedved szerint válogatva hozzá a zöldségeket, szószokat", 1, 3);
		recipeServices.createAndSaveRecipe("Kínai tésztaleves", "üvegtészta, zöldség, csirkealaplé", "Aprítsd fel a zöldséget, fõzd meg a tésztát, majd forrald fel az alaplevet, tedd bele a hozzávalokat és kész", 3, 4);
		recipeServices.createAndSaveRecipe("Saláta", "saláta, paradicsom, uborka, paprika, hagyma, sajt, kenyér", "Pirítsd meg a kenyeret, vágd kockára a zöldségekkel együtt majd egy tálban keverd össze", 4, 5);
		recipeServices.createAndSaveRecipe("Csokis pattogatott kukorica", "pattogatott kukorica, csoki", "Darabold fel a csokit, majd egy lábosba olajat öntünk, és a még ki nem pattogott kukoricákat a csokival együtt beletesszük. Fedõt rátéve sûrûn felrázva kipattogtatjuk.", 5, 6);
	}
}
