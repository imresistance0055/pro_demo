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
	public List<User> get() {

		return service.get();
	}

	@GetMapping("/getByUserFirstName/{first_name}")
	public List<User> getByUserFirstName(@PathVariable String first_name) {

		return service.getByUserFirstName(first_name);

	}

	@GetMapping("/getByUserLastName/api/{last_name}")
	public List<User> getByUserLastName(@PathVariable String last_name) {

		return service.getByUserFirstName(last_name);

	}
	
	@GetMapping("/getByUserCity/{city}")
	public List<User> getByUserCity(@PathVariable String city) {

		return service.getByUserFirstName(city);

	}

	@GetMapping("/getByUserAddress/{address}")
	public List<User> getByUserAddress(@PathVariable String address) {

		return service.getByUserFirstName(address);

	}

	@GetMapping("/getByUserEmail/{email}")
	public List<User> getByUserEmail(@PathVariable String email) {

		return service.getByUserFirstName(email);

	}

	@GetMapping("/getByUserContact/{contact}")
	public List<User> getByUserContact(@PathVariable Integer contact) {

		return service.getByUserContact(contact);

	}
	
	@GetMapping("/getByUserLastNameOrcity/{last_name}/{city}")
	public List<User> getByUserLastNameOrcity(@PathVariable String last_name,@PathVariable String city) {

		return service.getByUserLastNameOrcity(last_name, city);
	

	}
	
}