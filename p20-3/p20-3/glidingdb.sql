-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Φιλοξενητής: 127.0.0.1
-- Χρόνος δημιουργίας: 20 Μαρ 2017 στις 21:17:11
-- Έκδοση διακομιστή: 5.7.14
-- Έκδοση PHP: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Βάση δεδομένων: `glidingdb`
--

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `clubs`
--

CREATE TABLE `clubs` (
  `ID` bigint(20) UNSIGNED NOT NULL,
  `NAME` varchar(20) NOT NULL,
  `AEROTOW` tinyint(1) NOT NULL,
  `WINCH` tinyint(1) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Άδειασμα δεδομένων του πίνακα `clubs`
--

INSERT INTO `clubs` (`ID`, `NAME`, `AEROTOW`, `WINCH`) VALUES
(1, 'Coventry Club', 1, 1),
(2, 'London Club', 1, 0),
(3, 'Manchester', 0, 0),
(4, 'London East', 1, 1);

-- --------------------------------------------------------

--
-- Δομή πίνακα για τον πίνακα `vouchers`
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
  `FLIGHT_DURATION` int(11) DEFAULT NULL,
  `GLIDER_NUMBER` varchar(10) DEFAULT NULL,
  `GLIDING_INSTRUCTOR` varchar(40) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Άδειασμα δεδομένων του πίνακα `vouchers`
--

INSERT INTO `vouchers` (`ID`, `CODE`, `CUSTOMER_NAME`, `CUSTOMER_EMAIL_ADDRESS`, `DELIVERY_ADDRESS`, `PURCHASE_DATE`, `GIFT`, `GIFT_RECIPIENT_NAME`, `REDEEMED`, `FLIGHT_DATE`, `FLIGHT_TIME`, `CLUB`, `FLIGHT_TYPE`, `COMPLETED`, `FLIGHT_DURATION`, `GLIDER_NUMBER`, `GLIDING_INSTRUCTOR`) VALUES
(1, 'aaaaa', 'Dimitrios Malonas', 'dimitriosmalonas@outlook.com', '', '2017-03-14', 1, 'Zanete Asmane', 1, 'Wed Mar 22 00:00:00 EET 2017', '08:00', 'Coventry Club', 'Motor powered', 0, NULL, NULL, NULL),
(2, 'bbbbb', 'Chris Bass', 'chrisBass@ac.coventry.ac.uk', '', '2017-03-14', 0, NULL, 0, NULL, '', '', NULL, 0, NULL, NULL, NULL),
(3, 'ccccc', 'Panos Abatis', 'panosAbatis@coventry.ac.uk', '', '2017-03-14', 0, NULL, 0, NULL, '', '', NULL, 0, NULL, NULL, NULL),
(4, 'ddddd', 'Godwin Enoch', 'godwinEnoch@coventry.ac.uk', '', '2017-03-14', 1, 'Marin Alexandrov', 0, NULL, '', '', NULL, 0, NULL, NULL, NULL),
(5, 'abxzb', 'erv', 'te4bv r3v', '', 'Wed Mar 15 00:00:00 EET 2017', 0, 'null', 0, NULL, '', '', NULL, 0, NULL, NULL, NULL),
(6, 'vbgn0', 'erv ev', 'lj3rnf', '', 'Thu Mar 30 00:00:00 EEST 2017', 1, 'wkerufn oweufen', 1, 'Wed Mar 15 00:00:00 EET 2017', '10:00', 'Manchester', 'Motor powered', 0, NULL, NULL, NULL),
(7, 'yppij', 'Dimitrios Lamonas', 'whatever@mydomain.com', '', 'Sun Mar 19 00:00:00 EET 2017', 1, 'Lucky girl', 1, 'Tue Mar 21 00:00:00 EET 2017', '12:00', 'Manchester', 'Motor powered', 0, NULL, NULL, NULL),
(8, 'rolxw', 'wef', 'wrg', '', 'Mon Mar 13 00:00:00 EET 2017', 0, 'null', 0, NULL, '', '', NULL, 0, NULL, NULL, NULL),
(9, 'rolxw', 'wef', 'wrg', '', 'Mon Mar 13 00:00:00 EET 2017', 0, 'null', 0, NULL, '', '', NULL, 0, NULL, NULL, NULL),
(10, '8apm0', 'ppp', 'fff', '', 'Thu Mar 23 00:00:00 EET 2017', 0, 'null', 0, NULL, '', '', NULL, 0, NULL, NULL, NULL),
(11, '8apm0', 'ppp', 'fff', '', 'Thu Mar 23 00:00:00 EET 2017', 0, 'null', 0, NULL, '', '', NULL, 0, NULL, NULL, NULL),
(12, 'nbx08', 'Manolis', 'aaa@www.it', '', 'Fri Mar 31 00:00:00 EEST 2017', 1, 'Dimitris', 0, NULL, '', '', NULL, 0, NULL, NULL, NULL),
(13, 'w6eoq', 'Hello Glide', 'www@ooo.com', '', 'Mon Mar 20 00:00:00 EET 2017', 1, 'M', 0, NULL, '', '', NULL, 0, NULL, NULL, NULL),
(14, 'i7bze', 'eqg', 'q5y', 'qe5', 'Thu Mar 09 00:00:00 EET 2017', 0, 'null', 0, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL),
(15, 'jh71c', 'qe54tg', 'ew54y', 'eq54y', 'Wed Mar 22 00:00:00 EET 2017', 1, '3qw4t', 0, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL),
(16, '1coxg', 'tt', 'tt', 'tt', 'Wed Mar 01 00:00:00 EET 2017', 0, 'null', 0, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL),
(17, 'rp3f9', 'PPP', 'YYY', 'LLL', 'Tue Mar 07 00:00:00 EET 2017', 0, 'null', 0, NULL, NULL, NULL, NULL, 0, NULL, NULL, NULL);

--
-- Ευρετήρια για άχρηστους πίνακες
--

--
-- Ευρετήρια για πίνακα `clubs`
--
ALTER TABLE `clubs`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `ID` (`ID`);

--
-- Ευρετήρια για πίνακα `vouchers`
--
ALTER TABLE `vouchers`
  ADD UNIQUE KEY `ID` (`ID`);

--
-- AUTO_INCREMENT για άχρηστους πίνακες
--

--
-- AUTO_INCREMENT για πίνακα `clubs`
--
ALTER TABLE `clubs`
  MODIFY `ID` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT για πίνακα `vouchers`
--
ALTER TABLE `vouchers`
  MODIFY `ID` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
