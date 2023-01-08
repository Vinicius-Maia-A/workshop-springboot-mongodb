package com.viniciusmaia.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.viniciusmaia.workshopmongo.domain.User;

@RestController //indica que a classe será um recurso rest
@RequestMapping(value = "users") //indica o caminho do end point
public class UserResource {

	//retorna uma lista de usuários
	@RequestMapping(method = RequestMethod.GET) //ou @GetMapping
	public ResponseEntity<List<User>> findAll() {
		
		User maria = new User("1", "Maria Brown", "maria@gmail.com");
		User alex = new User("2", "Alex Green", "alex.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria,alex));
		
		return ResponseEntity.ok().body(list);
	}
}
