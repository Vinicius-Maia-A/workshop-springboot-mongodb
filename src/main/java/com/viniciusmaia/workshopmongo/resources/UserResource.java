package com.viniciusmaia.workshopmongo.resources;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.viniciusmaia.workshopmongo.domain.User;
import com.viniciusmaia.workshopmongo.services.UserService;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users") 
public class UserResource {

	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
