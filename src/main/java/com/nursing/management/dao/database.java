package com.nursing.management.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class database {

	public static Connection connectDb() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/nursing_school?useSSL=false";
			String user = "root";
			String pass = ""; // Or your actual password

			Connection connect = DriverManager.getConnection(url, user, pass);
			System.out.println("Database connected successfully!");
			return connect;

		} catch (ClassNotFoundException e) {
			System.err.println("JDBC Driver not found!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.err.println("Connection failed!");
			System.err.println("SQLState: " + e.getSQLState());
			System.err.println("Error Code: " + e.getErrorCode());
			System.err.println("Message: " + e.getMessage());
			e.printStackTrace();
		}
		return null;
	}
}
