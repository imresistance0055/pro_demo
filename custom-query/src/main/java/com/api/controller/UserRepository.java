package com.api.controller;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.api.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	
	@Query("select e from userdetails e where e.first_name=?1")
	public List<User> getByUserFirstName(String first_name);
	
	@Query("select e from userdetails e where e.last_name=?1")
	public List<User> getByUserLastName(String last_name);
	
	@Query("select e from userdetails e where e.city=?1")
	public List<User> getByUserCity(String city);
	
	@Query("select e from userdetails e where e.address=?1")
	public List<User> getByUserAddress(String address);
	
	@Query("select e from userdetails e where e.email=?1")
	public List<User> getByUserEmail(String email);
	
	@Query("select e from userdetails e where e.contact=?1")
	public List<User> getByUserContact(Integer contact);
	
	
	@Query("select e from userdetails e where e.last_name=?1 and e.city=?2")
	public List<User> getByUserLastNameOrcity(String last_name, String city);
	

}
