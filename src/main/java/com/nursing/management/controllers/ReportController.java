package com.nursing.management.controllers;

import java.net.URL;
import com.nursing.management.dao.alertMessage;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.print.PageLayout;
import javafx.print.PageOrientation;
import javafx.print.Paper;
import javafx.print.Printer;
import javafx.print.PrinterJob;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.SnapshotParameters;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.TextField;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.transform.Scale;
import javafx.scene.transform.Transform;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.print.*;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class ReportController implements Initializable {

	@FXML
	private TextField age_printable;

	@FXML
	private TextField name_printable;

	@FXML
	private TextField nsin_printable;
    @FXML
    private Label printTxt;
    @FXML
    private Button printBtn;
	@FXML
	private AnchorPane printablePane;

	@FXML
	private TextField sex_printable;

	@FXML
	private TextField yr1_sem1_p1_printable;

	@FXML
	private TextField yr1_sem1_p2_printable;

	@FXML
	private TextField yr1_sem1_p3_printable;

	@FXML
	private TextField yr1_sem1_p4_printable;

	@FXML
	private TextField yr1_sem2_p1_printable;

	@FXML
	private TextField yr1_sem2_p2_printable;

	@FXML
	private TextField yr1_sem2_p3_printable;

	@FXML
	private TextField yr1_sem2_p4_printable;

	@FXML
	private TextField yr2_sem1_p1_printable;

	@FXML
	private TextField yr2_sem1_p2_printable;

	@FXML
	private TextField yr2_sem1_p3_printable;

	@FXML
	private TextField yr2_sem1_p4_printable;

	@FXML
	private TextField yr2_sem2_p1_printable;

	@FXML
	private TextField yr2_sem2_p2_printable;

	@FXML
	private TextField yr2_sem2_p3_printable;

	@FXML
	private TextField yr2_sem2_p4_printable;

    @FXML
    private StackPane Report_Page;

	public void showInformation(String name, String nsin,
			
			String yr1_sem1_p1, String yr1_sem1_p2, String yr1_sem1_p3, String yr1_sem1_p4, String yr1_sem2_p1,
			String yr1_sem2_p2, String yr1_sem2_p3, String yr1_sem2_p4,

			String yr2_sem1_p1, String yr2_sem1_p2, String yr2_sem1_p3, String yr2_sem1_p4, String yr2_sem2_p1,
			String yr2_sem2_p2, String yr2_sem2_p3, String yr2_sem2_p4) {
		name_printable.setText(name);
		nsin_printable.setText(nsin);
	
		yr1_sem1_p1_printable.setText(yr1_sem1_p1);
		yr1_sem1_p2_printable.setText(yr1_sem1_p2);
		yr1_sem1_p3_printable.setText(yr1_sem1_p3);
		yr1_sem1_p4_printable.setText(yr1_sem1_p4);

		yr1_sem2_p1_printable.setText(yr1_sem2_p1);
		yr1_sem2_p2_printable.setText(yr1_sem2_p2);
		yr1_sem2_p3_printable.setText(yr1_sem2_p3);
		yr1_sem2_p4_printable.setText(yr1_sem2_p4);

		yr2_sem1_p1_printable.setText(yr2_sem1_p1);
		yr2_sem1_p2_printable.setText(yr2_sem1_p2);
		yr2_sem1_p3_printable.setText(yr2_sem1_p3);
		yr2_sem1_p4_printable.setText(yr2_sem1_p4);

		yr2_sem2_p1_printable.setText(yr2_sem2_p1);
		yr2_sem2_p2_printable.setText(yr2_sem2_p2);
		yr2_sem2_p3_printable.setText(yr2_sem2_p3);
		yr2_sem2_p4_printable.setText(yr2_sem2_p4);
	}
	alertMessage alert = new alertMessage();
	@FXML
	private void handlePrintButton() {
	    printNode(Report_Page);
	}
	private void printNode(Node node) {
		Window window = node.getScene() != null? node.getScene().getWindow(): null;
		 if (node.getScene() == null) {
		        alert.errorMessage("Error: The node does not have an associated scene.");
		        return;
		    }


	    Printer printer = Printer.getDefaultPrinter();
	    if (printer == null) {
	        alert.errorMessage("No Printer Detected");
	        return;
	    }

	    PageLayout pageLayout = printer.createPageLayout(
	        Paper.A4,
	        PageOrientation.PORTRAIT,
	        Printer.MarginType.HARDWARE_MINIMUM
	    );

	    printBtn.setVisible(false);
	    printTxt.setVisible(false);

	    double printableWidth = pageLayout.getPrintableWidth();
	    double printableHeight = pageLayout.getPrintableHeight();

	    double nodeWidth = node.getBoundsInParent().getWidth();
	    double nodeHeight = node.getBoundsInParent().getHeight();
	    double scaleX = printableWidth / nodeWidth;
	    double scaleY = printableHeight / nodeHeight;
	    double scale = Math.min(scaleX, scaleY)* 0.95;//Adding "*5%" helps on the margin

	    Scale scaleTransform = new Scale(scale, scale);
	    node.getTransforms().add(scaleTransform);

	  
	    node.setTranslateY(20);

	    StackPane wrapper = new StackPane(node);
	    wrapper.setPadding(new Insets(0, 0, 0, 20)); // t,r,b,l
	    wrapper.setPrefSize(printableWidth, printableHeight);

	    if (node instanceof Region region) {
	        region.setPrefHeight(printableHeight);
	    }

	    String originalStyle = node.getStyle();
	    node.setStyle("-fx-font-size:10px;");

	    PrinterJob job = PrinterJob.createPrinterJob(printer);
	    if (job != null) {
	        job.getJobSettings().setPageLayout(pageLayout);
	        job.getJobSettings().setJobName("Student Report");

	        boolean proceed = window != null? job.showPrintDialog(window): job.showPrintDialog(null);
	     
	        if (proceed) {
	            boolean success = job.printPage(pageLayout, wrapper);

	            node.getTransforms().remove(scaleTransform);
	            node.setTranslateY(0); 
	            node.setStyle(originalStyle);
	            printBtn.setVisible(true);
	            printTxt.setVisible(true);

	            if (success) {
	                job.endJob();
	                alert.successMessage("Print Successful.\r\n Report Sent to The Printer");
	                
	            } else {
	                alert.errorMessage("Print Failed,\n Failed To Print Document,\r\n Try Again");
	            }
                if(window != null) {
	            ((Stage) window).close();
                }
	        } else {
	            node.getTransforms().remove(scaleTransform);
	            node.setTranslateY(0);
	            node.setStyle(originalStyle);
	        }
	    } else {
	        alert.errorMessage("Print Error\r\nFailed To Create Print Job");
	        node.getTransforms().remove(scaleTransform);
	        node.setTranslateY(0);
	        node.setStyle(originalStyle);
	    }

	    printBtn.setVisible(true);
	    printTxt.setVisible(true);
	    ((Stage) window).close();
	}



	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}

}
