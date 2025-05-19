package com.nursing.management.models;

import java.time.LocalDate;

public class Student{
 private String studentId;
 private String fullName;
 private LocalDate dob;
 private String district;
 private String county;
 private String subcounty;
 private String village;
 private String contacts;
 private String nin;
 
 public Student() {
	 
 }
 
public Student(String studentId, String fullName, LocalDate dob, String district){
	this.studentId = studentId;
	this.fullName = fullName;
	this.dob = dob;
	this.district = district;
}
public  String getStudentId() {
	return studentId;
}
public void setStudentId(String studentId) {
	this.studentId = studentId;
}
public String getFullName() {
	return fullName;
}
public void setFullName(String fullName) {
	this.fullName = fullName;
}
public LocalDate getDob() {
	return dob;
}
public void setDob (LocalDate dob) {
	this.dob = dob;
}
public String getDistrict() {
	return district;
}
public void setDistrict(String district) {
	this.district = district;
}
public String getCounty() {
	return county;
}
public void setCounty(String county) {
	this.county = county;
}
public String getSubcounty() {
	return subcounty;
}
public void setSubcounty(String subcounty) {
	this.subcounty = subcounty;
}
public String getVillage() {
	return village;
}
public void setVillage(String village) {
	this.village = village;
}
public String getContacts() {
	return contacts;
}
public void setContacts(String contacts) {
	this.contacts = contacts;
}
public String getNin() {
	return nin;
}
public void setNin(String nin) {
	this.nin = nin;
}













}