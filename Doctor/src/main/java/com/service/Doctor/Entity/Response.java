package com.service.Doctor.Entity;



public class Response {

	private String doctorName;
	private String specialization;
	private int patientsAttended;
	public Response(String doctorName, String specialization, int patientsAttended) {
		super();
		this.doctorName = doctorName;
		this.specialization = specialization;
		this.patientsAttended = patientsAttended;
	}
	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
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
		return "Response [doctorName=" + doctorName + ", specialization=" + specialization + ", patientsAttended="
				+ patientsAttended + "]";
	}
	
}
