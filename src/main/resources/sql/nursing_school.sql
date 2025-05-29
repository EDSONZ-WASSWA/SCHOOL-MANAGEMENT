-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 29, 2025 at 04:54 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12
-- @KATO ELVIS /3467/NRD

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
  `guardian1Name` varchar(100) NOT NULL,
  `guardian1NIN` varchar(100) NOT NULL,
  `guardian1Contact1` int(100) NOT NULL,
  `guardian1Contact2` int(100) NOT NULL,
  `guardian1District` varchar(100) NOT NULL,
  `guardian1Subcounty` varchar(100) NOT NULL,
  `guardian1County` varchar(100) NOT NULL,
  `guardian1Parish` varchar(100) NOT NULL,
  `guardian1Village` varchar(100) NOT NULL,
  `guardian1Email` text NOT NULL,
  `guardian1Occupation` varchar(100) NOT NULL,
  `guardian2Name` varchar(100) NOT NULL,
  `guardian2NIN` varchar(100) NOT NULL,
  `guardian2Contact1` int(15) NOT NULL,
  `guardian2Contact2` int(15) NOT NULL,
  `guardian2District` varchar(100) NOT NULL,
  `guardian2Subcounty` varchar(100) NOT NULL,
  `guardian2County` varchar(100) NOT NULL,
  `guardian2Parish` varchar(100) NOT NULL,
  `guardian2Village` varchar(100) NOT NULL,
  `guardian2Email` varchar(100) NOT NULL,
  `guardian2Occupation` varchar(100) NOT NULL,
  `NSIN` varchar(40) NOT NULL,
  `Alevel` int(5) NOT NULL,
  `Olevel` int(5) NOT NULL,
  `prevCourse` varchar(100) NOT NULL,
  `courseYear` varchar(100) NOT NULL,
  `emergencyName` varchar(100) NOT NULL,
  `emergencyContact1` int(15) NOT NULL,
  `emergencyContact2` int(15) NOT NULL,
  `relationship` varchar(100) NOT NULL,
  `physicianContact` int(15) NOT NULL,
  `medConditions` varchar(100) NOT NULL,
  `medication` varchar(500) NOT NULL,
  `medProcedures` varchar(500) NOT NULL,
  `specialNeeds` varchar(500) NOT NULL,
  `MTN` int(15) NOT NULL,
  `Airtel` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `studentsbio`
--

INSERT INTO `studentsbio` (`id`, `firstName`, `middleName`, `lastName`, `religion`, `DOB`, `studentNIN`, `studentDistrict`, `studentSubcounty`, `studentCounty`, `studentParish`, `studentGender`, `guardian1Name`, `guardian1NIN`, `guardian1Contact1`, `guardian1Contact2`, `guardian1District`, `guardian1Subcounty`, `guardian1County`, `guardian1Parish`, `guardian1Village`, `guardian1Email`, `guardian1Occupation`, `guardian2Name`, `guardian2NIN`, `guardian2Contact1`, `guardian2Contact2`, `guardian2District`, `guardian2Subcounty`, `guardian2County`, `guardian2Parish`, `guardian2Village`, `guardian2Email`, `guardian2Occupation`, `NSIN`, `Alevel`, `Olevel`, `prevCourse`, `courseYear`, `emergencyName`, `emergencyContact1`, `emergencyContact2`, `relationship`, `physicianContact`, `medConditions`, `medication`, `medProcedures`, `specialNeeds`, `MTN`, `Airtel`) VALUES
(0, '[value-2]', '[value-3]', '[value-4]', '[value-5]', '0000-00-00', '[value-7]', '[value-8]', '[value-9]', '[value-10]', '[value-11]', '[value-12]', '[value-13]', '[value-14]', 0, 0, '[value-17]', '[value-18]', '[value-19]', '[value-20]', '[value-21]', '[value-22]', '[value-23]', '[value-24]', '[value-25]', 0, 0, '[value-28]', '[value-29]', '[value-30]', '[value-31]', '[value-32]', '[value-33]', '[value-34]', '[value-35]', 0, 0, '[value-38]', '[value-39]', '[value-40]', 0, 0, '[value-43]', 0, '[value-45]', '[value-46]', '[value-47]', '[value-48]', 0, 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `studentsbio`
--
ALTER TABLE `studentsbio`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
