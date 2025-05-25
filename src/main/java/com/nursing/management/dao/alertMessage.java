package com.nursing.management.dao;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
public class alertMessage{
	private Alert alert;
	
	public void errorMessage(String Message) {
		alert = new Alert(AlertType.ERROR);
		alert.setTitle("Error Message");
		alert.setHeaderText(null);
		alert.setContentText(Message);
	}
	public void successMessage(String Message) {
		alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Information Message");
		alert.setContentText(Message);
		alert.setHeaderText(Message);
	}
}