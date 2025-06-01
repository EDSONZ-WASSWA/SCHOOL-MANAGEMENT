
package com.nursing.management.controllers;

public class LoginController {
       
}

package com.nursing.management.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class LoginController implements Initializable {

    @FXML
    private Button close;

    @FXML
    private Button loginBtn;

    @FXML
    private AnchorPane login_form;

    @FXML
    private PasswordField login_password;

    @FXML
    private Button login_registerAccount;

    @FXML
    private AnchorPane main_form;

    @FXML
    private TextField password;

    @FXML
    private Button register_btn;

    @FXML
    private PasswordField register_confirm_password;

    @FXML
    private AnchorPane register_form;

    @FXML
    private PasswordField register_password;

    @FXML
    private Button resetPwd_Btn;

    @FXML
    private AnchorPane reset_Password_form;

    @FXML
    private PasswordField reset_confirm_password;

    @FXML
    private PasswordField reset_password;

    @FXML
    private CheckBox showPassword;

    @FXML
    void close(ActionEvent event) {

    }

    @FXML
    void register(ActionEvent event) {

    }

    @FXML
    void showPassword(ActionEvent event) {

    }

    @FXML
    void switchForms(ActionEvent event) {

    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}

