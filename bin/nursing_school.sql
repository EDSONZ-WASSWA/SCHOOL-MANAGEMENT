-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 01, 2025 at 03:23 AM
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
-- Table structure for table `studentsbio`
--

CREATE TABLE `studentsbio` (
  `id` int(100) NOT NULL,
  `firstName` varchar(100) NOT NULL,
  `middleName` varchar(100) NOT NULL,
  `lastName` varchar(100) NOT NULL,
  `religion` varchar(100) NOT NULL,
  `DOB` date NOT NULL,
  `studentNIN` varchar(100) NOT NULL,
  `studentDistrict` varchar(100) NOT NULL,
  `studentSubcounty` varchar(100) NOT NULL,
  `studentCounty` varchar(100) NOT NULL,
  `studentParish` varchar(100) NOT NULL,
  `studentGender` varchar(100) NOT NULL,
  `studentEmail` varchar(100) NOT NULL,
  `guardian1Name` varchar(100) NOT NULL,
  `guardian1NIN` varchar(100) NOT NULL,
  `guardian1Contact1` int(100) NOT NULL,
  `guardian1Contact2` int(100) NOT NULL,
  `guardian1District` varchar(100) NOT NULL,
  `guardian1Subcounty` varchar(100) NOT NULL,
  `guardian1County` varchar(100) NOT NULL,
  `guardian1Parish` varchar(100) NOT NULL,
  `guardian1Village` varchar(100) NOT NULL,
  `guardian1Email` varchar(100) NOT NULL,
  `guardian1Occupation` varchar(100) NOT NULL,
  `guardian2Name` varchar(100) NOT NULL,
  `guardian2NIN` varchar(100) NOT NULL,
  `guardian2Contact1` int(100) NOT NULL,
  `guardian2Contact2` int(100) NOT NULL,
  `guardian2District` varchar(100) NOT NULL,
  `guardian2Subcounty` varchar(100) NOT NULL,
  `guardian2County` varchar(100) NOT NULL,
  `guardian2Parish` varchar(100) NOT NULL,
  `guardian2Village` varchar(100) NOT NULL,
  `guardian2Email` varchar(100) NOT NULL,
  `guardian2Occupation` varchar(100) NOT NULL,
  `NSIN` varchar(100) NOT NULL,
  `Alevel` int(100) NOT NULL,
  `Olevel` int(100) NOT NULL,
  `prevCourse` varchar(100) NOT NULL,
  `courseYear` int(100) NOT NULL,
  `emergencyName` varchar(100) NOT NULL,
  `emergencyContact1` int(100) NOT NULL,
  `emergencyContact2` int(100) NOT NULL,
  `relationship` varchar(100) NOT NULL,
  `physicianContact` int(100) NOT NULL,
  `medConditions` varchar(100) NOT NULL,
  `medication` varchar(100) NOT NULL,
  `medProcedures` varchar(100) NOT NULL,
  `specialNeeds` varchar(100) NOT NULL,
  `studentContact1` int(100) NOT NULL,
  `studentContact2` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `studentsbio`
--

INSERT INTO `studentsbio` (`id`, `firstName`, `middleName`, `lastName`, `religion`, `DOB`, `studentNIN`, `studentDistrict`, `studentSubcounty`, `studentCounty`, `studentParish`, `studentGender`, `studentEmail`, `guardian1Name`, `guardian1NIN`, `guardian1Contact1`, `guardian1Contact2`, `guardian1District`, `guardian1Subcounty`, `guardian1County`, `guardian1Parish`, `guardian1Village`, `guardian1Email`, `guardian1Occupation`, `guardian2Name`, `guardian2NIN`, `guardian2Contact1`, `guardian2Contact2`, `guardian2District`, `guardian2Subcounty`, `guardian2County`, `guardian2Parish`, `guardian2Village`, `guardian2Email`, `guardian2Occupation`, `NSIN`, `Alevel`, `Olevel`, `prevCourse`, `courseYear`, `emergencyName`, `emergencyContact1`, `emergencyContact2`, `relationship`, `physicianContact`, `medConditions`, `medication`, `medProcedures`, `specialNeeds`, `studentContact1`, `studentContact2`) VALUES
(1, 'KATO', 'ELVIS', 'SALVATOA', 'SDA', '2004-05-20', 'CFKJ74T98RHE9Y4C934', 'Fox_River', 'Fox_River', 'Green Hill', 'Fox_River', 'eli@yahoo.ac.dev', 'Male', 'Kalumba J', 'CMKDH648UIEE9494', 778946429, 778945672, 'Washington', 'Washington', 'Washington', 'Washington', 'Washington', 'kal@gmail.com', 'Pastor', 'Sarah', 'CFGHEUER85843DN842N8', 778532324, 445665422, 'Washington', 'Washington', 'Washington', 'Washington', 'Washington', 'serah@yahoo.com', 'Doc', 'JAN24/784/CNS/128', 20, 10, 'Software Enginearing', 2010, 'Edson K', 123456789, 98765421, 'Bro', 235468713, 'Malaria', 'Panadol Xtra', 'Sleep', 'Keep Codding bro', 778946429, 78774441),
(2, 'NASAKA', 'RUTH', 'DANIELLA', 'SDA', '2006-05-13', 'CFHGHR89R98EHE9E', 'Wakiso', 'Wakiso', 'Wakiso', 'Wakiso', 'nrd@gmail.com', 'Female', 'Richard Tomas', 'CFGRIGURTY586Y39TH9', 77889847, 234378572, 'Wakiso', 'Wakiso', 'Wakiso', 'Wakiso', 'Wakiso', 'Wakiso', 'Wakiso', 'Wakiso', 'Wakiso', 567481643, 487583024, 'Wakiso', 'Wakiso', 'Wakiso', 'Wakiso', 'Wakiso', 'ts234@elvis.dev', 'Doc', 'JULY24/128/CDF/567', 20, 10, '', 0, 'ELVIS K', 345678976, 234567876, 'BF', 1234567895, 'Allergies', 'Treatment', 'Sleeping', 'No need', 789044423, 76453218);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `studentsbio`
--
ALTER TABLE `studentsbio`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `studentsbio`
--
ALTER TABLE `studentsbio`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
