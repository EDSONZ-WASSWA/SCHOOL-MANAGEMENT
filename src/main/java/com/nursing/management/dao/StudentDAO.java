//
//package com.nursing.management.dao;
//import java.sql.Connection;
//import java.sql.Date;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.List;
//
//import com.nursing.management.auth.DatabaseConnector;
//import com.nursing.management.models.Student;
///* Retrieves student records from the database.
//- Retrieves student records from the database.
//- Converts rows into Student objects for easy manipulation.
//- Follows DAO best practices for clean data handling.
// */
//public class StudentDAO {  
//public List <Student> getAllStudents(){
//	List<Student> students = new ArrayList<>();
//	String query = "SELECT * FROM students";
//	try(Connection conn = DatabaseConnector.getConnection();
//	Statement stmt = conn.createStatement();
//	ResultSet rs = stmt.executeQuery(query)){
//		while(rs.next()) {
//			Student student = new Student();
//			student.setStudentId(rs.getString("student_id"));
//			student.setFullName(rs.getString("full_name"));
//			student.setDob(rs.getDate("dob").toLocalDate());
//			student.setDistrict(rs.getString("district"));
//			student.setCounty(rs.getString("county"));
//			student.setSubcounty(rs.getString("subcounty"));
//			student.setVillage(rs.getString("village"));
//			student.setContacts(rs.getString("contacts"));
//			student.setNin(rs.getString("nin"));
//			students.add(student);
//		}
//	} catch(SQLException e) {
//		e.printStackTrace();
//	}
//	return students;
//}
//    
//
// public void addStudent(Student student){
//	 String query = "INSERT INTO students(full_name,dob,district,county,subcounty,village,contacts,nin)" + "VALUES(?,?,?,?,?,?,?,?)";
//	 try(Connection conn = DatabaseConnector.getConnection();
//	PreparedStatement stmt = conn.prepareStatement(query)){
//		 stmt.setString(1,student.getFullName());
//		 stmt.setDate(2, Date.valueOf(student.getDob()));
//		 stmt.setString(3,student.getDistrict());
//		 stmt.setString(4, student.getCounty());
//		 stmt.setString(5,student.getSubcounty());
//		 stmt.setString(6,student.getVillage());
//		 stmt.setString(7,student.getContacts());
//		 stmt.setString(8, student.getNin());
//		 stmt.executeUpdate();
//	 }catch(SQLException e) {
//		 e.printStackTrace();
//	 }
//	 
//	 
// }
// 
// public void updateStudent(Student student) {
//	 String query = "UPDATE students SET full_name=?,dob=?,district=?,county=?,subcounty=?"+ "village=?,contacts=?,nin=? WHERE student_id=?";
// try(Connection conn = DatabaseConnector.getConnection();
//		 PreparedStatement stmt = conn.prepareStatement(query)){
//	 stmt.setString(1,student.getFullName());
//	 stmt.setDate(2, Date.valueOf(student.getDob()));
//	 stmt.setString(3,student.getDistrict());
//	 stmt.setString(4, student.getCounty());
//	 stmt.setString(5,student.getSubcounty());
//	 stmt.setString(6,student.getVillage());
//	 stmt.setString(7,student.getContacts());
//	 stmt.setString(8, student.getNin());
//	 stmt.setString(9,student.getStudentId());
//	 stmt.executeUpdate();
// }catch(SQLException e) {
//	 e.printStackTrace();
// }
// 
// }
// public void deleteStudent(String studentId) {
//	 String query = "DELETE FROM students WHERE student_id=?";
//	 try(Connection  conn = DatabaseConnector.getConnection();
//			 PreparedStatement stmt = conn.prepareStatement(query)){
//stmt.setString(1,studentId);
//stmt.executeUpdate();
//	 }catch(SQLException e) {
//		 e.printStackTrace();
//	 }
//	 }
// }
// 
//
