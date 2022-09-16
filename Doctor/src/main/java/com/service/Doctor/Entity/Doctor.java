package com.service.Doctor.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Doctor {

	@Id
	private int doctorId;
	private String doctorName;
	private int doctorAge;
	private String doctorGender;
	private String specialization;
	private int patientsAttended;
	public Doctor(int doctorId, String doctorName, int doctorAge, String doctorGender, String specialization,
			int patientsAttended) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.doctorAge = doctorAge;
		this.doctorGender = doctorGender;
		this.specialization = specialization;
		this.patientsAttended = patientsAttended;
	}
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public int getDoctorAge() {
		return doctorAge;
	}
	public void setDoctorAge(int doctorAge) {
		this.doctorAge = doctorAge;
	}
	public String getDoctorGender() {
		return doctorGender;
	}
	public void setDoctorGender(String doctorGender) {
		this.doctorGender = doctorGender;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public int getPatientsAttended() {
		return patientsAttended;
	}
	public void setPatientsAttended(int patientsAttended) {
		this.patientsAttended = patientsAttended;
	}
	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", doctorAge=" + doctorAge
				+ ", doctorGender=" + doctorGender + ", specialization=" + specialization + ", patientsAttended="
				+ patientsAttended + "]";
	}
	
	
	
}
