package com.api.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.api.dao.UserRepository;
import com.api.entity.User;

@Service
public class UserService {

	private UserRepository repo;

	public List<User> getByUserFirstName(String first_name) {

		return repo.getByUserFirstName(first_name);
	}

	public List<User> getByUserCityOrContact(String city, String contact) {

		return repo.getByUserCityOrContact(city, contact);
	}
	
	public User save(User user) {
		
		return repo.save(user);
	}
	
	public List<User> get(){
		return repo.findAll();
	}

}
