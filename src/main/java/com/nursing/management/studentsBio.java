/**
@Author: KATO ELVIS
@BUILT: 28 May 2025
@TIME: 04:35:29
@YEAR: 2025

/**
 * 
 */
package com.nursing.management;

import java.sql.Date;

public class studentsBio {
    private String firstName;
    private String middleName;
    private String lastName;
    private String religion;
    private Date DOB;
    private String studentNIN;
    private String studentDistrict;
    private String studentSubcounty;
    private String studentCounty;
    private String studentParish;
    private String studentEmail;
    private String studentGender;
    //Guardians 1 Data
    private String guardian1Name;
    private String guardian1NIN;
    private String guardian1Contact1;
    private String guardian1Contact2;
    private String guardian1District;
    private String guardian1Subcounty;
    private String guardian1County;
    private String guardian1Parish;
    private String guardian1Village;
    private String guardian1Email;
    private String guardian1Occupation;
    //Guardian 2
    private String guardian2Name;
    private String guardian2NIN;
    private String guardian2Contact1;
    private String guardian2Contact2;
    private String guardian2District;
    private String guardian2Subcounty;
    private String guardian2County;
    private String guardian2Parish;
    private String guardian2Village;
    private String guardian2Email;
    private String guardian2Occupation;
    private String NSIN;
    private Integer Alevel;
    private Integer Olevel;
    private String prevCourse;
    private Integer courseYear;
    private String emergencyName;
    private String emergencyContact1;
    private String emergencyContact2;
    private String relationship;
    private String physicianContact;
    private String medConditions;
    private String medication;
    private String medProcedures;
    private String specialNeeds;
    private String studentContact1;
    private String studentContact2;

