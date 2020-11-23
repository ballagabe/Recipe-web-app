package com.web.recipe.application.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.web.recipe.domain.User;
import com.web.recipe.repository.UserRepository;


@Component
public class UserServices {

	@Autowired
	private UserRepository userRepository;
	
	
	@Transactional
	public void createAndSaveUser(String name, String nickname, String email, String password) {
		User newUser = createUser(name, nickname, email, password);
		userRepository.save(newUser);
	}
	
	private User createUser(String name, String nickname, String email, String password) {
		User user = new User();
		user.setName(name);
		user.setNickname(nickname);
		user.setEmail(email);
		user.setPassword(password);
		return user;
	}
}
