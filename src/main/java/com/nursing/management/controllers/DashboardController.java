  /*
     * THE Students data method to add, edit and delete the students data
     * This is the overall method that connects to the graphs of the opening login form.
     * #Keep Coding, No one ever regrets working harder
     * @KATO ELVIS.dev/2637/477/NRD.
     * */
package com.nursing.management.controllers;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Optional;
import java.util.ResourceBundle;

import com.nursing.management.studentsBio;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.BarChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class DashboardController implements Initializable{
    @FXML
    private Button StudentsGrade_btn;
    
    @FXML
    private TextField mtn;
    
    @FXML
    private TextField airtel;

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
    private TableColumn<?, ?> Table_year2_sem11;

    @FXML
    private TableColumn<?, ?> Table_year2_sem1_p1;

    @FXML
    private TableColumn<?, ?> Table_year2_sem1_p11;

    @FXML
    private TableColumn<?, ?> Table_year2_sem1_p2;

    @FXML
    private TableColumn<?, ?> Table_year2_sem1_p21;

    @FXML
    private TableColumn<?, ?> Table_year2_sem1_p3;

    @FXML
    private TableColumn<?, ?> Table_year2_sem1_p31;

    @FXML
    private TableColumn<?, ?> Table_year2_sem1_p4;

    @FXML
    private TableColumn<?, ?> Table_year2_sem1_p41;

    @FXML
    private Button close_btn;

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
    private Button minimise_btn;

    @FXML
    private TextField register_Alevel;

    @FXML
    private DatePicker register_DOB;

    @FXML
    private TableColumn<studentsBio, String> register_DOB_col;

    @FXML
    private TableColumn<studentsBio, String> register_Fname_col;

    @FXML
    private AnchorPane register_Form;

    @FXML
    private TextField register_LName;

    @FXML
    private TableColumn<studentsBio, String> register_Lname_col;

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
    private TableColumn<studentsBio, Integer> register_contact_col;

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
    private TableColumn<studentsBio, String> register_gender_col;

    @FXML
    private TextField register_medical_conditions;

    @FXML
    private TextField register_middleName;

    @FXML
    private TableColumn<studentsBio, String> register_nsin_col;

    @FXML
    private TextField register_parish;

    @FXML
    private TextField register_physician_contact;

    @FXML
    private TextField register_relationship;

    @FXML
    private TextField register_religion;

    @FXML
    private TableColumn<studentsBio, String> register_religion_col;

    @FXML
    private TextField register_search;

    @FXML
    private TextArea register_specialNeeds;

    @FXML
    private TextField register_subcounty;

    @FXML
    private TableView<studentsBio> register_tableView;

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
    
    private Connection connect;
    private PreparedStatement prepare;
    private Statement statement;
    private ResultSet result;
    
  
    
    //STUDENTS REGISTER FORM.
        
    public ObservableList<studentsBio> addStudentsListData(){  //addStudentsListData: object to add students data
    	   ObservableList<studentsBio> listStudents = FXCollections.observableArrayList();
    	   
    	   String sql = "SELECT * FROM studentsBio";
    	   
    	 connect = database.connectDb();
    	   
		   return listStudents;
    }
    
    private ObservableList<studentsBio> addStudentsList;// Object to show lists on the table
    
    
    //Method to add data to the table view...
    public void addStudentsShowListData() {
    	addStudentsList = addStudentsListData();
    	register_nsin_col.setCellValueFactory(new PropertyValueFactory<>("NSIN"));
    	register_Fname_col.setCellValueFactory(new PropertyValueFactory<>("firstName"));
    	register_Lname_col.setCellValueFactory(new PropertyValueFactory<>("lastName"));
    	register_contact_col.setCellValueFactory(new PropertyValueFactory<>("MTN"));
    	register_gender_col.setCellValueFactory(new PropertyValueFactory<>("studentGender"));
    	register_DOB_col.setCellValueFactory(new PropertyValueFactory<>("DOB"));
    	register_religion_col.setCellValueFactory(new PropertyValueFactory<>("religion"));
    	
    	register_tableView.setItems(addStudentsList);
    }
    
    
    //Method to auto detect Selected Student
    
    public void addStudentsSelected(){
    	studentsBio studentsData =     	register_tableView.getSelectionModel().getSelectedItem();
    	int num =     	register_tableView.getSelectionModel().getSelectedIndex();
    	
    	if((num -1) < -1) {return;}
    	
    	register_fname.setText(studentsData.getFirstName());
    	register_middleName.setText(studentsData.getMiddleName());
    	register_LName.setText(studentsData.getLastName());
    	register_religion.setText(studentsData.getReligion());
    	register_DOB.setPromptText(String.valueOf(studentsData.getDOB()));  // Integer converted to String
    	register_NIN.setText(studentsData.getStudentNIN());
    	register_district.setText(studentsData.getStudentDistrict());
    	register_subcounty.setText(studentsData.getStudentSubcounty());
    	register_county.setText(studentsData.getStudentCounty());
    	register_email.setText(studentsData.getStudentEmail());
    	register_gender.setPromptText(studentsData.getStudentGender());
    	register_parish.setText(studentsData.getStudentParish());

    	// Guardian 1 information
    	register_gardianName1.setText(studentsData.getGuardian1Name());
    	register_gardian1_nin.setText(studentsData.getGuardian1NIN());
    	register_gardian1_parish.setText(studentsData.getGuardian1Parish());
    	register_gardian1_contact1.setText(String.valueOf(studentsData.getGuardian1Contact1()));  // Integer
    	register_gardian1_occupation.setText(studentsData.getGuardian1Occupation());
    	register_gardian1_district.setText(studentsData.getGuardian1District());
    	register_gardian1_subcounty.setText(studentsData.getGuardian1Subcounty());
    	register_gardian1_county.setText(studentsData.getGuardian1County());
    	register_gardian1_village.setText(studentsData.getGuardian1Village());
    	register_gardian1_email.setText(studentsData.getGuardian1Email());
    	register_gardian1_contact2.setText(String.valueOf(studentsData.getGuardian1Contact2()));  // Integer

    	// Guardian 2 information
    	register_gardian2_name.setText(studentsData.getGuardian2Name());
    	register_gardian2_nin.setText(studentsData.getGuardian2NIN());
    	register_gardian2_parish.setText(studentsData.getGuardian2Parish());
    	register_gardian2_contact1.setText(String.valueOf(studentsData.getGuardian2Contact1()));  // Integer
    	register_gardian2_occupation.setText(studentsData.getGuardian2Occupation());
    	register_gardian2_district.setText(studentsData.getGuardian2District());
    	register_gardian2_subcounty.setText(studentsData.getGuardian2Subcounty());
    	register_gardian2_county.setText(studentsData.getGuardian2County());
    	register_gardian2_village.setText(studentsData.getGuardian2Village());
    	register_gardian2_email.setText(studentsData.getGuardian2Email());
    	register_gardian2_contact2.setText(String.valueOf(studentsData.getGuardian2Contact2()));  // Integer

    	// Academic information
    	register_NSIN.setText(studentsData.getNSIN());
    	register_Alevel.setText(String.valueOf(studentsData.getAlevel()));  // Integer
    	register_Olevel.setText(String.valueOf(studentsData.getOlevel()));  // Integer
    	register_doneCourse.setText(studentsData.getPrevCourse());
    	register_year_done.setText(studentsData.getcourseYear());

    	// Emergency contact information
    	register_emergency_name.setText(studentsData.getEmergencyName());
    	register_emrgency_contact1.setText(String.valueOf(studentsData.getEmergencyContact1()));  // Integer
    	register_emrgency_contact2.setText(String.valueOf(studentsData.getEmergencyContact2()));  // Integer
    	register_relationship.setText(studentsData.getRelationship());

    	// Medical information
    	register_physician_contact.setText(String.valueOf(studentsData.getPhysicianContact()));  // Integer
    	register_medical_conditions.setText(studentsData.getMedConditions());
    	register_current_medication.setText(studentsData.getMedication());
    	register_specialNeeds.setText(studentsData.getSpecialNeeds());
    	register_emergencyProcedures.setText(studentsData.getEmergencyName());
    	airtel.setText(String.valueOf(studentsData.getAirtel()));
    	
    	// Integer
    	
    //video:2:37:13
    }
    
    
    
    
    
    private double x = 0;
    private double y = 0;
    
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
    
    //Switching between Forms
    public void switchForms(ActionEvent event) {
    	if(event.getSource() == home_btn) {
    		home_Form.setVisible(true);
    		register_Form.setVisible(false);
    		register_Form.setVisible(false);
    		grade_Form.setVisible(false);
    		home_btn.setStyle("-fx-background-color: linear-gradient(to bottom right,  #3eac5b, #30bc86)");
    		register_btn.setStyle("-fx-background-color:transparent");
    		studentsList_btn.setStyle("-fx-background-color:transparent");
    		StudentsGrade_btn.setStyle("-fx-background-color:transparent");
    		
    	}else if(event.getSource() == register_btn) {
    		home_Form.setVisible(false);
    		register_Form.setVisible(true);
    		register_Form.setVisible(true);
    		grade_Form.setVisible(false);
    		register_btn.setStyle("-fx-background-color: linear-gradient(to bottom right,  #3eac5b, #30bc86)");
    		home_btn.setStyle("-fx-background-color:transparent");
    		studentsList_btn.setStyle("-fx-background-color:transparent");
    		StudentsGrade_btn.setStyle("-fx-background-color:transparent");
    		//I want to make the data to auto update its self when clicked..
    		addStudentsShowListData();
    		
    		
    	}else if(event.getSource() == studentsList_btn) {
    		home_Form.setVisible(false);
    		register_Form.setVisible(false);
    		register_Form.setVisible(true);
    		grade_Form.setVisible(false);
    		studentsList_btn.setStyle("-fx-background-color: linear-gradient(to bottom right,  #3eac5b, #30bc86)");
    		home_btn.setStyle("-fx-background-color:transparent");
    		register_btn.setStyle("-fx-background-color:transparent");
    		StudentsGrade_btn.setStyle("-fx-background-color:transparent");
    	     //Auto update the Table when clicked...
    		addStudentsShowListData();
    		
    	}else if(event.getSource() == StudentsGrade_btn) {
    		home_Form.setVisible(false);
    		register_Form.setVisible(false);
    		register_Form.setVisible(false);
    		grade_Form.setVisible(true);
    		StudentsGrade_btn.setStyle("-fx-background-color: linear-gradient(to bottom right,  #3eac5b, #30bc86)");
    		home_btn.setStyle("-fx-background-color:transparent");
    		register_btn.setStyle("-fx-background-color:transparent");
    		studentsList_btn.setStyle("-fx-background-color:transparent");
    	}
    	
    }
    
    //The logout Method
    public void logout() {
    	try {
    		Alert alert = new Alert(AlertType.CONFIRMATION);
        	alert.setTitle("Confirmation Message");
        	alert.setHeaderText(null);
        	alert.setContentText("Are you sure about this?");
        	Optional<ButtonType> option = alert.showAndWait();
        	if(option.get().equals(ButtonType.OK)) {
        		
        		logout_btn.getScene().getWindow().hide();
        		Parent root = FXMLLoader.load(getClass().getResource("/fxml/login.fxml"));
        		Stage stage = new Stage();
        		Scene scene = new Scene(root);
        		
        		stage.initStyle(StageStyle.TRANSPARENT);
        		
        		
        		/*Making the alert message Transparent
        		 * while its being dragged both horizontal and vertical
        		 * @ Kato Elvis.....
        		 * EAT: 01:09:46- AM
        		 * Wed/27/2025
        		 * */
        		
        		root.setOnMousePressed((MouseEvent event) ->{
        			x = event.getSceneX();
        			y = event.getSceneY();
        		});
        		
        		root.setOnMouseDragged((MouseEvent event) ->{
        			stage.setX(event.getScreenX() - x);
        			stage.setY(event.getScreenY() - y);
        			
        			stage.setOpacity(.8);
        		});
        		
        		root.setOnMouseReleased((MouseEvent event) ->{
        			stage.setOpacity(1);
        		});
        		
        		stage.setScene(scene);
        		stage.show();
        	}
        	
		
		} catch (Exception e) {e.printStackTrace();}
		
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		//Placed here to load Immediately we add and open up the registration form..
		addStudentsShowListData();
		
	}
   


}


