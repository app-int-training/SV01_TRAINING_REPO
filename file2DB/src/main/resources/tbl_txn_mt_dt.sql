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

-- Dumping structure for table test.tbl_txn_mt_dt
CREATE TABLE IF NOT EXISTS `tbl_txn_mt_dt` (
  `TXN_UID` int(255) NOT NULL AUTO_INCREMENT,
  `TRNSFR_TTL` float NOT NULL,
  `CRTD_DT` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `UPTD_DT` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`TXN_UID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- Dumping data for table test.tbl_txn_mt_dt: ~1 rows (approximately)
/*!40000 ALTER TABLE `tbl_txn_mt_dt` DISABLE KEYS */;
INSERT INTO `tbl_txn_mt_dt` (`TXN_UID`, `TRNSFR_TTL`, `CRTD_DT`, `UPTD_DT`) VALUES
	(1, 324074, '2016-05-02 12:02:57', '2016-05-02 12:02:57');
/*!40000 ALTER TABLE `tbl_txn_mt_dt` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
