package com.nursing.management.controllers;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

import com.nursing.management.auth.DatabaseConnector;
import com.nursing.management.dao.alertMessage;
import com.nursing.management.util.BCryptUtil;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
public class LoginController implements Initializable {

	@FXML
	private Button close;

	@FXML
	private Button backBtn;
	@FXML
	private Button loginBtn;
	@FXML
	private AnchorPane main_form;
	@FXML
	private AnchorPane login_form;
	@FXML
	private PasswordField login_password;
	@FXML
	private PasswordField System_Id;
	@FXML
	private TextField login_password_txtField;
	  @FXML
	    private TextField reset_textField;
    @FXML
    private TextField register_password_txtField;
	@FXML
	private PasswordField new_Confirm_Password;
    @FXML
    private CheckBox showPasword2;
	@FXML
	private PasswordField new_Password;
	@FXML
	private Button login_registerAccount;

	@FXML
	private AnchorPane register_form;
	@FXML
	private AnchorPane reset_Password_form;

    @FXML
    private CheckBox show_confirmPassword;
	@FXML
	private Button reset_Password_Btn;
	@FXML
	private Hyperlink forgot_password_link;
	@FXML
	private Button register_btn;
	@FXML
	private CheckBox showPassword;
	@FXML
	private TextField password_txt;
	@FXML
	private PasswordField register_confirm_password;

	@FXML
	private PasswordField register_password;

	@FXML
	void close() {
		System.exit(0);
	}

	@FXML
	public void back() {
		login_form.setVisible(true);
		register_form.setVisible(false);
		reset_Password_form.setVisible(false);
	}

	@FXML
	public void toForgotPasswordPage() {
		reset_Password_form.setVisible(true);
		login_form.setVisible(false);
		register_form.setVisible(false);
	}

	@FXML

	alertMessage alert = new alertMessage();

