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

-- Dumping structure for table test.tbl_txn_details
CREATE TABLE IF NOT EXISTS `tbl_txn_details` (
  `ACCNT_ID` varchar(50) NOT NULL,
  `TRNSFR_VLU` float NOT NULL,
  `CRTD_DT` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `UPTD_DT` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`ACCNT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Dumping data for table test.tbl_txn_details: ~3 rows (approximately)
/*!40000 ALTER TABLE `tbl_txn_details` DISABLE KEYS */;
INSERT INTO `tbl_txn_details` (`ACCNT_ID`, `TRNSFR_VLU`, `CRTD_DT`, `UPTD_DT`) VALUES
	('200177', 0, '2016-05-02 12:02:57', '2016-05-02 12:02:57'),
	('782088', 235015, '2016-05-02 12:02:57', '2016-05-02 12:02:57'),
	('782504', 89059.3, '2016-05-02 12:02:57', '2016-05-02 12:02:57');
/*!40000 ALTER TABLE `tbl_txn_details` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
