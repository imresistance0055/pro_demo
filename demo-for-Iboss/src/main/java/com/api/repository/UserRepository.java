package com.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.api.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	@Query("select e from userdetails e where e.name=?1 and e.address=?2")
	
	public List<User> getByUserNameOrAddress( String name,String address);
	
	@Query("select e from userdetails e where e.contact=?1")
	public List<User> getByUsercontact(Integer contact);
	
}
