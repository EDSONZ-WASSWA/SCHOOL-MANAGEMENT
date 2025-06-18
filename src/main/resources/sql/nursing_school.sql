-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 18, 2025 at 11:54 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `nursing_school`
--

-- --------------------------------------------------------

--
-- Table structure for table `logindata`
--

CREATE TABLE `logindata` (
  `id` int(100) NOT NULL,
  `password` char(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `logindata`
--

INSERT INTO `logindata` (`id`, `password`) VALUES
(9, 'Admin123');

-- --------------------------------------------------------

--
-- Table structure for table `studentsbio`
--

CREATE TABLE `studentsbio` (
  `id` int(20) NOT NULL,
  `firstName` varchar(100) NOT NULL,
  `middleName` varchar(100) DEFAULT '      -',
  `lastName` varchar(100) NOT NULL,
  `religion` varchar(100) DEFAULT '-',
  `DOB` date DEFAULT current_timestamp(),
  `studentNIN` varchar(100) DEFAULT '-',
  `studentDistrict` varchar(100) DEFAULT '-',
  `studentSubcounty` varchar(100) DEFAULT ' -',
  `studentCounty` varchar(100) DEFAULT '-',
  `studentParish` varchar(100) DEFAULT '-',
  `studentGender` varchar(100) DEFAULT 'Male',
  `studentEmail` varchar(100) NOT NULL DEFAULT '-',
  `guardian1Name` varchar(100) NOT NULL DEFAULT ' ',
  `guardian1NIN` varchar(100) NOT NULL DEFAULT ' ',
  `guardian1Contact1` varchar(20) NOT NULL DEFAULT '-',
  `guardian1Contact2` varchar(20) NOT NULL DEFAULT '-',
  `guardian1District` varchar(100) NOT NULL DEFAULT '',
  `guardian1Subcounty` varchar(100) NOT NULL DEFAULT '',
  `guardian1County` varchar(100) NOT NULL DEFAULT '',
  `guardian1Parish` varchar(100) NOT NULL DEFAULT '',
  `guardian1Village` varchar(100) NOT NULL DEFAULT '',
  `guardian1Email` varchar(100) DEFAULT NULL,
  `guardian1Occupation` varchar(100) NOT NULL DEFAULT '',
  `guardian2Name` varchar(100) DEFAULT NULL,
  `guardian2NIN` varchar(100) DEFAULT NULL,
  `guardian2Contact1` varchar(20) DEFAULT NULL,
  `guardian2Contact2` varchar(20) DEFAULT NULL,
  `guardian2District` varchar(100) DEFAULT NULL,
  `guardian2Subcounty` varchar(100) NOT NULL,
  `guardian2County` varchar(100) NOT NULL,
  `guardian2Parish` varchar(100) NOT NULL,
  `guardian2Village` varchar(100) NOT NULL,
  `guardian2Email` varchar(100) NOT NULL,
  `guardian2Occupation` varchar(100) NOT NULL,
  `NSIN` varchar(100) NOT NULL,
  `Alevel` int(20) DEFAULT NULL,
  `Olevel` int(20) DEFAULT NULL,
  `prevCourse` varchar(100) NOT NULL,
  `courseYear` int(20) DEFAULT NULL,
  `emergencyName` varchar(100) NOT NULL DEFAULT '',
  `emergencyContact1` varchar(20) NOT NULL DEFAULT '',
  `emergencyContact2` varchar(20) NOT NULL DEFAULT '',
  `relationship` varchar(100) NOT NULL DEFAULT '',
  `physicianContact` varchar(20) NOT NULL DEFAULT ' ',
  `medConditions` varchar(100) NOT NULL DEFAULT '',
  `medication` varchar(100) NOT NULL DEFAULT ' ',
  `medProcedures` varchar(100) NOT NULL DEFAULT '      -',
  `specialNeeds` varchar(100) NOT NULL DEFAULT '         ',
  `studentContact1` varchar(20) NOT NULL DEFAULT '        ',
  `studentContact2` varchar(20) NOT NULL DEFAULT '   ',
  `courseTaken` varchar(100) DEFAULT 'Choose',
  `courseLevel` varchar(100) DEFAULT 'Choose',
  `yearCourse` varchar(100) DEFAULT 'Choose',
  `courseSemister` varchar(100) DEFAULT 'Choose'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `studentsbio`
--

INSERT INTO `studentsbio` (`id`, `firstName`, `middleName`, `lastName`, `religion`, `DOB`, `studentNIN`, `studentDistrict`, `studentSubcounty`, `studentCounty`, `studentParish`, `studentGender`, `studentEmail`, `guardian1Name`, `guardian1NIN`, `guardian1Contact1`, `guardian1Contact2`, `guardian1District`, `guardian1Subcounty`, `guardian1County`, `guardian1Parish`, `guardian1Village`, `guardian1Email`, `guardian1Occupation`, `guardian2Name`, `guardian2NIN`, `guardian2Contact1`, `guardian2Contact2`, `guardian2District`, `guardian2Subcounty`, `guardian2County`, `guardian2Parish`, `guardian2Village`, `guardian2Email`, `guardian2Occupation`, `NSIN`, `Alevel`, `Olevel`, `prevCourse`, `courseYear`, `emergencyName`, `emergencyContact1`, `emergencyContact2`, `relationship`, `physicianContact`, `medConditions`, `medication`, `medProcedures`, `specialNeeds`, `studentContact1`, `studentContact2`, `courseTaken`, `courseLevel`, `yearCourse`, `courseSemister`) VALUES
(54, 'YOWERI', 'KAGUTA', 'MUSEVENI', 'SDA', '2000-06-16', 'CMDGF75HF945J', 'ENTEBE', 'ENTEBE', 'ENTEBE', 'ENTEBE', 'Male', 'museveni@gmail.com', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', 'JUL25/U028/DN/001', NULL, NULL, '', NULL, '', '', '', '', '', '', '', '', '', '07798478294', '06853448284', 'Nursing', 'Certificate', 'Year 1', 'SEM 1'),
(55, 'NABANJA', '', 'HARIET', 'CATHOLIC', '2000-07-15', '', 'MUKONO', '', '', '', 'Female', 'nabanja@gmail.com', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', 'JUL25/U028/CN/001', NULL, NULL, '', NULL, '', '', '', '', '', '', '', '', '', '07789563942', '', 'Nursing', 'Certificate', 'Year 1', 'SEM 1'),
(56, 'NAMUBIRU ', 'SHANA', 'SARAH', 'ANGLICAN', '2001-10-05', '', 'MSK', '', '', 'KIGYABWEMEI', 'Female', 'namubirus@gmail.com', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', 'JUL25/U028/DN/002', NULL, NULL, '', NULL, '', '', '', '', '', '', '', '', '', '0778746249', '', 'Direct Midwifrey', 'Diploma', 'Year 1', 'SEM 1'),
(57, 'ROBERT', 'SENTAMU', 'KYAGULANYI', 'MUSLIM', '2003-06-16', '', '', '', '', '', 'Male', 'bibwine@gmail.com', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', 'JUL25/U028/DM/001', 0, 0, '', 0, '', '', '', '', '', '', '', '', '', '0778956281', '', NULL, NULL, NULL, NULL),
(58, 'MAYANJA', 'GEORGE', 'WILLIAM', 'SDA', '1998-02-04', '', '', '', '', '', 'Male', 'mayanja@gmail.com', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', 'JUL25/U028/DM/002', 0, 0, '', 0, '', '', '', '', '', '', '', '', '', '088765356235', '088765356235', NULL, NULL, NULL, NULL),
(59, 'NAKALUMBA', '', 'SARAH', 'SDA', '2002-09-10', '', '', '', '', 'NAALYA', 'Female', 'sarah@gmail.com', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', 'JUL25/U028/EM/045', 0, 0, '', 0, '', '', '', '', '', '', '', '', '', '0778756248', '', NULL, 'Certificate', NULL, NULL),
(60, 'WASSWA', '', 'EDSON', 'CATHOLIC', '2000-02-26', 'CMJEU473YWNWYR84', 'CMJEU473YWNWYR84', 'KATWE', 'KATWE-BUTEGO', 'KATWE', 'Male', 'EDSONW@GMAIL.COM', 'DONAL J TRUMP', 'CMJEU473YWNWYR84', '0778462735', '0778462735', 'MSK', 'MSK', 'KATWE', 'KATWE-BUTEGO', 'KATWE-BUTEGO', 'TRUMP@GMAIL.COM', 'US PRRESIDENT', 'SARAH TRUMP', 'CMJEU473YWNWYR84', '0778462735', '0778462735', 'WASHINGTON DC', 'NEWYORK', 'NEWYORK', 'NEWYORK', 'NEWYORK', 'SARAH@GMAIL.COM', 'FIRST LADDY', 'JUL25/U028/DN/004', 0, 0, 'SOFTWARE DEVELOPMENT', 0, 'KATO ELVIS', '0778462735', '0778462735', 'BROTHER 1', '0778462735', '', 'MALARIA TABS', 'NEED TO BE AT HOME ALL DAY LONG\nNO NEED FOR CALSS WHEN SICK.\nSHOULD BE GIVEN HOT BREAD AND BUTTER', 'JUST A PAIR OF GAMING STEERING WHEEL FOR THE NIGHT.\n#KEEP CODDING', '0778462735', '0776532417', NULL, NULL, NULL, NULL),
(61, 'KALUMBA', '', 'ENOCK', 'ANGLICAN', '2000-08-16', '', 'KIREKA', 'KASOKOSO', '', '', 'Male', 'kemjiu2@gmail.com', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', '', 'JUL25/UO28/CN/005', NULL, NULL, '', NULL, '', '077894732', '', '', '', '', '', '', '', '0778546253', '', 'Nursing', 'Diploma', 'Year 1', 'SEM 1');

-- --------------------------------------------------------

--
-- Table structure for table `students_grades`
--

CREATE TABLE `students_grades` (
  `id` int(20) NOT NULL,
  `NSIN` varchar(100) NOT NULL,
  `studentsName` varchar(100) NOT NULL,
  `sem1_p1` int(20) NOT NULL,
  `sem1_p2` int(20) NOT NULL,
  `sem1_p3` int(20) NOT NULL,
  `sem1_p4` int(20) NOT NULL,
  `sem2_p1` int(20) NOT NULL,
  `sem2_p2` int(20) NOT NULL,
  `sem2_p3` int(20) NOT NULL,
  `sem2_p4` int(20) NOT NULL,
  `sem3_p1` int(20) NOT NULL,
  `sem3_P2` int(20) NOT NULL,
  `sem3_p3` int(20) NOT NULL,
  `sem3_p4` int(20) NOT NULL,
  `sem4_p1` int(20) NOT NULL,
  `sem4_p2` int(20) NOT NULL,
  `sem4_p3` int(20) NOT NULL,
  `sem4_p4` int(20) NOT NULL,
  `sem5_p1` int(20) NOT NULL,
  `sem5_p2` int(20) NOT NULL,
  `sem5_p3` int(20) NOT NULL,
  `sem5_p4` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `students_grades`
--

INSERT INTO `students_grades` (`id`, `NSIN`, `studentsName`, `sem1_p1`, `sem1_p2`, `sem1_p3`, `sem1_p4`, `sem2_p1`, `sem2_p2`, `sem2_p3`, `sem2_p4`, `sem3_p1`, `sem3_P2`, `sem3_p3`, `sem3_p4`, `sem4_p1`, `sem4_p2`, `sem4_p3`, `sem4_p4`, `sem5_p1`, `sem5_p2`, `sem5_p3`, `sem5_p4`) VALUES
(40, 'JUL25/U028/DN/001', 'YOWERI KAGUTA MUSEVENI', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(41, 'JUL25/U028/CN/001', 'NABANJA  HARIET', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(42, 'JUL25/U028/DN/002', 'NAMUBIRU  SHANA SARAH', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(43, 'JUL25/U028/DM/001', 'ROBERT SENTAMU KYAGULANYI', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(44, 'JUL25/U028/DM/002', 'MAYANJA GEORGE WILLIAM', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(45, 'JUL25/U028/EM/045', 'NAKALUMBA  SARAH', 67, 48, 93, 78, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(46, 'JUL25/U028/DN/004', 'WASSWA  EDSON', 24, 80, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
(47, 'JUL25/UO28/CN/005', 'KALUMBA  ENOCK', 98, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `logindata`
--
ALTER TABLE `logindata`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `studentsbio`
--
ALTER TABLE `studentsbio`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `students_grades`
--
ALTER TABLE `students_grades`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `logindata`
--
ALTER TABLE `logindata`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `studentsbio`
--
ALTER TABLE `studentsbio`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=62;

--
-- AUTO_INCREMENT for table `students_grades`
--
ALTER TABLE `students_grades`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=48;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
