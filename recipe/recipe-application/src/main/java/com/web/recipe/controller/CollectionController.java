package com.web.recipe.controller;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.recipe.application.service.RecipeServices;
import com.web.recipe.application.service.UserServices;
import com.web.recipe.domain.SavedRecipe;
import com.web.recipe.domain.User;
import com.web.recipe.webdomain.GetOneRecipeDomain;
import com.web.recipe.webdomain.GetRecipeRequestDomain;
import com.web.recipe.webdomain.ProfileUserDomain;
 
@Controller
public class CollectionController {

	@Autowired
	private RecipeServices getRecipesService; 
	
	@Autowired
	private UserServices userServices; 
	
	@GetMapping("/collection")
    public String coll(@RequestParam("user") String nickname, Model model) {
		List<User> users = new ArrayList<>();
		List<ProfileUserDomain> user = new ArrayList<>();
		users.addAll(userServices.getAllUser());
		users.forEach(r -> {
		if(r.getNickname().contains(nickname)){
			user.add(new ProfileUserDomain(r.getName(), r.getNickname(), r.getEmail(), r.getId()));
		}});
		List<SavedRecipe> savedRecipes = getRecipesService.getAllSavedRecipe();		
		List<GetRecipeRequestDomain> responseOwnRecipes = new ArrayList<>();
		List<GetRecipeRequestDomain> responseFavRecipes = new ArrayList<>();
		getRecipesService.getAllRecipe().forEach(r -> {
			if(r.getUser().getId() == user.get(0).getId()){
				responseOwnRecipes.add(new GetRecipeRequestDomain(r.getId(), r.getName(), r.getIngredients(), r.getDescription(), r.getType().toString()));
			}
			savedRecipes.forEach(a -> {
				if(user.get(0).getId() == a.getUser().getId() && r.getId() == a.getRecipe().getId()){
					responseFavRecipes.add(new GetRecipeRequestDomain(r.getId(), r.getName(), r.getIngredients(), r.getDescription(), r.getType().toString()));
				}
			});
		});
		model.addAttribute("username", user.get(0).getUsername());
		model.addAttribute("usernick", user.get(0).getNickname());
		model.addAttribute("useremail", user.get(0).getEmail());
		model.addAttribute("ownRecipes", responseOwnRecipes);
		model.addAttribute("favRecipes", responseFavRecipes);
        return "collection";
    }
}