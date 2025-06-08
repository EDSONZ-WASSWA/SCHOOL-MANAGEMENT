//
//package com.nursing.management.dao;
//import  com.nursing.management.util.BCryptUtils;
//import java.net.URL;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.util.ResourceBundle;
//
//<<<<<<< HEAD
//import com.nursing.management.dao.alertMessage;
//=======
//import com.nursing.management.auth.DatabaseConnector;
//
//>>>>>>> b21581ac4d598c4ef24badb24b7ed0e035ff9676
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.fxml.FXMLLoader;
//import javafx.fxml.Initializable;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.CheckBox;
//import javafx.scene.control.PasswordField;
//import javafx.scene.control.TextField;
//import javafx.scene.layout.AnchorPane;
//import javafx.stage.Stage;
//
//public class UserDAO implements Initializable {
//
//    @FXML
//    private Button close;
//
//    @FXML
//    private Button backBtn;
//    @FXML
//    private Button loginBtn;
//    @FXML
//    private AnchorPane main_form;
//    @FXML
//    private AnchorPane login_form;
//    @FXML
//    private  PasswordField login_password;
//
//    @FXML
//    private Button login_registerAccount;
//
//    @FXML
//    private AnchorPane register_form;
//    @FXML
//    private AnchorPane reset_Password_form;
//    @FXML
//    private Button register_btn;
//    @FXML
//    private CheckBox showPassword;
//    @FXML
//    private TextField password_txt;
//    @FXML
//    private PasswordField register_confirm_password;
//
//    @FXML
//    private PasswordField register_password;
//    
//   // ==================================ALL LOGIN CONTENT HERE============================================================
//    
//    
//    public void close() {
//    	System.exit(0);
//    }
//    public void back() {
//    	login_form.setVisible(true);
//		register_form.setVisible(false);
//		reset_Password_form.setVisible(false);
//    }
////Data_Base_Tools
//    private Connection connect;
//    private PreparedStatement prepare;
//    private ResultSet result;
//    private Statement statement;
//    alertMessage alert = new alertMessage();
//    
//    public  void login() {
//
//    	String sql = "SELECT * FROM logindata WHERE password = ?";
//    	connect = database.connectDb();
//
////>>>>>>> b21581ac4d598c4ef24badb24b7ed0e035ff9676
//    	try {
//    		
//    	
//			if(login_password.getText().isEmpty()) {
//				alert.errorMessage("Enter Password in the space");
//				return;
//			}else {
//				String selectData = "SELECT password FROM logindata WHERE password =?";
//				connect = DatabaseConnector.connectDb();
//				try {
//					prepare = connect.prepareStatement(selectData);
//					prepare.setString(1,login_password.getText());
//					result =prepare.executeQuery();
//					if(result.next()) {
//						alert.successMessage("Succesfully Logged In");
//						System.out.println("gone to DashBoard");
//						Stage currentStage = (Stage) login_password.getScene().getWindow();
//						currentStage.close();
//						Parent root = FXMLLoader.load(getClass().getResource("/fxml/Dashboard.fxml"));
//						Stage stage = new Stage();
//						Scene scene = new Scene(root);
//						stage.setScene(scene);
//						stage.setTitle("Student Dashboard");
//						stage.show();
//					}
//				}catch(Exception e) {
//					e.printStackTrace();
//				}
//				
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//    }
//    @FXML
//    public void register() {
//    	//I have encrypted the password
//    	String plainPassword = register_password.getText();
//    	String confirmPassword = register_confirm_password.getText();
//    	if(register_password.getText().isEmpty()||register_confirm_password.getText().isEmpty()) {
//    		alert.errorMessage("Fill in the Blanks");
//    	}else if(register_password.getText()== register_confirm_password.getText()){
//    		alert.errorMessage("Passwords do not match");
//    	}else if(register_password.getText().length()< 4) {
//    		alert.errorMessage("Characters should more than 4 digits");
//    	}else {
//    		String checkPassword ="SELECT * FROM logindata WHERE password ='"+ register_password.getText()+"'";
//    		connect = database.connectDb();
//    		try {
//    			statement = connect.createStatement();
//    			result =  statement.executeQuery(checkPassword);
//    			if(result.next()) {
//    				alert.errorMessage(register_password.getText() + "is already taken");
//    			}else {
//    				String hashedPassword = BCryptUtils.hashPassword(plainPassword);
//    				String insertData = "INSERT INTO logindata"+ "(password)"+ "VALUE(?)";
//    				prepare = connect.prepareStatement(insertData);
//    				prepare.setString(1,register_password.getText());
//    				prepare.executeUpdate();
//    				System.out.println("Data Saved to sql");
//    				alert.successMessage("Registered Succesfully");
//    				clearRegistrationField();
//    				login_form.setVisible(true);
//    				register_form.setVisible(false);
//    				reset_Password_form.setVisible(false);
//    				
//    			}
//    		}catch(Exception e) {
//    			e.printStackTrace();
//    		}
//    	}
//    }
//    @FXML
//    public void clearRegistrationField() {
//    	register_password.setText("");
//    	register_confirm_password.setText("");
//    	
//    }
//    @FXML
//	public void showPassword() {
//    	//NEED TO WORK ON SHOWPASSWORD
// if(showPassword.isSelected()) {
//	 String currentPassword =login_password.getText();
//	 String passwordChars = login_password.getText();
//	 String current_Password = new String(passwordChars);
//	 password_txt.setText(currentPassword );
//	 password_txt.setVisible(true);
//	 login_password.setVisible(false);
// }else {
//	 String currentText = password_txt.getText();
//	 login_password.setText(currentText);
//	 password_txt.setVisible(false);
//	 login_password.setVisible(true);   	
//    }
//    } 
//   
//    @FXML
//	public void switchForms(ActionEvent event) {
//		if(event.getSource() == login_registerAccount) {
//			login_form.setVisible(false);
//			register_form.setVisible(true);
//			reset_Password_form.setVisible(false);
//		}else if(event.getSource()== register_btn) {
//			login_form.setVisible(true);
//			register_form.setVisible(false);
//			reset_Password_form.setVisible(false);
//		}
//		
//	}
//    
//	@Override
//	public void initialize(URL location, ResourceBundle resources) {
//	 //   password_txt.setVisible(true);
//	  //  login_password.setVisible(false);
//	    
//		 
//	}
//
//}
//
