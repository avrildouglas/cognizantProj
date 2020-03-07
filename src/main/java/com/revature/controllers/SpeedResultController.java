package com.revature.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.dao.SpeedResultRepository;

import revature.com.models.SpeedResult;

@RestController
@RequestMapping("/SpeedResult")

public class SpeedResultController {
	
	@Autowired
	private SpeedResultRepository repository;
	@PostMapping
	public String saveExperiment(@RequestBody SpeedResult request) {
		repository.save(request);
		return "test";
		
	}
	
	

	


}