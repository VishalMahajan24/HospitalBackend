package com.service.Patient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.Patient.Entity.Patient;
import com.service.Patient.services.services;

@RestController
@RequestMapping("/patient")
public class controller {
	
	@Autowired
	private services ser;
	
	@PostMapping("/add")
	public Patient addPatient(@RequestBody Patient po) {
		return this.ser.addPatient(po);
	}
	
	@GetMapping("/get/{id}")
	public Patient getPatient(@PathVariable String id) {
		return this.ser.getPatient(Integer.parseInt(id));
	}

}