    //The constructor...
	public studentsBio(String firstName, String middleName, String lastName, String religion, Date DOB,
			String studentNIN, String studentDistrict, String studentSubcounty, String studentCounty,
			String studentParish, String studentGender, String studentEmail, String guardian1Name, String guardian1NIN,
			String guardian1Contact1, String guardian1Contact2, String guardian1District, String guardian1Subcounty,
			String guardian1County, String guardian1Parish, String guardian1Village, String guardian1Email,
			String guardian1Occupation, String guardian2Name, String guardian2NIN, String guardian2Contact1,
			String guardian2Contact2, String guardian2District, String guardian2Subcounty, String guardian2County,
			String guardian2Parish, String guardian2Village, String guardian2Email, String guardian2Occupation,
			String NSIN, Integer Alevel, Integer Olevel, String prevCourse, Integer courseYear, String emergencyName,
			String emergencyContact1, String emergencyContact2, String relationship, String physicianContact,
			String medConditions, String medication, String medProcedures, String specialNeeds, String studentContact1,
			String studentContact2) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.religion = religion;
		this.DOB = DOB;
		this.studentNIN = studentNIN;
		this.studentDistrict = studentDistrict;
		this.studentSubcounty = studentSubcounty;
		this.studentCounty = studentCounty;
		this.studentParish = studentParish;
		this.studentGender = studentGender;
		this.studentEmail = studentEmail;
		this.guardian1Name = guardian1Name;
		this.guardian1NIN = guardian1NIN;
		this.guardian1Contact1 = guardian1Contact1;
		this.guardian1Contact2 = guardian1Contact2;
		this.guardian1District = guardian1District;
		this.guardian1Subcounty = guardian1Subcounty;
		this.guardian1County = guardian1County;
		this.guardian1Parish = guardian1Parish;
		this.guardian1Village = guardian1Village;
		this.guardian1Email = guardian1Email;
		this.guardian1Occupation = guardian1Occupation;
		this.guardian2Name = guardian2Name;
		this.guardian2NIN = guardian2NIN;
		this.guardian2Contact1 = guardian2Contact1;
		this.guardian2Contact2 = guardian2Contact2;
		this.guardian2District = guardian2District;
		this.guardian2Subcounty = guardian2Subcounty;
		this.guardian2County = guardian2County;
		this.guardian2Parish = guardian2Parish;
		this.guardian2Village = guardian2Village;
		this.guardian2Email = guardian2Email;
		this.guardian2Occupation = guardian2Occupation;
		this.NSIN = NSIN;
		this.Alevel = Alevel;
		this.Olevel =Olevel;
		this.prevCourse = prevCourse;
		this.courseYear = courseYear;
		this.emergencyName = emergencyName;
		this.emergencyContact1 = emergencyContact1;
		this.emergencyContact2 = emergencyContact2;
		this.relationship = relationship;
		this.physicianContact = physicianContact;
		this.medConditions = medConditions;
		this.medication = medication;
		this.medProcedures = medProcedures;
		this.specialNeeds = specialNeeds;
		this.studentContact1 = studentContact1;
        this.studentContact2 = studentContact2;
	}

	
	
	//The getters 
	public String getFirstName() {
		return firstName;
	}

	public String getmiddleName() {
		return middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getReligion() {
		return religion;
	}

	public Date getDOB() {
		return DOB;
	}

	public String getstudentNIN() {
		return studentNIN;
	}

	public String getstudentDistrict() {
		return studentDistrict;
	}

	public String getstudentSubcounty() {
		return studentSubcounty;
	}

	public String getstudentCounty() {
		return studentCounty;
	}

	public String getstudentParish() {
		return studentParish;
	}
	
	public String getstudentEmail() {
		return studentEmail;
	}

	public String getStudentGender() {
		return studentGender;
	}


	public String getguardian1Name() {
		return guardian1Name;
	}

	public String getguardian1NIN() {
		return guardian1NIN;
	}

	public String getguardian1Contact1() {
		return guardian1Contact1;
	}

	public String getguardian1Contact2() {
		return guardian1Contact2;
	}

	public String getguardian1District() {
		return guardian1District;
	}

	public String getguardian1Subcounty() {
		return guardian1Subcounty;
	}

	public String getguardian1County() {
		return guardian1County;
	}

	public String getguardian1Parish() {
		return guardian1Parish;
	}

	public String getguardian1Village() {
		return guardian1Village;
	}

	public String getguardian1Email() {
		return guardian1Email;
	}

	public String getguardian1Occupation() {
		return guardian1Occupation;
	}

	public String getguardian2Name() {
		return guardian2Name;
	}

	public String getguardian2NIN() {
		return guardian2NIN;
	}

	public String getguardian2Contact1() {
		return guardian2Contact1;
	}

	public String getguardian2Contact2() {
		return guardian2Contact2;
	}

	public String getguardian2District() {
		return guardian2District;
	}

	public String getguardian2Subcounty() {
		return guardian2Subcounty;
	}

	public String getguardian2County() {
		return guardian2County;
	}

	public String getguardian2Parish() {
		return guardian2Parish;
	}

	public String getguardian2Village() {
		return guardian2Village;
	}

	public String getguardian2Email() {
		return guardian2Email;
	}

	public String getguardian2Occupation() {
		return guardian2Occupation;
	}

	public String getNSIN() {
		return NSIN;
	}

	public Integer getAlevel() {
		return Alevel;
	}

	public Integer getOlevel() {
		return Olevel;
	}

	public String getprevCourse() {
		return prevCourse;
	}

	public String getemergencyName() {
		return emergencyName;
	}

	public String getemergencyContact1() {
		return emergencyContact1;
	}

	public String getemergencyContact2() {
		return emergencyContact2;
	}

	public String getrelationship() {
		return relationship;
	}

	public String getphysicianContact() {
		return physicianContact;
	}

	public String getmedConditions() {
		return medConditions;
	}

	public String getmedication() {
		return medication;
	}

	public String getmedProcedures() {
		return medProcedures;
	}

	public String getspecialNeeds() {
		return specialNeeds;
	}

	public String getStudentContact1() {
		return studentContact1;
	}

	public String getstudentContact2() {
		return studentContact2;
	}
	
	public Integer getcourseYear() {
		return courseYear;
	}


//
//	public String getEmail() {
//		// TODO Auto-generated method stub
//		return Email();
//	}
    

	
	
    
    
    
    
    
    
    
    
    
}
