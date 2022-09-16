package com.service.Doctor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.Doctor.Entity.Doctor;
import com.service.Doctor.Entity.Response;
import com.service.Doctor.services.services;

@RestController
@RequestMapping("/doctor")
public class controller {
	@Autowired
	private services ser;
	
	@PostMapping("/add")
	public Doctor addDoctor(@RequestBody Doctor doc) {
		return this.ser.addDoctor(doc);
	}
	
	@GetMapping("/get/{dName}")
	public Response getDoctor(@PathVariable String dName) {
		return this.ser.getDoctor(dName);
	}
	
}
