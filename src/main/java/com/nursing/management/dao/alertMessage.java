package com.nursing.management.dao;

import javafx.scene.control.Alert;

public class alertMessage {
	private Alert alert;

	public void errorMessage(String Message) {
		alert = new Alert(Alert.AlertType.ERROR);
		alert.setTitle("Error Message");
		alert.setHeaderText(null);
		alert.setContentText(Message);
		alert.showAndWait();
	}

	public void successMessage(String Message) {
		alert = new Alert(Alert.AlertType.INFORMATION);
		alert.setTitle("Information Message");
		alert.setContentText(Message);
		alert.setHeaderText(null);
		alert.showAndWait();
	}
	
	  public void showError(String message) {
	    	 Alert alert = new Alert(Alert.AlertType.ERROR);
	    	    alert.setTitle("Input Error");
	    	    alert.setHeaderText(null);
	    	    alert.setContentText(message);
	    	    alert.showAndWait();
	    }
}