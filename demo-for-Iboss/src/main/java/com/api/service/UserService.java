package com.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.entity.User;
import com.api.repository.UserRepository;

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

	public List<User> getByUserNameOrAddress(String name,String address) {

		return repo.getByUserNameOrAddress(name, address);
	}
	
	public List<User> getByUserContact(Integer contact){
		
		return repo.getByUsercontact(contact);
	}

}
