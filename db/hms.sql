-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 01, 2019 at 10:15 PM
-- Server version: 10.4.6-MariaDB
-- PHP Version: 7.1.32

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hms`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin_info`
--

CREATE TABLE `admin_info` (
  `name` text NOT NULL,
  `email` text NOT NULL,
  `phone` int(11) NOT NULL,
  `q1` text NOT NULL,
  `q2` text NOT NULL,
  `q3` text NOT NULL,
  `a1` text NOT NULL,
  `a2` text NOT NULL,
  `a3` text NOT NULL,
  `username` text NOT NULL,
  `password` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin_info`
--

INSERT INTO `admin_info` (`name`, `email`, `phone`, `q1`, `q2`, `q3`, `a1`, `a2`, `a3`, `username`, `password`) VALUES
('admin', 'admin', 1701042718, 'What was the house number and street name you lived in as a child?', 'What were the last four digits of your childhood telephone number?', 'What primary school did you attend?', 'admin', 'admin', 'admin', 'admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `appoinment`
--

CREATE TABLE `appoinment` (
  `Name` text NOT NULL,
  `docname` text NOT NULL,
  `date` text NOT NULL,
  `serial` int(11) NOT NULL,
  `age` text NOT NULL,
  `gender` text NOT NULL,
  `phone` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `appoinment`
--

INSERT INTO `appoinment` (`Name`, `docname`, `date`, `serial`, `age`, `gender`, `phone`) VALUES
('asad', 'admin', '03-12-2019', 13613, '21', 'Male', 1701042718);

-- --------------------------------------------------------

--
-- Table structure for table `doctor_db`
--

CREATE TABLE `doctor_db` (
  `regno` int(11) NOT NULL,
  `name` text NOT NULL,
  `fathername` text NOT NULL,
  `gender` text NOT NULL,
  `Password` text NOT NULL,
  `specialist` text NOT NULL,
  `village` text NOT NULL,
  `phone` int(11) NOT NULL,
  `email` text NOT NULL,
  `vhours` text NOT NULL,
  `branch` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `doctor_db`
--

INSERT INTO `doctor_db` (`regno`, `name`, `fathername`, `gender`, `Password`, `specialist`, `village`, `phone`, `email`, `vhours`, `branch`) VALUES
(111222333, 'admin', 'admin', 'admin', 'admin', 'Anesthesiologist', 'admin', 1701042718, 'admin', '09.00 am -12.00 pm', 'Rajshahi');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
