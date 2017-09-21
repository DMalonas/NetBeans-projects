-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 27, 2017 at 05:27 PM
-- Server version: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `glidingdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `clubs`
--

CREATE TABLE `clubs` (
  `ID` bigint(20) UNSIGNED NOT NULL,
  `NAME` varchar(20) NOT NULL,
  `AEROTOW` tinyint(1) NOT NULL,
  `WINCH` tinyint(1) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `clubs`
--

INSERT INTO `clubs` (`ID`, `NAME`, `AEROTOW`, `WINCH`) VALUES
(1, 'Coventry Club', 1, 1),
(2, 'London Club', 1, 0),
(3, 'Manchester', 0, 0),
(4, 'London East', 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `vouchers`
--

CREATE TABLE `vouchers` (
  `ID` bigint(20) UNSIGNED NOT NULL,
  `CODE` varchar(10) NOT NULL,
  `CUSTOMER_NAME` varchar(40) NOT NULL,
  `CUSTOMER_EMAIL_ADDRESS` varchar(40) NOT NULL,
  `DELIVERY_ADDRESS` varchar(50) NOT NULL,
  `PURCHASE_DATE` varchar(50) NOT NULL,
  `GIFT` tinyint(1) NOT NULL,
  `GIFT_RECIPIENT_NAME` varchar(40) DEFAULT NULL,
  `REDEEMED` tinyint(1) NOT NULL,
  `FLIGHT_DATE` varchar(50) DEFAULT NULL,
  `FLIGHT_TIME` varchar(10) DEFAULT NULL,
  `CLUB` varchar(50) DEFAULT NULL,
  `FLIGHT_TYPE` varchar(40) DEFAULT NULL,
  `COMPLETED` tinyint(1) NOT NULL,
  `FLIGHT_DURATION` varchar(10) DEFAULT NULL,
  `GLIDER_NUMBER` varchar(10) DEFAULT NULL,
  `GLIDING_INSTRUCTOR` varchar(40) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `vouchers`
--

INSERT INTO `vouchers` (`ID`, `CODE`, `CUSTOMER_NAME`, `CUSTOMER_EMAIL_ADDRESS`, `DELIVERY_ADDRESS`, `PURCHASE_DATE`, `GIFT`, `GIFT_RECIPIENT_NAME`, `REDEEMED`, `FLIGHT_DATE`, `FLIGHT_TIME`, `CLUB`, `FLIGHT_TYPE`, `COMPLETED`, `FLIGHT_DURATION`, `GLIDER_NUMBER`, `GLIDING_INSTRUCTOR`) VALUES
(55, 'knojl', 'Dimitrios Malonas', 'dm@outlook.com', 'Priory Streett', 'Mon Mar 27 18:15:11 BST 2017', 0, 'null', 0, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL),
(29, '14382', 'Dimitrios Malonas', 'dimitriosmalonas@outlook.com', 'Thomas Landsdail', 'Fri Mar 24 00:00:00 GMT 2017', 0, 'null', 1, 'Fri Mar 03 00:00:00 GMT 2017', '09:00', 'Coventry Club', '1 aerotow to 2000ft', 1, '0h 0m', 'DGFS', 'AFDASF'),
(30, '36ime', 'as', 'dimitriosmalonas@outlook.com', 'sfdfs', 'Thu Mar 09 00:00:00 GMT 2017', 1, 'dfsafsd', 0, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL),
(31, 'kx6i2', 'Dimitasfsdf', 'dimitriosmalonas@outlook.com', 'asffa', 'Wed Mar 22 00:00:00 GMT 2017', 1, 'fasfsadf', 0, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL),
(32, 'dsey9', 'Dimitrios Malonas', 'dimitriosmalonas@outlook.com', 'Thomas Avenue', 'Tue Mar 28 00:00:00 BST 2017', 0, 'null', 0, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL),
(33, 'ky292', 'Dimitrios Malonas', 'dimitriosmalonas@outlook.com', 'Thomas ', 'Sun Mar 26 00:00:00 GMT 2017', 1, 'George Elliott', 0, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL),
(34, '35cg4', 'Dimitrios Malonas', 'dimitriosmalonas@outlook.com', 'Priory Street', 'Sun Mar 26 00:00:00 GMT 2017', 1, 'George Elliott', 1, 'Fri Mar 10 00:00:00 GMT 2017', '12:00', 'London East', '1 winch launch', 1, '0h 0m', '', ''),
(35, 'arf9l', 'Dimitrios Malonas', 'dimitriosmalonas@outlook.com', 'Priory Street', 'Sun Mar 26 00:00:00 GMT 2017', 1, 'George Elliotte', 0, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL),
(36, 'yuk9i', 'Dimitrios Malonas', 'dimitriosmalonas@outlook.com', 'Priory Street', 'Sun Mar 26 23:51:52 BST 2017', 1, 'George Elliotte ', 0, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL),
(52, '1legz', 'Dimitrios Malonas', 'md@coventry.ac.uk', 'Priory Road', 'Mon Mar 27 00:00:00 BST 2017', 0, 'null', 0, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL),
(38, 'febpf', 'Dimitrios Malonas', 'dimitriosmalonas@outlook.com', 'Birmingham Street', 'Tue Mar 28 00:00:00 BST 2017', 1, 'George Elliotte', 0, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL),
(39, 'xtjfw', 'Dimitrios Malonas', 'dimitiosmalonas@outlook.com', 'Birmingham Street', 'Wed Mar 29 00:00:00 BST 2017', 0, 'null', 0, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL),
(40, 'fmon4', 'Dimitrios Malonas', 'dimitriosmalonas@outlook.com', 'Birmingham Road', 'Thu Mar 16 00:00:00 GMT 2017', 0, 'null', 0, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL),
(41, 'ry6pd', 'Dimitrios Malonas', 'dimitriosmalonas@outlook.com', 'Birmingham Road', 'Tue Mar 28 00:00:00 BST 2017', 0, 'null', 0, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL),
(42, 'lk2n6', 'Dimitrios Malonas', 'dimitriosmalonas@outlook.com', 'Birmingham Road', 'Sat Mar 11 00:00:00 GMT 2017', 0, 'null', 0, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL),
(43, '9yr3k', 'Dimitrios Malonnas', 'dimitriosmalonas@outlook.com', 'Birmigham Road ', 'Wed Mar 29 00:00:00 BST 2017', 0, 'null', 0, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL),
(44, '4vzuy', 'Dimitrios Malonas', 'dimitriosmalonas@outlook.com', 'Birmingham Street', 'Fri Mar 17 00:00:00 GMT 2017', 0, 'null', 0, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL),
(45, 'l1y2t', 'Dimitrios Malonas', 'dimitriosmalonas@outlook.com', 'Birmingham Road', 'Wed Mar 22 00:00:00 GMT 2017', 0, 'null', 0, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL),
(46, 'w5uyk', 'Dimitrios Malonas', 'dm@outlook.com', 'Birmingham Road', 'Mon Mar 27 13:48:04 BST 2017', 0, 'null', 0, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL),
(47, 'svc5i', 'Dimitrios Malonas', 'dimitr@outlook.com', 'Priory Street', 'Thu Mar 09 00:00:00 GMT 2017', 1, 'John Smith', 0, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL),
(48, 'a73kn', 'Dimitrios Malonas', 'dm@coventry.ac.uk', 'Birmingham Street', 'Tue Mar 28 00:00:00 BST 2017', 0, 'null', 1, 'Fri Mar 24 00:00:00 GMT 2017', '12:00', 'Coventry Club', '1 aerotow to 3000ft', 1, '1h 0m', 'AB00', 'Johnn Edwards'),
(50, 'as4at', 'Kostas Malonas', 'dm@hotmail.com', 'Priory Street', 'Mon Mar 27 15:59:45 BST 2017', 1, 'Dimitrios Malonas', 0, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL),
(51, '9a5b7', 'Dimitrios Malonas', 'md@yahoo.com', 'Birmingham road', 'Mon Mar 27 00:00:00 BST 2017', 0, 'null', 0, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `clubs`
--
ALTER TABLE `clubs`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `ID` (`ID`);

--
-- Indexes for table `vouchers`
--
ALTER TABLE `vouchers`
  ADD UNIQUE KEY `ID` (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `clubs`
--
ALTER TABLE `clubs`
  MODIFY `ID` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `vouchers`
--
ALTER TABLE `vouchers`
  MODIFY `ID` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=56;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
