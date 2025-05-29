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
    private Integer guardian1Contact1;
    private Integer guardian1Contact2;
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
    private Integer guardian2Contact1;
    private Integer guardian2Contact2;
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
    private String courseYear;
    private String emergencyName;
    private Integer emergencyContact1;
    private Integer emergencyContact2;
    private String relationship;
    private Integer physicianContact;
    private String medConditions;
    private String medication;
    private String medProcedures;
    private String specialNeeds;
    private Integer MTN;
    private Integer Airtel;

    //The constructor...
	public studentsBio(String firstName, String middleName, String lastName, String religion, Date dOB,
			String studentNIN, String studentDistrict, String studentSubcounty, String studentCounty,
			String studentParish, String studentGender, String studentEamil, String guardian1Name, String guardian1nin,
			Integer guardian1Contact1, Integer guardian1Contact2, String guardian1District, String guardian1Subcounty,
			String guardian1County, String guardian1Parish, String guardian1Village, String guardian1Email,
			String guardian1Occupation, String guardian2Name, String guardian2nin, Integer guardian2Contact1,
			Integer guardian2Contact2, String guardian2District, String guardian2Subcounty, String guardian2County,
			String guardian2Parish, String guardian2Village, String guardian2Email, String guardian2Occupation,
			String nSIN, Integer alevel, Integer olevel, String prevCourse, String courseYear, String emergencyName,
			Integer emergencyContact1, Integer emergencyContact2, String relationship, Integer physicianContact,
			String medConditions, String medication, String medProcedures, String specialNeeds, Integer mTN,
			Integer airtel) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.religion = religion;
		DOB = dOB;
		this.studentNIN = studentNIN;
		this.studentDistrict = studentDistrict;
		this.studentSubcounty = studentSubcounty;
		this.studentCounty = studentCounty;
		this.studentParish = studentParish;
		this.studentGender = studentGender;
		this.studentEmail = studentEmail;
		this.guardian1Name = guardian1Name;
		guardian1NIN = guardian1nin;
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
		guardian2NIN = guardian2nin;
		this.guardian2Contact1 = guardian2Contact1;
		this.guardian2Contact2 = guardian2Contact2;
		this.guardian2District = guardian2District;
		this.guardian2Subcounty = guardian2Subcounty;
		this.guardian2County = guardian2County;
		this.guardian2Parish = guardian2Parish;
		this.guardian2Village = guardian2Village;
		this.guardian2Email = guardian2Email;
		this.guardian2Occupation = guardian2Occupation;
		NSIN = nSIN;
		Alevel = alevel;
		Olevel = olevel;
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
		MTN = mTN;
		Airtel = airtel;
	}

	
	
	//The getters 
	public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
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

	public String getStudentNIN() {
		return studentNIN;
	}

	public String getStudentDistrict() {
		return studentDistrict;
	}

	public String getStudentSubcounty() {
		return studentSubcounty;
	}

	public String getStudentCounty() {
		return studentCounty;
	}

	public String getStudentParish() {
		return studentParish;
	}

	public String getStudentGender() {
		return studentGender;
	}
	
	public String getStudentEmail() {
		return studentEmail;
	}

	public String getGuardian1Name() {
		return guardian1Name;
	}

	public String getGuardian1NIN() {
		return guardian1NIN;
	}

	public Integer getGuardian1Contact1() {
		return guardian1Contact1;
	}

	public Integer getGuardian1Contact2() {
		return guardian1Contact2;
	}

	public String getGuardian1District() {
		return guardian1District;
	}

	public String getGuardian1Subcounty() {
		return guardian1Subcounty;
	}

	public String getGuardian1County() {
		return guardian1County;
	}

	public String getGuardian1Parish() {
		return guardian1Parish;
	}

	public String getGuardian1Village() {
		return guardian1Village;
	}

	public String getGuardian1Email() {
		return guardian1Email;
	}

	public String getGuardian1Occupation() {
		return guardian1Occupation;
	}

	public String getGuardian2Name() {
		return guardian2Name;
	}

	public String getGuardian2NIN() {
		return guardian2NIN;
	}

	public Integer getGuardian2Contact1() {
		return guardian2Contact1;
	}

	public Integer getGuardian2Contact2() {
		return guardian2Contact2;
	}

	public String getGuardian2District() {
		return guardian2District;
	}

	public String getGuardian2Subcounty() {
		return guardian2Subcounty;
	}

	public String getGuardian2County() {
		return guardian2County;
	}

	public String getGuardian2Parish() {
		return guardian2Parish;
	}

	public String getGuardian2Village() {
		return guardian2Village;
	}

	public String getGuardian2Email() {
		return guardian2Email;
	}

	public String getGuardian2Occupation() {
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

	public String getPrevCourse() {
		return prevCourse;
	}

	public String getEmergencyName() {
		return emergencyName;
	}

	public Integer getEmergencyContact1() {
		return emergencyContact1;
	}

	public Integer getEmergencyContact2() {
		return emergencyContact2;
	}

	public String getRelationship() {
		return relationship;
	}

	public Integer getPhysicianContact() {
		return physicianContact;
	}

	public String getMedConditions() {
		return medConditions;
	}

	public String getMedication() {
		return medication;
	}

	public String getMedProcedures() {
		return medProcedures;
	}

	public String getSpecialNeeds() {
		return specialNeeds;
	}

	public Integer getMTN() {
		return MTN;
	}

	public Integer getAirtel() {
		return Airtel;
	}
	
	public String getcourseYear() {
		return courseYear;
	}


//
//	public String getEmail() {
//		// TODO Auto-generated method stub
//		return Email();
//	}
    

	
	
    
    
    
    
    
    
    
    
    
}
