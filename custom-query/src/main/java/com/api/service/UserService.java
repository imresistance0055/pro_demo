package com.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.api.controller.UserRepository;
import com.api.entity.User;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;

	public List<User> getByUserFirstName( String first_name) {

		return repo.getByUserFirstName(first_name);

	}

	public List<User> getByUserLastName( String last_name) {

		return repo.getByUserFirstName(last_name);

	}

	public List<User> getByUserCity( String city) {

		return repo.getByUserFirstName(city);

	}

	public List<User> getByUserAddress( String address) {

		return repo.getByUserFirstName(address);

	}

	public List<User> getByUserEmail( String email) {

		return repo.getByUserFirstName(email);

	}

	public List<User> getByUserContact( Integer contact) {

		return repo.getByUserContact(contact);

	}

	public User save(User user) {

		return repo.save(user);

	}

	public List<User> get() {

		return repo.findAll();
	}
	
	public List<User> getByUserLastNameOrcity( String last_name,String city){
		
		return repo.getByUserLastNameOrcity(last_name, city);
	}

}
