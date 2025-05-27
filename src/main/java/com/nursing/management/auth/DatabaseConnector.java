package com.nursing.management.auth;
import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnector{
	 public static Connection connectDb(){
		 try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql:localhost/logindata", "root","");
			return connect;
		 }catch(Exception e) {
			 e.printStackTrace();
			
		 }
		return null;
	 }
}