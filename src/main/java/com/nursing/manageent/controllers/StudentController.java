package com.nursing.management.controllers;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import com.nursing.management.models.Student;
import com.nursing.management.dao.StudentDAO;

public class StudentController {
    @FXML private VBox studentForm;
    @FXML private TextField txtStudentId;
    @FXML private TextField txtFullName;
    @FXML private DatePicker dpDob;
    @FXML private TextField txtDistrict;
    @FXML private TextField txtCounty;
    @FXML private TextField txtSubcounty;
    @FXML private TextField txtVillage;
    @FXML private TextField txtContacts;
    @FXML private TextField txtNin;
    @FXML private Button btnSave;
    @FXML private Button btnCancel;
    @FXML private TabPane tabPane;

    private Student currentStudent;
    private boolean isEditMode = false;


    @FXML
    private void intialize(){
        setupFormValidation();
    }

    private void setupFormValidation(){
        btnSave.disableProperty().bind(txtFullName.textProperty().isEmpty().or(dpDob.valueProperty().isNull()));
    }

    //Editing the students records

    public void setStudentData(Student student){
        this.currentStudent = student;

        if(student != null){
            isEditMode = true;
            txtStudentId.setText(student.getStudentId());
            txtFullName.setText(student.getFullName());
            dpDob.setValue(student.getDob());
            txtDistrict.setText(student.getDistrict());
            txtCounty.setText(student.getCounty());
            txtSubcounty.setText(student.getSubcounty());
            txtVillage.setText(student.getVillage());
            txtContacts.setText(student.getContacts());
            txtNin.setText(student.getNin());
        }
    }

    //Edit or update students
    @FXML
    private void handleSave(){
        Student student = isEditMode ? currentStudent : newStudent();

        student.setFullName(txtFullName.getText());
        student.setDob(dpDob.getValue());
        student.setDistrict(txtDistrict.getText());
        student.setCounty(txtCounty.getText());
        student.setSubcounty(txtSubcounty.getText());
        student.setVillage(txtVillage.getText());
        student.setContacts(txtContacts.getText());
        student.setNin(txtNin.getText());

        StudentDAO studentDAO = new StudentDAO();
        if(isEditMode){
            studentDAO.updateStudent(student);
        }else{
            studentDAO.addStudent(student);
        }
        closeWindow();
    }

    //The cancellation and window management
    @FXML
    private void handleCancel(){
        closeWindow();
    }

    private void closeWindow(){
        ((stage) studentForm.getScene().getWindow()).close();
    }

}

