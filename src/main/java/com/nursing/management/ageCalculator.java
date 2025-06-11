//package com.nursing.management;
//
//import java.time.Instant;
//import java.time.LocalDate;
//import java.time.Period;
//import java.time.ZoneId;
//
//public class ageCalculator {
////	
////	public void ageCalc() {
////		 LocalDate today = LocalDate.now();
////		    LocalDate BirthDate = LocalDate.of(0, 0, 0);
////		    int years = Period.between(BirthDate,today).getYears();
////	}
//	
//	
//	public Integer getAge() {
//	    if (DOB == null) {
//	        System.err.println("DOB is null for: " + this.getFirstName());
//	        return null;
//	    }
//	    
//	    try {
//	        // Debug: Print raw DOB value
//	        System.out.println("Calculating age for " + getFirstName() + 
//	                         " with DOB (raw): " + DOB);
//	        
//	        // Convert to Instant (debug each step)
//	        Instant instant = DOB.toInstant();
//	        System.out.println("Instant: " + instant);
//	        
//	        // Convert to LocalDate
//	        LocalDate birthDate = instant.atZone(ZoneId.systemDefault()).toLocalDate();
//	        System.out.println("Converted LocalDate: " + birthDate);
//	        
//	        // Get current date
//	        LocalDate now = LocalDate.now();
//	        System.out.println("Current date: " + now);
//	        
//	        // Calculate period
//	        Period period = Period.between(birthDate, now);
//	        System.out.println("Calculated period: " + period);
//	        
//	        return period.getYears();
//	    } catch (Exception e) {
//	        System.err.println("CRITICAL ERROR calculating age for " + getFirstName() + 
//	                          "\nDOB object type: " + DOB.getClass().getName() +
//	                          "\nDOB value: " + DOB +
//	                          "\nError: " + e.toString());
//	        e.printStackTrace();
//	        return null;
//	    }
//	}
//   
//}
