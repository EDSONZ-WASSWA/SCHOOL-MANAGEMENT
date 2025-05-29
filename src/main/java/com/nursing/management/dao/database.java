package com.nursing.management.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class database {
    
	public static Connection connectDb() {
		try {
			Class.forName("com.mysql.jdbc.driver"); //newer versions use com.mysql.cj.jdbc.Driver.
			
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/nursing_school");
			return connect;
		}catch (SQLException | ClassNotFoundException e){
			System.out.println("Database connection error");
		}
		return null;
	
	}
}
