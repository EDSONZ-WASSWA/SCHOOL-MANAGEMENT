
package com.nursing.management.auth;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnector {
	public static Connection connectDb() {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/nursing_school";
			String user = "root";
			String password = "Daniella101";

			Connection connect = DriverManager.getConnection(url, user, password);
			System.out.println("Database connected successfully!");
			return connect;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
