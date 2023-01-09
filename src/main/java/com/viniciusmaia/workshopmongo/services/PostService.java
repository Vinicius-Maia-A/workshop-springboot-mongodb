package com.viniciusmaia.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viniciusmaia.workshopmongo.domain.Post;
import com.viniciusmaia.workshopmongo.repository.PostRepository;
import com.viniciusmaia.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;

	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		System.out.println(obj);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado!"));
	}
	
}
