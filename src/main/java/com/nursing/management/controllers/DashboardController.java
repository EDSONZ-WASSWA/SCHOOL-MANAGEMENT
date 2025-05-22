<<<<<<< HEAD
=======
package com.nursing.management.controllers;
import java.awt.Button;//Fix: Replace java.awt.Button with javafx.scene.control.Button.
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class DashboardController{
	@FXML private GridPane dashboardGrid;
	@FXML private Button btnPersonalInfo;
	@FXML private Button btnNextOfKin;
	@FXML private Button btnAcademicInfo;
	@FXML private Button btnEmergencyContacts;
	@FXML private Button btnMedicalInfo;
	@FXML private Button btnOtherDetails;
	@FXML private Button btnLogout;
	@FXML

	private void Initialise() {
		setupButtonHoverEffects(btnPersonalInfo);
		setupButtonHoverEffects(btnNextOfKin);
		setupButtonHoverEffects(btnAcademicInfo);
		setupButtonHoverEffects(btnEmergencyContacts);
		setupButtonHoverEffects(btnMedicalInfo);
		setupButtonHoverEffects(btnOtherDetails);

	}
	private void setupButtonHoverEffects(Button button) {
		//button.setOnMouseEntered(e-> button.setStyle("fx-background-Color:#3a7bd5; -fx-text-fill:white;"));
		//button.setOnMouseExited(e-> button.setStyle("fx-background-color:#002dff; -fx-text-fill:black;"));
	}

	@FXML
	private void handlePersonalInfo() {
		loadStudentList("personal Information");
	}
	@FXML

	private void handleNextOfKin() {
		loadStudentList("Next Of Kin");
	}
	@FXML
  private void handleAcademicInfo() {
		loadStudentList("Academic Information");
	}
	@FXML
	private void handleEmergencyContacts() {
		loadStudentList("Emergency Contacts");

	}
	@FXML
	private void HandleMedicalInfo() {
		loadStudentList("Medical Information");
	}
	@FXML
	private void handleOtherDetails() {
		loadStudentList("Other Details");
	}

	private void loadStudentList(String category) {

	try {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/student_list.fxml"));
		Stage stage =(Stage)dashboardGrid.getScene().getWindow();
		stage.setScene(new Scene(loader.load()));

		StudentListController controller = loader.getController();
		controller.setCategory(category);
	}catch(IOException e) {
		e.printStackTrace();
	}

	}

//@FXML
//private void handleLogout() {
//	try {
//		FXMLLoader loader =new FXMLLoader(getClass().getResource("/fxml/login.fxml"));
//		Stage stage =(Stage)btnLogout.getScene().getWindow();
//		stage.setScene(new Scene(loader.load()));
//	}catch(IOException e) {
//		e.printStackTrace();
//	}
//}

}
>>>>>>> 3996300eba0445387bb39b4fdd5bf13704f6b05b
