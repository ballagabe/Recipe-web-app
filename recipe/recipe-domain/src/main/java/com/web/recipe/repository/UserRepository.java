package com.web.recipe.repository;

import org.springframework.data.repository.CrudRepository;

import com.web.recipe.domain.User;

public interface UserRepository extends CrudRepository<User, Integer>{
	User findByEmail(String email);
}
