

package com.nursing.management.controllers;
import java.io.IOException;

import com.nursing.management.dao.StudentDAO;
import com.nursing.management.models.Student;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumnBase;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;


public class StudentListController {
    private static final TableColumnBase<Student, String> txtSearch = null;   //added
	@FXML private TableView<Student>studentTable;
    @FXML private TableColumn<Student, String>colStudentId;
    @FXML private TableColumn<Student, String>colFullName;
    @FXML private TableColumn<Student, String>colDob;
    @FXML private TableColumn<Student, String>colDistrict;
    @FXML private Button btnAdd;
    @FXML private Button btnEdit;
    @FXML private Button btnDelete;
    @FXML private Button btnBack;
    @FXML private Label lblCategory;

    private ObservableList<Student>studentList = FXCollections.observableArrayList();
    private String currentCategory;


    /*The initialization method that loads up the table with data from the backend.
    This method is called automatically when the FXML loads.
    This also contains the method that search functionality with the options of
    case sensitivity and the id search
 *******************************************************************************************************
    initialize()    Sets up the table, selection, and search on FXML load.
    setupTableColumns() Binds Student properties to table columns.
    setupTableSelection()   Enables/disables buttons based on row selection.
    setupSearchFunctionality()  Enables real-time table filtering.
    setCategory()   Updates the displayed student category and reloads data.
    loadStudents()  Loads all students from the database into the table.
    filterStudents()
    */

    @FXML
    private void initialize(){
        setupTableColumns();
        setupTableSelection();
        setupSearchFunctionality();
    }
    private void setupTableColumns(){
        colStudentId.setCellValueFactory(new PropertyValueFactory<>("studentId"));
        colFullName.setCellValueFactory(new PropertyValueFactory<>("fullName"));
        colDob.setCellValueFactory(new PropertyValueFactory<>("dob"));
        colDistrict.setCellValueFactory(new PropertyValueFactory<>("district"));
    }

    private void setupTableSelection(){
        studentTable.getSelectionModel().selectedItemProperty().addListener((obs,oldSelection,newSelection) ->{
            btnEdit.setDisable(newSelection == null);
            btnDelete.setDisable(newSelection == null);
        });
    }

    private void setupSearchFunctionality(){
        txtSearch.textProperty().addListener((observable,oldValue,newValue) ->{
            filterStudents(newValue);
        });
    }

    public void setCategory(String category){
        this.currentCategory = category;
        lblCategory.setText(category);
        loadStudents();
    }

    private void loadStudents(){
        studentList.clear();
        studentList.addAll(new StudentDAO().getAllStudents());
        studentTable.setItems(studentList);
    }
    //The search filter method...
    private void filterStudents(String searchText){
        if(searchText == null || searchText.isEmpty()){
            studentTable.setItems(studentList);
        }else{
            ObservableList<Student>filteredList = FXCollections.observableArrayList();
            for (Student student :studentList){
                if (student.getFullName().toLowerCase().contains(searchText.toLowerCase()) ||
                        student.getStudentId().toLowerCase().contains(searchText.toLowerCase())){
                    filteredList.add(student);
                }
            }
            studentTable.setItems(filteredList);
        }
    }

    /*
    * The add student method to add all the new student in the database
    *
    * HOW IT WORKS
    * User clicks "Add" → handleAdd() runs.
      A new form window opens (student_form.fxml).
      User fills data and clicks Save → StudentDAO.addStudent() is called (from handleSave() in StudentController).
      Form closes → loadStudents() refreshes the table.
    * */
    @FXML
    private void handleAdd(){
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/student_form.fxml"));
            Stage stage = new Stage();
            stage.setScene(new Scene(loader.load()));

            StudentController controller = loader.getController();
            controller.setStudentData(null);
            stage.showAndWait();
            loadStudents(); // refresh the table after adding the new Student
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    /*The handle edit method.
     * This is like the add student method, but works on only already existing data.
     * A person edits the student info
     * Then they save, a form first freezes the window until the data is saved.
     * Then when the data is save, the data is the re-loaded with the edited data.
     * */

    @FXML
    private void handleEdit(){
        Student selectedStudent = studentTable.getSelectionModel().getSelectedItem();

        if(selectedStudent != null){
            try{
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/student_form.fxml"));
                Stage stage = new Stage();
                stage.setScene(new Scene(loader.load()));

                //Student controller
                StudentController controller = loader.getController();
                controller.setStudentData(selectedStudent);
                stage.showAndWait(); // reload the page after the data is saved.
                loadStudents();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    /*
     * The delete method of the Students data
     *
     * */
    @FXML
    private void handleDelete(){
        Student selectedStudent = studentTable.getSelectionModel().getSelectedItem();
        if(selectedStudent != null){
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Confirm Delete?");
            alert.setHeaderText("Delete Student Records");
            alert.setContentText("Are you sure you want to delete "+selectedStudent.getFullName()+"?");

            if(alert.showAndWait().get()== ButtonType.OK){
                new StudentDAO().deleteStudent(selectedStudent.getStudentId());
                loadStudents();
            }
        }
    }

    /*
     * Handeling the Back Button...
     * This line **- e.printStackTrace();-**, show the button doesn work.
     * Check the console for the error.
     * */
    @FXML
    private void handelBack(){
        try{
            Stage stage = (Stage) btnBack.getScene().getWindow();
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/fxml/dashboard.fxml"))));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
