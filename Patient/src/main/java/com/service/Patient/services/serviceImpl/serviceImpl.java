package com.service.Patient.services.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.Patient.Entity.Patient;
import com.service.Patient.Repository.Repository;
import com.service.Patient.services.services;

@Service
public class serviceImpl implements services {
	@Autowired
	private Repository repo;

	@Override
	public Patient addPatient(Patient po) {
		
		return repo.save(po);
	}

	@Override
	public Patient getPatient(int parseInt) {
		return repo.getReferenceById(parseInt);
	}


}
