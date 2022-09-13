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
@RequestMapping("/todo")
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

	@GetMapping("/api/{id}")
	public User getById(@PathVariable Integer id) {

		return service.getById(id);
	}

	@GetMapping("/getUserByName/{address}")
	public List<User> getUserByName(@PathVariable String name, @PathVariable String address) {

		return service.getByUserNameOrAddress(name, address);
	}

	@GetMapping("/getByUserContact/{contact}")
	public List<User> getByUserContact(@PathVariable Integer contact) {

		return service.getByUserContact(contact);

	}
	

	@GetMapping("/getByUserNameOrAddress/{name}/{address}")
	public List<User> getByUserNameOrAddress(@PathVariable String name,@PathVariable String address) {

		return service.getByUserNameOrAddress(name,address);

	}
	
	@GetMapping("/getByUserName/{name}")
	public List<User> getByUserName(@PathVariable String name) {

		return service.getByUserName(name);

	}
	
	

	
}
