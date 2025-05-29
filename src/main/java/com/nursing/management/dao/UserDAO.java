
package com.nursing.management.dao;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

import com.nursing.management.dao.alertMessage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
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
    private AnchorPane login_form;
    @FXML
    private static PasswordField login_password;

    @FXML
    private Button login_registerAccount;

    @FXML
    private AnchorPane register_form;
    @FXML
    private AnchorPane reset_Password_form;
    @FXML
    private Button register_btn;
    @FXML
    private CheckBox showPassword;
    @FXML
    private TextField password;
    @FXML
    private PasswordField register_confirm_password;

    @FXML
    private PasswordField register_password;
    
   // ==================================ALL LOGIN CONTENT HERE============================================================
//Data_Base_Tools
    private Connection connect;
    private PreparedStatement prepare;
    private ResultSet result;
    private Statement statement;
    alertMessage alert = new alertMessage();
    
    public  void login() {
    	String sql = "SELECT * FROM logindata WHERE password = ?";
    	connect = database.connectDb();
    	try {
    		
    	
			if(login_password.getText().isEmpty()) {
				alert.errorMessage("Enter Password in the space");
			}else {
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    @FXML
    public void register() {
    	if(register_password.getText().isEmpty()||register_confirm_password.getText().isEmpty()) {
    		alert.errorMessage("Fill in the Blanks");
    	}else if(register_password.getText() == register_confirm_password.getText()) {
    		alert.errorMessage("Passwords do not match");
    	}else if(register_password.getText().length()< 8) {
    		alert.errorMessage("Characters should more than 8 digits");
    	}else {
    		String checkPassword ="SELECT * FROM logindata WHERE password ='"+ register_password.getText()+"'";
    		connect = database.connectDb();
    		try {
    			statement = connect.createStatement();
    			result = statement.executeQuery(checkPassword);
    			if(result.next()) {
    				alert.errorMessage(register_password.getText() + "is already taken");
    			}else {
    				String insertData = "INSERT INTO logindata"+ "(password)"+ "VALUE(?)";
    				prepare = connect.prepareStatement(insertData);
    				prepare.setString(1,register_password.getText());
    				prepare.executeUpdate();
    				alert.successMessage("Registered Succesfully");
    				clearRegistrationField();
    				login_form.setVisible(true);
    				register_form.setVisible(false);
    				
    			}
    		}catch(Exception e) {
    			e.printStackTrace();
    		}
    	}
    }
    @FXML
    public void clearRegistrationField() {
    	register_password.setText("");
    	 register_confirm_password.setText("");
    	
    }
    @FXML
	public void showPassword() {
 if(showPassword.isSelected()) {
	 login_password.setText( password.getText());
	 login_password.setVisible(false);
	 password.setVisible(true);
	}else {
	     login_password.setText( password.getText());
		 login_password.setVisible(true);
		 password.setVisible(false);	
	}

    	
    }
    @FXML
	public void switchForms(ActionEvent event) {
		if(event.getSource() == login_registerAccount) {
			login_form.setVisible(false);
			register_form.setVisible(true);
			reset_Password_form.setVisible(false);
		}else if(event.getSource()== register_btn) {
			login_form.setVisible(true);
			register_form.setVisible(false);
			reset_Password_form.setVisible(false);
		}
		
	}
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	
	}

}