	public void resetPassword() {

		// Declarations
		String NewPassword = new_Password.getText();
		String NewConfirmedPassword = new_Confirm_Password.getText();
		String SystemId = System_Id.getText();

		if (SystemId.isEmpty() || NewPassword.isEmpty() || NewConfirmedPassword.isEmpty()) {
			alert.errorMessage("Fill All The Blank Fields Please!");
			return;
		} else if (!NewPassword.equals(NewConfirmedPassword) || !SystemId.equals("EDSON")) {
			alert.errorMessage("Passwords Don't Match or Incorrect System_ID");
			clearResetFields();
			return;
		} else {

			try {
				connect = DatabaseConnector.connectDb();
				String updatePassword = "UPDATE logindata SET password =?";
				prepare = connect.prepareStatement(updatePassword);
				prepare.setString(1, NewPassword);
				prepare.execute();
				clearResetFields();
				alert.successMessage("Password Reset Succesfull!!!!");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		back();
	}
	@FXML
	public void clearResetFields() {
		new_Password.setText("");
		System_Id.setText("");
		new_Confirm_Password.setText("");
	}

	@FXML
	public void login() {
	
		try {

			if (login_password.getText().isEmpty()) {
				alert.errorMessage("Enter Password in the space");
				return;
			} else {
				String selectData = "SELECT password FROM logindata WHERE password =?";
				connect = DatabaseConnector.connectDb();
				try {
					prepare = connect.prepareStatement(selectData);
					prepare.setString(1, login_password.getText());
					result = prepare.executeQuery();
					if (result.next()) {
						alert.successMessage("****Welcome****");
						System.out.println("gone to DashBoard");
						Stage currentStage = (Stage) login_password.getScene().getWindow();
						currentStage.close();
						Parent root = FXMLLoader.load(getClass().getResource("/fxml/Dashboard.fxml"));
						Stage stage = new Stage();
						Scene scene = new Scene(root);
						stage.setScene(scene);
						stage.setTitle("Student Dashboard");
						stage.setFullScreen(true);
						stage.show();
					} else {
						alert.errorMessage("Incorrect Password");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// database tools
	private Connection connect;
	private PreparedStatement prepare;
	private Statement statement;
	private ResultSet result;

	@FXML
	public void register() {
		// I have encrypted the password
		String plainPassword = register_password.getText();
		String confirmPassword = register_confirm_password.getText();
		if (plainPassword.isEmpty() ||confirmPassword.isEmpty()) {
			alert.errorMessage("Fill All The Blank Fields");
		} else if (!plainPassword.equals(confirmPassword)){
			alert.errorMessage("Passwords do not match");
			clearRegistrationField();
		} else if (plainPassword.length() < 4) {
			alert.errorMessage("Characters should be more than 4 digits");
		} else {
			String checkPassword = "SELECT * FROM logindata WHERE password ='" + register_password.getText() + "'";
			connect = DatabaseConnector.connectDb();
			try {
				statement = connect.createStatement();
				result = statement.executeQuery(checkPassword);
				boolean isTableEmpty = true;
				if (result.next()) {
					int count = result.getInt(1);
					System.out.println("DEBUG: Row count in table = " + count);
					 isTableEmpty = (count == 0);
					    System.out.println("DEBUG: isTableEmpty = " + isTableEmpty);
				} 
				if(isTableEmpty) {
					String hashedPassword = BCryptUtil.hashPassword(plainPassword);
					String insertData = "INSERT INTO logindata" + "(password)" + "VALUE(?)";
					prepare = connect.prepareStatement(insertData);
					prepare.setString(1, register_password.getText());
					prepare.executeUpdate();
					System.out.println("Data Saved to sql");
					alert.successMessage("Registered Succesfully");
					clearRegistrationField();
					login_form.setVisible(true);
					register_form.setVisible(false);
					reset_Password_form.setVisible(false);

				}else {
					alert.errorMessage("ONLY ONE USER CAN REGISTER FOR A MOMENT");
					clearRegistrationField();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	@FXML
	public void clearRegistrationField() {
		register_password.setText("");
		register_confirm_password.setText("");

	}
//	***************	  WORK ON SHOWPASSWORD*****************************

	@FXML
	public void showPassword() {
	
		String textBoxContent = login_password_txtField.getText();
		String PasswordField = login_password.getText();
		if (showPassword.isSelected()) {
		login_password_txtField.setText(PasswordField);
		login_password_txtField.setVisible(true);
		login_password.setVisible(false);
		} else {
			login_password.setText(textBoxContent);
			login_password_txtField.setVisible(false);
			login_password.setVisible(true);
		}
	}

	@FXML
	public void switchForms(ActionEvent event) {
		if (event.getSource() == login_registerAccount) {
			login_form.setVisible(false);
			register_form.setVisible(true);
			reset_Password_form.setVisible(false);
		} else if (event.getSource() == register_btn) {
			login_form.setVisible(true);
			register_form.setVisible(false);
			reset_Password_form.setVisible(false);
		}

	}
	public void showPassword1() {
		String textContent = register_password_txtField.getText();
		String RegisterPassword = register_confirm_password.getText();
		if(show_confirmPassword.isSelected()) {
			register_password_txtField.setText(RegisterPassword);
			register_password_txtField.setVisible(true);
			register_confirm_password.setVisible(false);
		}else {
			register_confirm_password.setText(textContent);
			register_password_txtField.setVisible(false);
			register_confirm_password.setVisible(true);
		}
	}
	public void showPassword2() {
		String resetText = reset_textField.getText();
		String resetPassword = new_Confirm_Password.getText();
		if(showPasword2.isSelected()) {
			reset_textField.setText(resetPassword);
			reset_textField.setVisible(true);
			new_Confirm_Password.setVisible(false);
		}else {
			new_Confirm_Password.setText(resetText);
			reset_textField.setVisible(false);
			new_Confirm_Password.setVisible(true);	
		}
		
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

}
