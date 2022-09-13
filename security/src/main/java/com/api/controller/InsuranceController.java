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

import com.api.entity.Insurance;
import com.api.service.InsuranceService;

@RestController
@RequestMapping("/todo")
public class InsuranceController {
	@Autowired
	private InsuranceService service;

	@PostMapping("/api")
	public Insurance save(@RequestBody Insurance insurance) {

		return service.save(insurance);
	}

	@GetMapping("/api")
	public List<Insurance> get() {

		return service.get();
	}

	@GetMapping("/api/{id}")
	public Insurance getById(@PathVariable Integer id) {

		return service.getById(id);
	}

	@DeleteMapping("/api/{id}")
	public String deleteById(@PathVariable Integer id) {

		return service.deleteById(id);
	}

	@PutMapping("/api/{id}")
	public Insurance updateById(@RequestBody Insurance insurance) {

		return service.save(insurance);
	}

}
