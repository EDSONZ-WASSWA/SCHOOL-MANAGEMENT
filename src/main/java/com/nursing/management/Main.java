 package com.nursing.management;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
	private double x = 0;
	private double y = 0;

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("/fxml/login.fxml"));
		Scene scene = new Scene(root);
		stage.setTitle("LOGIN PAGE");
		Image image = new Image("/images/RCSN.jpg"); //Adding the Icon
		stage.getIcons().add(image);
		stage.centerOnScreen();
		
		root.setOnMousePressed((MouseEvent event) -> {
			x = event.getSceneX();
			y = event.getSceneY();
		});
		root.setOnMouseDragged((MouseEvent event) -> {
			stage.setX(event.getScreenX() - x);
			stage.setY(event.getScreenY() - y);
			stage.setOpacity(.8);
		});
		root.setOnMouseReleased((MouseEvent event) -> {
			stage.setOpacity(1);
		});
		stage.initStyle(StageStyle.TRANSPARENT);
		stage.setScene(scene);
		stage.show();
	}


	public static void main(String[] args) {
		System.setProperty("prism.marlinrasterizer", "false"); // This line removes the marlin warnings in the Terminal
		launch(args);
	}
}
