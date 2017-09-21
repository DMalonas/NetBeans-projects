-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 24, 2017 at 02:29 PM
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
(1, 'aaaaa', 'Dimitrios Malonas', 'dimitriosmalonas@outlook.com', '', '2017-03-14', 1, 'Zanete Asmane', 1, 'Wed Mar 22 00:00:00 EET 2017', '08:00', 'Coventry Club', 'Motor powered', 1, '0h 5m', 'MyGN-01', 'Peter Peterson'),
(2, 'bbbbb', 'Chris Bass', 'chrisBass@ac.coventry.ac.uk', '', '2017-03-14', 0, NULL, 1, 'Tue Mar 14 00:00:00 EET 2017', '13:00', 'Coventry Club', '1 winch launch', 0, NULL, NULL, NULL),
(19, 'b3568', '54qwyg', 'wer5yh', 'ewr5yh', 'Wed Mar 01 00:00:00 EET 2017', 1, 'ppp', 1, 'Fri Mar 24 00:00:00 EET 2017', '10:00', 'Coventry Club', '1 aerotow to 2000ft', 1, '0h 20m', 'MyGN-02', 'My Instructor'),
(4, 'ddddd', 'Godwin Enoch', 'godwinEnoch@coventry.ac.uk', '', '2017-03-14', 1, 'Marin Alexandrov', 1, 'Thu Mar 16 00:00:00 EET 2017', '13:00', 'London Club', '1 aerotow to 2000ft', 1, '1h 3m', 'ppp', 'lll'),
(5, 'abxzb', 'erv', 'te4bv r3v', '', 'Fri Mar 24 12:02:51 EET 2017', 1, 'ppp', 0, NULL, '', '', NULL, 0, NULL, NULL, NULL),
(6, 'vbgn0', 'erv ev', 'lj3rnf', '', 'Thu Mar 30 00:00:00 EEST 2017', 1, 'wkerufn oweufen', 1, 'Wed Mar 15 00:00:00 EET 2017', '10:00', 'Manchester', 'Motor powered', 0, NULL, NULL, NULL),
(20, '6e5er', 'ppppp', '', 'pppppp', 'Wed Mar 01 00:00:00 EET 2017', 0, 'null', 0, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL),
(21, '1h5ff', 'sdfh', '', 'rth', 'Fri Mar 24 12:00:15 EET 2017', 0, 'null', 0, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL),
(8, 'rolxw', 'wef', 'wrg', '', 'Mon Mar 13 00:00:00 EET 2017', 0, 'null', 0, NULL, '', '', NULL, 0, NULL, NULL, NULL),
(9, 'rolxw', 'wef', 'wrg', '', 'Mon Mar 13 00:00:00 EET 2017', 0, 'null', 0, NULL, '', '', NULL, 0, NULL, NULL, NULL),
(10, '8apm0', 'ppp', 'fff', '', 'Thu Mar 23 00:00:00 EET 2017', 0, 'null', 1, 'Wed Mar 15 00:00:00 EET 2017', '12:00', 'London East', '2 winch launches', 0, NULL, NULL, NULL),
(11, '8apm0', 'ppp', 'fff', '', 'Thu Mar 23 00:00:00 EET 2017', 0, 'null', 1, 'Wed Mar 15 00:00:00 EET 2017', '12:00', 'London East', '2 winch launches', 0, NULL, NULL, NULL),
(13, 'w6eoq', 'Hello Glide', 'www@ooo.com', '', 'Mon Mar 20 00:00:00 EET 2017', 1, 'M', 0, NULL, '', '', NULL, 0, NULL, NULL, NULL),
(14, 'i7bze', 'eqg', 'q5y', 'qe5', 'Thu Mar 09 00:00:00 EET 2017', 0, 'null', 0, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL),
(15, 'jh71c', 'qe54tg', 'ew54y', 'eq54y', 'Wed Mar 22 00:00:00 EET 2017', 1, '3qw4t', 0, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL),
(16, '1coxg', 'tt', 'tt', 'tt', 'Wed Mar 01 00:00:00 EET 2017', 0, 'null', 0, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL),
(17, 'rp3f9', 'PPP', 'YYY', 'LLL', 'Tue Mar 07 00:00:00 EET 2017', 0, 'null', 0, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL),
(18, 'gmx3q', 'qqq', 'ttt', 'www', 'Wed Mar 01 00:00:00 EET 2017', 0, 'null', 0, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL),
(22, 'ra5is', 'ppp', 'pppppppp', 'pppp', 'Fri Mar 24 12:01:34 EET 2017', 0, 'null', 0, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL),
(23, '71qvn', '', '', '', 'Fri Mar 24 12:02:10 EET 2017', 0, 'null', 0, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL);

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
  MODIFY `ID` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
