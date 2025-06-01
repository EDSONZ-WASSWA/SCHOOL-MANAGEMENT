package com.nursing.management.controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class database {
    
    public static Connection connectDb() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost/nursing_school";
            String user = "root";
            String pass = ""; // Please enter your password of MYsql  server.
            
            Connection connect = DriverManager.getConnection(url, user, pass);
            System.out.println("Database connected successfully!");
            System.out.println("Loading data. Please wait...");
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
