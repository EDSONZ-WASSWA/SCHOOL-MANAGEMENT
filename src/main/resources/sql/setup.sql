CREATE DATABASE IF NOT EXISTS nursing_db;
USE nursing_db;

-- Users table
CREATE TABLE users (
    id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50) UNIQUE NOT NULL,
    password VARCHAR(60) NOT NULL
);

-- Students table
CREATE TABLE students (
    student_id INT PRIMARY KEY AUTO_INCREMENT,
    full_name VARCHAR(100) NOT NULL,
    dob DATE NOT NULL,
    district VARCHAR(50),
    -- Other fields...
);

-- Age calculation trigger
DELIMITER $$
CREATE TRIGGER calculate_age BEFORE INSERT ON students
FOR EACH ROW
BEGIN
    SET NEW.age = TIMESTAMPDIFF(YEAR, NEW.dob, CURDATE());
END$$
DELIMITER ;

-- Create other tables (parents, academic_info, etc.)

-- Insert demo admin (password: admin123)
INSERT INTO users (username, password) VALUES (
    'admin',
    '$2a$10$N9qo8uLOickgx2ZMRZoMyeIjZAgcfl7p92ldGxad68LJZdL17lhWy'
);