-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.7.11-log - MySQL Community Server (GPL)
-- Server OS:                    Win64
-- HeidiSQL Version:             9.3.0.4984
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Dumping structure for table test.tbl_artists
CREATE TABLE IF NOT EXISTS `tbl_artists` (
  `clientID` varchar(50) NOT NULL,
  `lang` varchar(50) NOT NULL,
  `title` varchar(50) NOT NULL,
  `artistID` varchar(50) NOT NULL,
  `firstName` varchar(50) NOT NULL,
  `lastNamePrefix` varchar(50) DEFAULT NULL,
  `artistName` varchar(50) NOT NULL,
  `searchInfo` varchar(50) DEFAULT NULL,
  `receivedDate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table test.tbl_artists: ~6 rows (approximately)
/*!40000 ALTER TABLE `tbl_artists` DISABLE KEYS */;
INSERT INTO `tbl_artists` (`clientID`, `lang`, `title`, `artistID`, `firstName`, `lastNamePrefix`, `artistName`, `searchInfo`, `receivedDate`) VALUES
	('12345', 'EN', 'Artist album title is TEST', '01001057817', 'Sam', '', 'Cooke', '', '2011-05-06'),
	('67890', 'FR', 'Artist album title is TEST2', '71875010010', 'Richard', '', 'Williams', '', '2015-01-02'),
	('42531', 'EN', 'Artist album title is TEST3', '23567412533', 'Mark', '', 'John', '', '2016-07-08'),
	('99954', 'FR', 'Artist album title is TEST4', '45698712', 'Jane', '', 'Mark', '', '2012-11-10'),
	('44055', 'FR', 'Artist album title is TEST5', '32541568784', 'James', '', 'Smith', '', '2013-12-24'),
	('66155', 'EN', 'Artist album title is TEST6', '75684213495', 'Thomas', '', 'Hardy', '', '2014-08-19');
/*!40000 ALTER TABLE `tbl_artists` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
