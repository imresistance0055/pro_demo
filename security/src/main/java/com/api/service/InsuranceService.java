package com.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.entity.Insurance;
import com.api.repository.InsuranceRepository;

@Service
public class InsuranceService {

	@Autowired
	private InsuranceRepository repo;

	public Insurance save(Insurance insurance) {

		return repo.save(insurance);
	}

	public List<Insurance> get() {

		return repo.findAll();
	}
	
	public Insurance getById(Integer id) {
		
		return repo.findById(id).orElse(null);
	}

	public String deleteById(Integer id) {
		
		repo.deleteById(id);
		return "Delete By Id";
	}
	
	
}
