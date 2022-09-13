package com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.entity.User;
import com.api.service.UserService;

@RestController
@RequestMapping("/req")
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

	@DeleteMapping("/api/{id}")
	public String deleteById(@PathVariable Integer id) {

		return service.deleteById(id);
	}

	@PutMapping("/api/{id}")
	public User updateById(@RequestBody User user) {

		return service.save(user);
	}
	@GetMapping("/get/todo/{city}")
	public List<User> getByUserCity(@PathVariable String city) {
		
		return service.getByUserCity(city);
	}

}
