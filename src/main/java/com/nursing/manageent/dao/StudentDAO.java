import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.nursing.manageent.auth.DatabaseConnector;

public class StudentDAO {
    public void addStudent(Student student) {
        try (Connection conn = DatabaseConnector.getConnection()) {
            PreparedStatement stmt = conn.prepareStatement(
                "INSERT INTO students (full_name, dob, district) VALUES (?, ?, ?)");
            stmt.setString(1, student.getFullName());
            stmt.setDate(2, java.sql.Date.valueOf(student.getDob()));
            stmt.setString(3, student.getDistrict());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    // Other CRUD methods
}