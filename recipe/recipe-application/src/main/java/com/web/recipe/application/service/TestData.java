package com.web.recipe.application.service;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.web.recipe.domain.User;
import com.web.recipe.repository.UserRepository;


@Component
public class TestData {

	@Autowired
	private UserRepository userRepository;
	
	@Transactional
	public void createTestData() {
		User adam = createUser("Adam", "Adam90", "adam@test.com", "str0ngpassw0rd");
		userRepository.save(adam);
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
