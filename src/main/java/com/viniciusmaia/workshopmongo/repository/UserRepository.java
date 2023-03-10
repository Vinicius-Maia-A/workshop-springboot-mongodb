package com.viniciusmaia.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.viniciusmaia.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String> {
	
}