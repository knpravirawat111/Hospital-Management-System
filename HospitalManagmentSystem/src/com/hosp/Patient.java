package com.hosp;

public class Patient {
//	Doctor doctor = new Doctor();
private String name;
private int age;
private Doctor doctor;
private String contact;

public Patient(String Name , int age,String contact) {
	this.name=Name;
	this.age=age;
	this.contact=contact;
}

public void assignDoctor(Doctor doctor) {
	this.doctor=doctor;
}
public String getName() {
	return name;
}

public int getAge() {
	return age;
}

public String getContactNumber() {
	return contact;
}


 public Doctor getDoctor() {
	 return doctor;
 }
 
  



	
}
