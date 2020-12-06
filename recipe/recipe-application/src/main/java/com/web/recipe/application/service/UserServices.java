package com.web.recipe.application.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.web.recipe.domain.User;
import com.web.recipe.domain.UserType;
import com.web.recipe.repository.UserRepository;


@Component
public class UserServices {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder; 
	
	@Transactional
	public void createAndSaveUser(String name, String nickname, String email, String password) {
		User newUser = createUser(name, nickname, email, password);
		userRepository.save(newUser);
	}
	
	@Transactional
	private User createUser(String name, String nickname, String email, String password) {
		User user = new User();
		user.setName(name);
		user.setNickname(nickname);
		user.setEmail(email);
		user.setPassword(passwordEncoder.encode(password));
		user.setUserType(UserType.CUSTOMER);
		return user;
	}

	@Transactional
	public void updateUser(String nickname, String name, String newNickName, String password) {
		User user =  userRepository.findByEmail(nickname);
		if(name.length() > 0) user.setName(name);
		if(newNickName.length() > 0) user.setNickname(newNickName);
		if(password.length() > 0) user.setPassword(passwordEncoder.encode(password));
		userRepository.save(user);
	}
	
	@Transactional
	public List<User> getAllUser() {
		List<User> users = (List<User>) userRepository.findAll();
		return users;
	}
}
