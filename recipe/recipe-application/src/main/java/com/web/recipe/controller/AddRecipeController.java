package com.web.recipe.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.web.recipe.application.service.RecipeServices;
import com.web.recipe.application.service.UserServices;
import com.web.recipe.domain.User;
import com.web.recipe.webdomain.AddRecipeRequestDomain;
import com.web.recipe.webdomain.ProfileUserDomain;

@Controller
public class AddRecipeController {
	@Autowired
	private RecipeServices createRecipe;
	
	@Autowired
	private UserServices userServices;
	
	@GetMapping("/addrecipe")
	public String addrecipe(@RequestParam("user") String nickname,  Model model) {
		List<User> users = new ArrayList<>();
		List<ProfileUserDomain> user = new ArrayList<>();
		users.addAll(userServices.getAllUser());
		users.forEach(r -> {
		if(r.getNickname().contains(nickname)){
			user.add(new ProfileUserDomain(r.getName(), r.getNickname(), r.getEmail(), r.getId()));
		}});
		model.addAttribute("userid", user.get(0).getId());
		return "addrecipe"; 
	}
	
	@PostMapping("/addrecipemethod")
    public String addRecipe(AddRecipeRequestDomain requestRecipe) {
		createRecipe.createAndSaveRecipe(requestRecipe.getName(), requestRecipe.getIngredients(), requestRecipe.getDescription(), requestRecipe.getType(), requestRecipe.getUserId());
		return "redirect:/";
    }
}
