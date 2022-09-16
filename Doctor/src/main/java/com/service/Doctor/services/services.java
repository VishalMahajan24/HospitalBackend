package com.service.Doctor.services;

import com.service.Doctor.Entity.Doctor;
import com.service.Doctor.Entity.Response;

public interface services {

	Doctor addDoctor(Doctor doc);

	Response getDoctor(String dName);

	

}
