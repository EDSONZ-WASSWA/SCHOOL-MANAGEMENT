//package com.nursing.management.auth;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//import org.mindrot.jbcrypt.BCrypt;
//
//public class AuthController {
//    public boolean authenticate(String username, String password) {
//        try (Connection conn = DatabaseConnector.getConnection()) {
//            PreparedStatement stmt = conn.prepareStatement(
//                "SELECT password FROM users WHERE username = ?");
//            stmt.setString(1, username);
//            ResultSet rs = stmt.executeQuery();
//            
//            if (rs.next() && BCrypt.checkpw(password, rs.getString("password"))) {
//                return true;
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return false;
//    }
//}