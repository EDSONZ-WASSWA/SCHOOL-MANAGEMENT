
package com.nursing.management.dao;
import com.nursing.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.AnchorPane;

public class UserDAO implements Initializable {

    @FXML
    private Button close;
public void close() {
	System.exit(0);
}
    @FXML
    private Button loginBtn;

    @FXML
    private AnchorPane main_form;

    @FXML
    private PasswordField password;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}





//import com.nursing.management.models.User;
///* Retrieves User records from the database.
//- Retrieves User records from the database.
//- Converts rows into user objects for easy manipulation.
//- Follows DAO best practices for clean data handling.
// */
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//import com.nursing.management.auth.DatabaseConnector;
//import com.nursing.management.models.User;
//
//public class UserDAO{
//	public User getUserByUsername(String username){
//		String query ="SELECT * FROM user WHERE username=?";
//User user =null;
//try(Connection conn = DatabaseConnector.getConnection();
//		PreparedStatement stmt = conn.prepareStatement(query)){
//	stmt.setString(1,username);
//	ResultSet rs = stmt.executeQuery();
//	if(rs.next()) {
//		user = new User();
//		user.setid(rs.getInt("id"));
//		user.setUsername(rs.getString("username"));
//		user.setPassword(rs.getString("password"));
//	}
//	}catch(SQLException e) {
//		e.printStackTrace();
//	}
//	return user;
//}
//
//public boolean createUser(User user) {
//	String query ="INSERT INTO(username,Password) VALUES(?,?)";
//	try(Connection conn = DatabaseConnector.getConnection();
//			PreparedStatement stmt = conn.prepareStatement(query)){
//		stmt.setString(1, user.getUsername());
//		stmt.setString(2,user.getPassword());
//		return stmt.executeUpdate()>0;
//		
//	}catch(SQLException e) {
//		e.printStackTrace();
//		return false;
//	}
//}
//}
//
