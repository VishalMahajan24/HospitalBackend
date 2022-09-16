package com.service.Doctor.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.Doctor.Entity.Doctor;
import com.service.Doctor.Entity.Response;
import com.service.Doctor.Repository.Repository;

@Service
public class serviceImpl implements services {
	@Autowired
	private Repository repo;

	@Override
	public Doctor addDoctor(Doctor doc) {
		
		return repo.save(doc);
	}

	@Override
	public Response getDoctor(String dName) {
		
		return repo.getDoctor(dName);
	}

	

}
