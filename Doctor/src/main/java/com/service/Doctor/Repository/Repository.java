package com.service.Doctor.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.service.Doctor.Entity.Doctor;
import com.service.Doctor.Entity.Response;

public interface Repository extends JpaRepository<Doctor, Integer>{



	@Query("SELECT new com.service.Doctor.Entity.Response(r.doctorName,r.specialization,r.patientsAttended)"
			+ "FROM Doctor r WHERE r.doctorName=:n ")
	public Response getDoctor( @Param("n") String dName);
}
