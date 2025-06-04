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
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

import com.nursing.management.studentsBio;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
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
import javafx.scene.control.DateCell;
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
<<<<<<< HEAD
    private TableColumn<studentsBio, String> register_religion_col;

    @FXML
=======
>>>>>>> c43d67576adfc538b78ba08c149407e52d3e6628
    private TextField register_search;

    @FXML
    private TextArea register_specialNeeds;

    @FXML
    private TextField register_subcounty;

    @FXML
    private TableView<studentsBio> register_tableView;
<<<<<<< HEAD
=======

    @FXML
    private TableColumn<studentsBio, String> register_religion_col;
    
    @FXML
    private TableColumn<studentsBio, String> register_nsin_col;
    @FXML
    private TableColumn<studentsBio, String> register_gender_col;

    @FXML
    private TableColumn<studentsBio, Integer> register_contact_col;

    @FXML
    private TableColumn<studentsBio, String> register_DOB_col;

    @FXML
    private TableColumn<studentsBio, String> register_Fname_col;
    
    @FXML
    private TableColumn<studentsBio, String> register_Lname_col;


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
    private TextField register_student_contact1;

    @FXML
    private TextField register_student_contact2;

    @FXML
    private TextField year2_sem_p3;

    @FXML
    private TextField year2_sem_p4;
    
    @FXML
    private AnchorPane details_Form;
    

    @FXML
    private TableColumn<studentsBio, String> details_DOB_col;

    @FXML
    private TableColumn<studentsBio, String> details_Fname_col;

    @FXML
    private TableColumn<studentsBio, String> details_Lname_col;

    @FXML
    private TableColumn<studentsBio, Integer> details_contact_col;

    @FXML
    private TableColumn<studentsBio, String> details_gender_col;

    @FXML
    private TableColumn<studentsBio, String> details_nsin_col;

    @FXML
    private TableColumn<studentsBio, String> details_religion_col;

    @FXML
    private TableView<studentsBio> details_tableView;
    
    private Connection connect;
    private PreparedStatement prepare;
    private Statement statement;
    private ResultSet result;
    
    // # Prompt Method for Gender
     private String [] genderList = {"Female","Male"};
     public void addGender() {
    	 List<String> genderL = new ArrayList<>();
    	 for(String data: genderList) {
    		 genderL.add(data);
    	 }
    	 ObservableList OBlist = FXCollections.observableArrayList(genderL);
    	 register_gender.setItems(OBlist);
     }
    
    //STUDENTS REGISTER FORM.
        
    public ObservableList<studentsBio> addStudentsListData(){  //addStudentsListData: object to add students data
    	   ObservableList<studentsBio> listStudents = FXCollections.observableArrayList();
    	   
    	   String sql = "SELECT * FROM studentsbio";
    	   connect = database.connectDb();
    	 
    	 try {
    		 studentsBio studentsData;
			prepare = connect.prepareStatement(sql);
			result = prepare.executeQuery();
			
			while(result.next()) {
				studentsData = new studentsBio(result.getString("firstName")
						,result.getString("middleName")
						, result.getString("lastName")
						, result.getString("religion")
						, result.getDate("DOB")
						, result.getString("studentNIN")
						, result.getString("studentDistrict")
						, result.getString("studentSubcounty")
						, result.getString("studentCounty")
						, result.getString("studentParish")
						, result.getString("studentEmail")
						, result.getString("studentGender")
						, result.getString("guardian1Name")
						, result.getString("guardian1NIN")
						, result.getString("guardian1Contact1")
						, result.getString("guardian1Contact2")
						, result.getString("guardian1District")
						, result.getString("guardian1Subcounty")
						, result.getString("guardian1County")
						, result.getString("guardian1Parish")
						, result.getString("guardian1Village")
						, result.getString("guardian1Email")
						, result.getString("guardian1Occupation")
						, result.getString("guardian2Name")
						, result.getString("guardian2NIN")
						, result.getString("guardian2Contact1")
						, result.getString("guardian2Contact2")
						, result.getString("guardian2District")
						, result.getString("guardian2Subcounty")
						, result.getString("guardian2County")
						, result.getString("guardian2Parish")
						, result.getString("guardian2Village")
						, result.getString("guardian2Email")
						, result.getString("guardian2Occupation")
						, result.getString("NSIN")
						, result.getInt("Alevel")
						, result.getInt("Olevel")
						, result.getString("prevCourse")
						, result.getInt("courseYear")
						, result.getString("emergencyName")
						, result.getString("emergencyContact1")
						, result.getString("emergencyContact2")
						, result.getString("relationship")
						, result.getString("physicianContact")
						, result.getString("medConditions")
						, result.getString("medication")
						, result.getString("medProcedures")
						, result.getString("specialNeeds")
						, result.getString("studentContact1")
						, result.getString("studentContact2"));
				
				listStudents.add(studentsData);
						
			}
		} catch (SQLException e) {e.printStackTrace();}
		     return listStudents;
    }
    
    
    
    private ObservableList<studentsBio> addStudentsList;// Object to show lists on the table
    //Method to add data to the table view...
    public void addStudentsShowListData() {
    	addStudentsList = addStudentsListData();
    	register_nsin_col.setCellValueFactory(new PropertyValueFactory<>("NSIN"));
    	register_Fname_col.setCellValueFactory(new PropertyValueFactory<>("FirstName"));
    	register_Lname_col.setCellValueFactory(new PropertyValueFactory<>("LastName"));
    	register_contact_col.setCellValueFactory(new PropertyValueFactory<>("StudentContact1"));
    	register_DOB_col.setCellValueFactory(new PropertyValueFactory<>("DOB"));
    	register_gender_col.setCellValueFactory(new PropertyValueFactory<>("StudentGender"));
    	register_religion_col.setCellValueFactory(new PropertyValueFactory<>("Religion"));
    	
    	register_tableView.setItems(addStudentsList);
    	
    }
    
    //Method to add data to details View.
    public void addToListView() {
    	addStudentsList = addStudentsListData();
        details_nsin_col.setCellValueFactory(new PropertyValueFactory<>("NSIN"));
        details_Fname_col.setCellValueFactory(new PropertyValueFactory<>("FirstName"));
        details_Lname_col.setCellValueFactory(new PropertyValueFactory<>("LastName"));
        details_contact_col.setCellValueFactory(new PropertyValueFactory<>("StudentContact1"));
        details_DOB_col.setCellValueFactory(new PropertyValueFactory<>("DOB"));
        details_gender_col.setCellValueFactory(new PropertyValueFactory<>("StudentGender"));
    	details_religion_col.setCellValueFactory(new PropertyValueFactory<>("Religion"));
    	
    	details_tableView.setItems(addStudentsList);
    	
        
    }
    
    
    //Method to auto detect Selected Student
    public void addStudentsSelected(){
    	studentsBio studentsData =     	register_tableView.getSelectionModel().getSelectedItem();
    	int num = register_tableView.getSelectionModel().getSelectedIndex();
    	
    	if((num -1) < -1) {return;}
    	register_fname.setText(studentsData.getFirstName());
    	register_middleName.setText(studentsData.getmiddleName());
    	register_LName.setText(studentsData.getLastName());
    	register_religion.setText(studentsData.getReligion());
    	register_DOB.setValue(LocalDate.parse(String.valueOf(studentsData.getDOB())));  // Date converted to String
    	register_NIN.setText(studentsData.getstudentNIN());
    	register_district.setText(studentsData.getstudentNIN());
    	register_subcounty.setText(studentsData.getstudentSubcounty());
    	register_county.setText(studentsData.getstudentCounty());
    	register_gender.setPromptText(studentsData.getStudentGender());
    	register_email.setText(studentsData.getstudentEmail());
    	register_parish.setText(studentsData.getstudentParish());
    	// Guardian 1 information
    	register_gardianName1.setText(studentsData.getguardian1Name());
    	register_gardian1_nin.setText(studentsData.getguardian1NIN());
    	register_gardian1_parish.setText(studentsData.getguardian1Parish());
    	register_gardian1_contact1.setText(String.valueOf(studentsData.getguardian1Contact1()));  // Integer
    	register_gardian1_occupation.setText(studentsData.getguardian1Occupation());
    	register_gardian1_district.setText(studentsData.getguardian1District());
    	register_gardian1_subcounty.setText(studentsData.getguardian1Subcounty());
    	register_gardian1_county.setText(studentsData.getguardian1County());
    	register_gardian1_village.setText(studentsData.getguardian1Village());
    	register_gardian1_email.setText(studentsData.getguardian1Email());
    	register_gardian1_contact2.setText(String.valueOf(studentsData.getguardian1Contact2()));  // Integer
    	// Guardian 2 information
    	register_gardian2_name.setText(studentsData.getguardian2Name());
    	register_gardian2_nin.setText(studentsData.getguardian2NIN());
    	register_gardian2_parish.setText(studentsData.getguardian2Parish());
    	register_gardian2_contact1.setText(String.valueOf(studentsData.getguardian2Contact1()));  // Integer
    	register_gardian2_occupation.setText(studentsData.getguardian2Occupation());
    	register_gardian2_district.setText(studentsData.getguardian2District());
    	register_gardian2_subcounty.setText(studentsData.getguardian2Subcounty());
    	register_gardian2_county.setText(studentsData.getguardian2County());
    	register_gardian2_village.setText(studentsData.getguardian2Village());
    	register_gardian2_email.setText(studentsData.getguardian2Email());
    	register_gardian2_contact2.setText(String.valueOf(studentsData.getguardian2Contact2()));  // Integer
    	// Academic information
    	register_NSIN.setText(studentsData.getNSIN());
    	register_Alevel.setText(String.valueOf(studentsData.getAlevel()));  // Integer
    	register_Olevel.setText(String.valueOf(studentsData.getOlevel()));  // Integer
    	register_doneCourse.setText(studentsData.getprevCourse());
    	register_year_done.setText(String.valueOf(studentsData.getcourseYear()));
    	// Emergency contact information
    	register_emergency_name.setText(studentsData.getemergencyName());
    	register_emrgency_contact1.setText(String.valueOf(studentsData.getemergencyContact1()));  // Integer
    	register_emrgency_contact2.setText(String.valueOf(studentsData.getemergencyContact2()));  // Integer
    	register_relationship.setText(studentsData.getrelationship());
    	// Medical information
    	register_emergencyProcedures.setText(studentsData.getmedProcedures());
    	register_physician_contact.setText(String.valueOf(studentsData.getphysicianContact()));  // Integer
    	register_medical_conditions.setText(studentsData.getmedConditions());
    	register_current_medication.setText(studentsData.getmedication());
    	register_specialNeeds.setText(studentsData.getspecialNeeds());
    	register_student_contact1.setText(String.valueOf(studentsData.getStudentContact1()));
    	register_student_contact2.setText(String.valueOf(studentsData.getstudentContact2()));
    	
    	// Integer
    	
    //video:2:37:13
    }
    //-------------------------------------------------------------------------------------------------------------
    //java.sql.Date DOB = java.sql.Date.valueOf(register_DOB.getValue());
    // Add students Method. this is by clicking the add 
    public void addStudents() { 
    	String insertData = "INSERT INTO studentsbio (firstName, middleName, lastName, religion, DOB, studentNIN, studentDistrict, studentSubcounty, studentCounty, studentParish, studentEmail, studentGender,  guardian1Name, guardian1NIN, guardian1Contact1, guardian1Contact2, guardian1District, guardian1Subcounty, guardian1County, guardian1Parish, guardian1Village, guardian1Email, guardian1Occupation, guardian2Name, guardian2NIN, guardian2Contact1, guardian2Contact2, guardian2District, guardian2Subcounty, guardian2County, guardian2Parish, guardian2Village, guardian2Email, guardian2Occupation, NSIN, Alevel, Olevel, prevCourse, courseYear, emergencyName, emergencyContact1, emergencyContact2, relationship, physicianContact, medConditions, medication, medProcedures, specialNeeds, studentContact1, studentContact2)  VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
    			+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    	           connect = database.connectDb();
    	    try {
    	    	Alert alert;
    	    	
    	    	if(register_fname.getText().isEmpty() ||register_LName.getText().isEmpty()|| 
    	    		    register_NSIN.getText().isEmpty() ||
    	    		    register_Olevel.getText().isEmpty() ||
    	    		    register_student_contact1.getText().isEmpty() ||
    	    		    register_county.getText().isEmpty() ||
    	    		    register_district.getText().isEmpty() ||
    	    		    register_email.getText().isEmpty() ||
    	    		    register_emergency_name.getText().isEmpty() ||
    	    		    register_emrgency_contact1.getText().isEmpty() ||
    	    		    register_gardian1_contact1.getText().isEmpty() ||
    	    		    register_gardian1_contact2.getText().isEmpty() ||
    	    		    register_gardian1_county.getText().isEmpty() ||
    	    		    register_gardian1_district.getText().isEmpty() ||
    	    		    register_gardian1_email.getText().isEmpty() ||
    	    		    register_gardian1_nin.getText().isEmpty() ||
    	    		    register_gardian1_occupation.getText().isEmpty() ||
    	    		    register_gardian1_parish.getText().isEmpty() ||
    	    		    register_gardian1_subcounty.getText().isEmpty() ||
    	    		    register_gardian1_village.getText().isEmpty() ||
    	    		    register_gardian2_contact1.getText().isEmpty() ||
    	    		    register_gardian2_contact2.getText().isEmpty() ||
    	    		    register_gardian2_county.getText().isEmpty() ||
    	    		    register_gardian2_district.getText().isEmpty() ||
    	    		    register_gardian2_email.getText().isEmpty() ||
    	    		    register_gardian2_name.getText().isEmpty() ||
    	    		    register_gardian2_nin.getText().isEmpty() ||
    	    		    register_gardian2_occupation.getText().isEmpty() ||
    	    		    register_gardian2_parish.getText().isEmpty() ||
    	    		    register_gardian2_subcounty.getText().isEmpty() ||
    	    		    register_gardian2_village.getText().isEmpty() ||
    	    		    register_gardianName1.getText().isEmpty()) {
    	    		alert = new Alert(AlertType.ERROR);
    	    		alert.setTitle("Error Message");
    	    		alert.setHeaderText(null);
    	    		alert.setContentText("Please fill all compulsory fields");
    	    		alert.showAndWait();
    	    	}else {
    	    		// Checks if The data is already available in the data base
    	    		String CheckData = "SELECT NSIN FROM studentsbio WHERE NSIN = '"
    	    				+register_NSIN.getText()+"'";  
    	    		statement = connect.createStatement();
    	    		System.out.println("Checking data...");
    	    		result = statement.executeQuery(CheckData);
    	    		
    	    		if(result.next()) {
    	    			alert = new Alert(AlertType.WARNING);
    	    			alert.setTitle("Warning");
    	    			alert.setHeaderText(null);
    	    			alert.setContentText("Students NSIN:"+register_NSIN.getText()+"Already Registered!");
    	    			alert.showAndWait();
    	    		}else {
    	    			 prepare = connect.prepareStatement(insertData);
    	     	    	 prepare.setString(1, register_fname.getText());
    	     	    	 prepare.setString(2, register_middleName.getText());
    	     	    	 prepare.setString(3, register_LName.getText());
    	     	    	 prepare.setString(4, register_religion.getText());
    	     	    	 prepare.setString(5, String.valueOf(register_DOB.getValue()));    // Potential Bug @kelvis
    	     	    	 prepare.setString(6, register_NIN.getText());
    	     	    	 prepare.setString(7, register_district.getText());
    	     	    	 prepare.setString(8, register_subcounty.getText());
    	     	    	 prepare.setString(9, register_county.getText());
    	     	    	 prepare.setString(10, register_parish.getText());
    	     	    	 prepare.setString(11, register_email.getText());
    	     	    	 prepare.setString(12, (String)register_gender.getSelectionModel().getSelectedItem());  //This to all prompted Values
    	     	    	 prepare.setString(13, register_gardianName1.getText());
    	     	    	 prepare.setString(14, register_gardian1_nin.getText());
    	     	    	 prepare.setString(15, register_gardian1_contact1.getText());
    	     	    	 prepare.setString(16, register_gardian1_contact2.getText());
    	     	    	 prepare.setString(17, register_gardian1_district.getText());
    	     	    	 prepare.setString(18, register_gardian1_subcounty.getText());
    	     	    	 prepare.setString(19, register_gardian1_county.getText());
    	     	    	 prepare.setString(20, register_gardian1_parish.getText());
    	     	    	 prepare.setString(21, register_gardian1_village.getText());
    	     	    	 prepare.setString(22, register_gardian1_email.getText());
    	     	    	 prepare.setString(23, register_gardian1_occupation.getText());
    	     	    	 prepare.setString(24, register_gardian2_name.getText());
    	     	    	 prepare.setString(25, register_gardian2_nin.getText());
    	     	    	 prepare.setString(26, register_gardian2_contact1.getText());
    	     	    	 prepare.setString(27, register_gardian2_contact2.getText());
    	     	    	 prepare.setString(28, register_gardian2_district.getText());
    	     	    	 prepare.setString(29, register_gardian2_subcounty.getText());
    	     	    	 prepare.setString(30, register_gardian2_county.getText());
    	     	    	 prepare.setString(31, register_gardian2_parish.getText());
    	     	    	 prepare.setString(32, register_gardian2_village.getText());
    	     	    	 prepare.setString(33, register_gardian2_email.getText());
    	     	    	 prepare.setString(34, register_gardian2_occupation.getText());
    	     	    	 prepare.setString(35, register_NSIN.getText());
    	     	    	 prepare.setInt(36, Integer.parseInt(register_Alevel.getText()));
    	     	    	 prepare.setInt(37, Integer.parseInt(register_Olevel.getText()));
    	     	    	 prepare.setString(38, register_doneCourse.getText());
    	     	    	 prepare.setInt(39, Integer.parseInt(register_year_done.getText()));
    	     	    	 prepare.setString(40, register_emergency_name.getText());
    	     	    	 prepare.setString(41, register_emrgency_contact1.getText());
    	     	    	 prepare.setString(42, register_emrgency_contact2.getText());
    	     	    	 prepare.setString(43, register_relationship.getText());
    	     	    	 prepare.setString(44, register_physician_contact.getText());
    	     	    	 prepare.setString(45, register_medical_conditions.getText());
    	     	    	 prepare.setString(46, register_current_medication.getText());
    	     	    	 prepare.setString(47, register_emergencyProcedures.getText());
    	     	    	 prepare.setString(48, register_specialNeeds.getText());
    	     	    	 prepare.setString(49, register_student_contact1.getText());
    	     	    	 prepare.setString(50, register_student_contact2.getText());
    	     	    	 
    	     	    	 prepare.executeUpdate();
                         alert = new Alert(AlertType.CONFIRMATION);
                         alert.setTitle("Confirmation Message");
                         alert.setHeaderText(null);
                         alert.setContentText("Student has been Added Successfully");
    	     	    	 alert.showAndWait();
    	     	    	 
    	     	    	//load students 
    	     	    	addStudentsShowListData();
    	     	    	 //Clear the text
    	     	    	clearInputs();
    	    		}
    	    	}

    	    }catch(Exception e) {e.printStackTrace();}
       }
    
    //#################################################################################################
    // Clear Method
    
    public void clearInputs() {
    	register_fname.setText("");
    	register_middleName.setText("");
    	register_LName.setText("");
    	register_religion.setText("");
    	register_DOB.setValue(null);
    	register_NIN.setText("");
    	register_district.setText("");
    	register_subcounty.setText("");
    	register_county.setText("");
    	register_parish.setText("");
    	register_gender.getSelectionModel().clearSelection();
    	register_email.setText("");
    	register_gardianName1.setText("");
    	register_gardian1_contact1.setText("");
    	register_gardian1_contact2.setText("");
    	register_Alevel.setText("");
    	register_Olevel.setText("");
    	register_doneCourse.setText("");
    	register_year_done.setText("");
    	register_emergency_name.setText("");
    	register_emrgency_contact1.setText("");
    	register_emrgency_contact2.setText("");
    	register_relationship.setText("");
    	register_physician_contact.setText("");
    	register_medical_conditions.setText("");
    	register_current_medication.setText("");
    	register_emergencyProcedures.setText("");
    	register_specialNeeds.setText("");
    	register_student_contact1.setText("");
    	register_student_contact2.setText("");
    	register_gardian1_nin.setText("");
    	register_gardian1_district.setText("");
    	register_gardian1_subcounty.setText("");
    	register_gardian1_county.setText("");
    	register_gardian1_parish.setText("");
    	register_gardian1_village.setText("");
    	register_gardian1_email.setText("");
    	register_gardian1_occupation.setText("");
    	register_gardian2_name.setText("");
    	register_gardian2_nin.setText("");
    	register_gardian2_contact1.setText("");
    	register_gardian2_contact2.setText("");
    	register_gardian2_district.setText("");
    	register_gardian2_subcounty.setText("");
    	register_gardian2_county.setText("");
    	register_gardian2_parish.setText("");
    	register_gardian2_village.setText("");
    	register_gardian2_email.setText("");
    	register_gardian2_occupation.setText("");
    	register_NSIN.setText("");
    }
    
    // THE METHOD TO UPDATE THE DATA IN THE DATABASE
    public void updateStudents() {
    	String updateData = "UPDATE studentsbio SET "+
    			 "firstName = ?, middleName = ?, lastName = ?, religion = ?, DOB = ?, studentNIN = ?,"
    			+ " studentDistrict = ?, studentSubcounty = ?, studentCounty = ?, studentParish = ?,"
    			+ " studentVillage = ?, studentGender = ?, studentEmail = ?, guardian1Name = ?, guardian1NIN = ?,"
    			+ " guardian1Contact1 = ?, guardian1Contact2 = ?, guardian1District = ?, guardian1Subcounty = ?,"
    			+ " guardian1County = ?, guardian1Parish = ?, guardian1Village = ?, guardian1Email = ?,"
    			+ " guardian1Occupation = ?, guardian2Name = ?, guardian2NIN = ?, guardian2Contact1 = ?,"
    			+ " guardian2Contact2 = ?, guardian2District = ?, guardian2Subcounty = ?, guardian2County = ?,"
    			+ " guardian2Parish = ?, guardian2Village = ?, guardian2Email = ?, guardian2Occupation = ?,"
    			+ " Alevel = ?, Olevel = ?, prevCourse = ?, courseYear = ?, emergencyName = ?,"
    			+ " emergencyContact1 = ?, emergencyContact2 = ?, relationship = ?, physicianContact = ?,"
    			+ " medConditions = ?, medProcedures = ?, specialNeeds = ?, studentContact1 = ?, studentContact2 = ?"
    			+ " WHERE NSIN = ?";   //The values are not complete...
                
    	        connect = database.connectDb();
    	        try {
    	        	Alert alert;
    	        	if(register_fname.getText().isEmpty() ||register_LName.getText().isEmpty()|| 
        	    		    register_NSIN.getText().isEmpty() ||
        	    		    register_student_contact1.getText().isEmpty() ||
        	    		    register_county.getText().isEmpty() ||
        	    		    register_district.getText().isEmpty() ||
        	    		    register_gardian1_contact2.getText().isEmpty() ||
        	    		    register_gardian1_county.getText().isEmpty() ||
        	    		    register_gardian1_district.getText().isEmpty() ||
        	    		    register_gardian1_occupation.getText().isEmpty() ||
        	    		    register_gardian1_parish.getText().isEmpty() ||
        	    		    register_gardian1_subcounty.getText().isEmpty() ||
        	    		    register_gardian1_village.getText().isEmpty() ||
        	    		    register_gardian2_contact1.getText().isEmpty() ||
        	    		    register_gardian2_contact2.getText().isEmpty() ||
        	    		    register_gardian2_county.getText().isEmpty() ||
        	    		    register_gardian2_district.getText().isEmpty() ||
        	    		    register_gardian2_email.getText().isEmpty() ||
        	    		    register_gardian2_name.getText().isEmpty() ||
        	    		    register_gardian2_nin.getText().isEmpty() ||
        	    		    register_gardian2_occupation.getText().isEmpty() ||
        	    		    register_gardian2_parish.getText().isEmpty() ||
        	    		    register_gardian2_subcounty.getText().isEmpty() ||
        	    		    register_gardian2_village.getText().isEmpty() ||
        	    		    register_gardianName1.getText().isEmpty()) {
	        	    		alert = new Alert(AlertType.ERROR);
	        	    		alert.setTitle("Error Message");
	        	    		alert.setHeaderText(null);
	        	    		alert.setContentText("Please fill all Required fields");
	        	    		alert.showAndWait();
        	    		}else {
	        	    			//Prompt Confirmation for Update
	        	    			alert = new Alert(AlertType.CONFIRMATION);
	        	    			alert.setTitle("Confirmation Message");
	        	    			alert.setHeaderText(null);
	        	    			alert.setContentText("Are you sure about this?\n Student NSIN: "+register_NSIN.getText()+" To be UPDATED!");
	        	    			Optional<ButtonType> option = alert.showAndWait();
        	    			
        	    			if(option.get().equals(ButtonType.OK)) {
        	    				statement = connect.createStatement();
            	    			statement.executeUpdate(updateData);
            	    			
            	    			alert = new Alert(AlertType.INFORMATION);
            	    			alert.setTitle("Information Message");
            	    			alert.setHeaderText(null);
            	    			alert.setContentText("Data update Succesfull!");
            	    			alert.showAndWait();
            	    			
            	     	    	addStudentsShowListData(); //load students 
            	     	    	clearInputs(); //Clear the text
            	    			
        	    			}else return;	
        	    		}
    	        	
    	        }catch(Exception e) {e.printStackTrace();}
     }
    
    //DELETE STUDENTS BY NSIN NO.
    public void delete() {
    	String deleteData = "DELETE FROM studentsbio WHERE NSIN = '"
    			+register_NSIN.getText()+"'";
    	
    	        connect = database.connectDb();
    	
    	try {
	    		Alert alert;
	    		if(register_fname.getText().isEmpty() ||register_LName.getText().isEmpty()|| 
		    		    register_NSIN.getText().isEmpty() ||
		    		    register_student_contact1.getText().isEmpty() ||
		    		    register_gardianName1.getText().isEmpty()) {
	    			
	    			alert = new Alert(AlertType.ERROR);
		    		alert.setTitle("Error Message");
		    		alert.setHeaderText(null);
		    		alert.setContentText("Please select the information to delete.");
		    		alert.showAndWait();
    		}else {
	    			alert = new Alert(AlertType.CONFIRMATION);
	    			alert.setTitle("Confirmation Message");
	    			alert.setHeaderText(null);
	    			alert.setContentText("Are you sure you want to delete Student with  NSIN: "+register_NSIN.getText()+" ?");
	    			Optional<ButtonType> option = alert.showAndWait();
    			
    			if(option.get().equals(ButtonType.OK)) {
    				statement = connect.createStatement();
	    			statement.executeUpdate(deleteData);
	    			
	    			alert = new Alert(AlertType.INFORMATION);
	    			alert.setTitle("Information Message");
	    			alert.setHeaderText(null);
	    			alert.setContentText("Student Deleted Successfully!");
	    			alert.showAndWait();
	    			
	     	    	addStudentsShowListData(); //load students 
	     	    	clearInputs(); // Clears the screen
    		}else return;
    		
    	}
    		
    	}catch(Exception e) {e.printStackTrace();}
    }
    
    
    //Search Functionality...
    public void studentSearch() {
    	
    	FilteredList<studentsBio> filter = new FilteredList(addStudentsList, e -> true);
    	register_search.textProperty().addListener((observable, oldValue, newValue) ->{
    		
    		filter.setPredicate(predicateStudentsData ->{  // If search is empty show, everything
    			if(newValue == null || newValue.isEmpty()) {
    				return true;
    			}
    			String searchKey = newValue.toLowerCase(); // Change everything to LowerCase
    			
    			if(predicateStudentsData.getNSIN().toString().contains(searchKey)) {
    				return true;
    			}else if(predicateStudentsData.getFirstName().toLowerCase().contains(searchKey)) {
    				return true;
    			}else if(predicateStudentsData.getStudentGender().toLowerCase().contains(searchKey)) {
                    return true;
    			}else if(predicateStudentsData.getReligion().toLowerCase().contains(searchKey)) {
    				return true;
    			}else if(predicateStudentsData.getmiddleName().toLowerCase().contains(searchKey)) {
                    return true;
    			}else if(predicateStudentsData.getLastName().toLowerCase().contains(searchKey)) {
    				return true;
    			}else {return false;}
    			
    		});
    	});
    	
    	SortedList<studentsBio> shortList = new SortedList<>(filter);
    	shortList.comparatorProperty().bind(register_tableView.comparatorProperty());
    	register_tableView.setItems(shortList);
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
    		details_Form.setVisible(false);
    		grade_Form.setVisible(false);
    		home_btn.setStyle("-fx-background-color: linear-gradient(to bottom right,  #3eac5b, #30bc86)");
    		register_btn.setStyle("-fx-background-color:transparent");
    		studentsList_btn.setStyle("-fx-background-color:transparent");
    		StudentsGrade_btn.setStyle("-fx-background-color:transparent");
    		
    	}else if(event.getSource() == register_btn) {
    		home_Form.setVisible(false);
    		register_Form.setVisible(true);
    		details_Form.setVisible(false);
    		grade_Form.setVisible(false);
    		register_btn.setStyle("-fx-background-color: linear-gradient(to bottom right,  #3eac5b, #30bc86)");
    		home_btn.setStyle("-fx-background-color:transparent");
    		studentsList_btn.setStyle("-fx-background-color:transparent");
    		StudentsGrade_btn.setStyle("-fx-background-color:transparent");
    		//I want to make the data to auto update its self when clicked..
    		addStudentsShowListData();
    		addGender();
    		studentSearch();
    		
    		
    	}else if(event.getSource() == studentsList_btn) {
    		home_Form.setVisible(false);
    		register_Form.setVisible(false);
    		details_Form.setVisible(true);
    		grade_Form.setVisible(false);
    		studentsList_btn.setStyle("-fx-background-color: linear-gradient(to bottom right,  #3eac5b, #30bc86)");
    		home_btn.setStyle("-fx-background-color:transparent");
    		register_btn.setStyle("-fx-background-color:transparent");
    		StudentsGrade_btn.setStyle("-fx-background-color:transparent");
    	     //Auto update the Table when clicked...
    		addToListView();
    		
    	}else if(event.getSource() == StudentsGrade_btn) {
    		home_Form.setVisible(false);
    		register_Form.setVisible(false);
    		details_Form.setVisible(false);
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
		addGender();
		addToListView();
		
		
		
		
		//The date picker and the contents...
		register_DOB.setValue(LocalDate.now().minusYears(25));
		   register_DOB.setDayCellFactory(picker -> new DateCell() {
		        public void updateItem(LocalDate date, boolean empty) {
		            super.updateItem(date, empty);
		            setDisable(date.isAfter(LocalDate.now())); // Disable future dates
		        }
		    });
	}
   


}


