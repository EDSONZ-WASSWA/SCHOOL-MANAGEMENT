
package com.nursing.management.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.BarChart;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class DashboardController implements Initializable{
    @FXML
    private Button StudentsGrade_btn;

    @FXML
    private TableColumn<?, ?> Table_name;

    @FXML
    private TableColumn<?, ?> Table_nsin;

    @FXML
    private TableColumn<?, ?> Table_year1_sem1;

    @FXML
    private TableColumn<?, ?> Table_year1_sem1_p1;

    @FXML
    private TableColumn<?, ?> Table_year1_sem1_p2;

    @FXML
    private TableColumn<?, ?> Table_year1_sem1_p3;

    @FXML
    private TableColumn<?, ?> Table_year1_sem1_p4;

    @FXML
    private TableColumn<?, ?> Table_year1_sem2;

    @FXML
    private TableColumn<?, ?> Table_year1_sem2_p1;

    @FXML
    private TableColumn<?, ?> Table_year1_sem2_p2;

    @FXML
    private TableColumn<?, ?> Table_year1_sem2_p3;

    @FXML
    private TableColumn<?, ?> Table_year1_sem2_p4;

    @FXML
    private TableColumn<?, ?> Table_year2_sem1;

    @FXML
    private TableColumn<?, ?> Table_year2_sem1_p1;

    @FXML
    private TableColumn<?, ?> Table_year2_sem1_p2;

    @FXML
    private TableColumn<?, ?> Table_year2_sem1_p3;

    @FXML
    private TableColumn<?, ?> Table_year2_sem1_p4;

    @FXML
    private ImageView close_btn;

    @FXML
    private TextField gradeForm_NAME;

    @FXML
    private TextField gradeForm_NSIN;

    @FXML
    private TableView<?> gradeTable;

    @FXML
    private Button grade_DelBtn;

    @FXML
    private AnchorPane grade_Form;

    @FXML
    private Button grade_addBtn;

    @FXML
    private Button grade_clearBtn;

    @FXML
    private TextField grade_search;

    @FXML
    private AnchorPane home_Form;

    @FXML
    private Button home_btn;

    @FXML
    private AreaChart<?, ?> home_female_chart;

    @FXML
    private Label home_female_total;

    @FXML
    private AreaChart<?, ?> home_male_chart;

    @FXML
    private Label home_male_total;

    @FXML
    private Label home_total;

    @FXML
    private BarChart<?, ?> home_total_chart;

    @FXML
    private Button logout_btn;

    @FXML
    private AnchorPane main_form;

    @FXML
    private ImageView minimise_btn;

    @FXML
    private TextField register_Alevel;

    @FXML
    private DatePicker register_DOB;

    @FXML
    private TableColumn<?, ?> register_DOB_col;

    @FXML
    private TableColumn<?, ?> register_Fname_col;

    @FXML
    private AnchorPane register_Form;

    @FXML
    private TextField register_LName;

    @FXML
    private TableColumn<?, ?> register_Lname_col;

    @FXML
    private TextField register_NIN;

    @FXML
    private TextField register_NSIN;

    @FXML
    private TextField register_Olevel;

    @FXML
    private Button register_add_btn;

    @FXML
    private Button register_btn;

    @FXML
    private Button register_clear_btn;

    @FXML
    private TextField register_contact;

    @FXML
    private TableColumn<?, ?> register_contact_col;

    @FXML
    private TextField register_county;

    @FXML
    private TextField register_current_medication;

    @FXML
    private Button register_delete_btn;

    @FXML
    private TextField register_district;

    @FXML
    private TextField register_doneCourse;

    @FXML
    private TextField register_email;

    @FXML
    private TextArea register_emergencyProcedures;

    @FXML
    private TextField register_emergency_name;

    @FXML
    private TextField register_emrgency_contact1;

    @FXML
    private TextField register_emrgency_contact2;

    @FXML
    private TextField register_fname;

    @FXML
    private AnchorPane register_form;

    @FXML
    private TextField register_gardian1_contact1;

    @FXML
    private TextField register_gardian1_contact2;

    @FXML
    private TextField register_gardian1_county;

    @FXML
    private TextField register_gardian1_district;

    @FXML
    private TextField register_gardian1_email;

    @FXML
    private TextField register_gardian1_nin;

    @FXML
    private TextField register_gardian1_occupation;

    @FXML
    private TextField register_gardian1_parish;

    @FXML
    private TextField register_gardian1_subcounty;

    @FXML
    private TextField register_gardian1_village;

    @FXML
    private TextField register_gardian2_contact1;

    @FXML
    private TextField register_gardian2_contact2;

    @FXML
    private TextField register_gardian2_county;

    @FXML
    private TextField register_gardian2_district;

    @FXML
    private TextField register_gardian2_email;

    @FXML
    private TextField register_gardian2_name;

    @FXML
    private TextField register_gardian2_nin;

    @FXML
    private TextField register_gardian2_occupation;

    @FXML
    private TextField register_gardian2_parish;

    @FXML
    private TextField register_gardian2_subcounty;

    @FXML
    private TextField register_gardian2_village;

    @FXML
    private TextField register_gardianName1;

    @FXML
    private ComboBox<?> register_gender;

    @FXML
    private TableColumn<?, ?> register_gender_col;

    @FXML
    private TextField register_medical_conditions;

    @FXML
    private TextField register_middleName;

    @FXML
    private TableColumn<?, ?> register_nsin_col;

    @FXML
    private TextField register_parish;

    @FXML
    private TextField register_physician_contact;

    @FXML
    private TextField register_relationship;

    @FXML
    private TextField register_religion;

    @FXML
    private TableColumn<?, ?> register_religion_col;

    @FXML
    private TextField register_search;

    @FXML
    private TextArea register_specialNeeds;

    @FXML
    private TextField register_subcounty;

    @FXML
    private TableView<?> register_tableView;

    @FXML
    private Button register_update_btn;

    @FXML
    private TextField register_year_done;

    @FXML
    private ImageView signOut_btn;

    @FXML
    private Button studentsList_btn;

    @FXML
    private TextField year1_sem1_p1;

    @FXML
    private TextField year1_sem1_p2;

    @FXML
    private TextField year1_sem1_p3;

    @FXML
    private TextField year1_sem1_p4;

    @FXML
    private TextField year1_sem2_p1;

    @FXML
    private TextField year1_sem2_p2;

    @FXML
    private TextField year1_sem2_p3;

    @FXML
    private TextField year1_sem2_p4;

    @FXML
    private TextField year2_sem2_p1;

    @FXML
    private TextField year2_sem2_p2;

    @FXML
    private TextField year2_sem2_p3;

    @FXML
    private TextField year2_sem2_p4;

    @FXML
    private TextField year2_sem_p1;

    @FXML
    private TextField year2_sem_p2;

    @FXML
    private TextField year2_sem_p3;

    @FXML
    private TextField year2_sem_p4;
    
    // The methods to implement
    
    //The close window method..
    public void close() {
    	System.exit(0);
    }
    
    //Minimize window method...
    public void minimise() {
    	Stage stage = (Stage)main_form.getScene().getWindow();
    	stage.setIconified(true);
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
   


}


