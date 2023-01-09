package com.viniciusmaia.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.viniciusmaia.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {
	
}