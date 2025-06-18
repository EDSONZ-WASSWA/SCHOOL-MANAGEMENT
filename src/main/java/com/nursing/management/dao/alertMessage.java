package com.nursing.management.dao;

import java.time.Duration;

import javafx.animation.PauseTransition;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;

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
		Image image = new Image("/images/RCSN.jpg");
		
		alert.setTitle("Information Message");
		alert.setContentText(Message);
		alert.setHeaderText(null);
		alert.show();
		
		  PauseTransition delay = new PauseTransition();
		    delay.setOnFinished(event -> alert.close()); // Close alert after delay
		    delay.play();
	}
	
	  public void showError(String message) {
	    	 Alert alert = new Alert(Alert.AlertType.ERROR);
	    	    alert.setTitle("Input Error");
	    	    alert.setHeaderText(null);
	    	    alert.setContentText(message);
	    	    alert.showAndWait();
	    }
}