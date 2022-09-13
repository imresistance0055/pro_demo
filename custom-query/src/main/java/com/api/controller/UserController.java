package com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.entity.User;
import com.api.service.UserService;

@RestController
@RequestMapping(value="/todo")
public class UserController {
	@Autowired
	private UserService service;

	@PostMapping("/api")
	public User save(@RequestBody User user) {
		
		return service.save(user);
	}
	@GetMapping("/api")
	public List<User> get(){
		
		return service.get();
	}
	@GetMapping("/getByUserFirstName/{first_name}")
	public List<User> getByUserFirstName(@PathVariable String first_name){
		
		return service.getByUserFirstName(first_name);
	}
	@GetMapping("/getByUserCityOrContact/{city}/{contact}")
	public List<User> getByUserCityOrContact(@PathVariable String city, @PathVariable String contact){
		
		return service.getByUserCityOrContact(city, contact);
	}

	
}