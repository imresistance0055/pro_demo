package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;

	public User save(User user) {

		return repo.save(user);
	}

	public List<User> get() {

		return repo.findAll();
	}

	public User getById(Integer id) {

		return repo.findById(id).orElse(null);
	}

	public String deleteById(Integer id) {

		repo.deleteById(id);

		return "Delete By Id";
	}

}
