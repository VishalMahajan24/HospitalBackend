package com.service.Patient.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Patient {

	@Id
	private int patientId;
	private String patientName;
	private String visitedDoctor;
	 @DateTimeFormat (pattern = "dd-MM-yyyy")
	private String visitDate;
	private String prescribtion;
	private int patientAge;
	public Patient(int patientId, String patientName, String visitedDoctor, String visitDate, String prescribtion,
			int patientAge) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.visitedDoctor = visitedDoctor;
		this.visitDate = visitDate;
		this.prescribtion = prescribtion;
		this.patientAge = patientAge;
	}
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getVisitedDoctor() {
		return visitedDoctor;
	}
	public void setVisitedDoctor(String visitedDoctor) {
		this.visitedDoctor = visitedDoctor;
	}
	public String getVisitDate() {
		return visitDate;
	}
	public void setVisitDate(String visitDate) {
		this.visitDate = visitDate;
	}
	public String getPrescribtion() {
		return prescribtion;
	}
	public void setPrescribtion(String prescribtion) {
		this.prescribtion = prescribtion;
	}
	public int getPatientAge() {
		return patientAge;
	}
	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", visitedDoctor=" + visitedDoctor
				+ ", visitDate=" + visitDate + ", prescribtion=" + prescribtion + ", patientAge=" + patientAge + "]";
	}
	
	
}
