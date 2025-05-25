
package com.nursing.management.dao;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
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
    private static PasswordField login_password;


    @FXML
    private CheckBox showPassword;
    @FXML
    private TextField password;
    
   // ==================================ALL LOGIN CONTENT HERE============================================================



    public  void login() {
    	alertMessage alert = new alertMessage();
    	try {
    	
			if(login_password.getText().isEmpty()) {
				alert.errorMessage("Enter Password space");
			}else {
				
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
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
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		showPassword();
	}

}

