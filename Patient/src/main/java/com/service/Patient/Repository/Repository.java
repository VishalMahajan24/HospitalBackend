package com.service.Patient.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.service.Patient.Entity.Patient;

public interface Repository extends JpaRepository<Patient, Integer>{

	
}
