CREATE DATABASE `quanlysach` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin */ /*!80016 DEFAULT ENCRYPTION='N' */;
CREATE TABLE `tblchitietsach` (
  `MaSach` varchar(10) COLLATE utf8_bin NOT NULL,
  `MaCaBiet` varchar(10) COLLATE utf8_bin NOT NULL,
  `TinhTrangSach` tinyint(1) DEFAULT NULL,
  `TinhTrangPhucVu` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`MaCaBiet`),
  KEY `fk_chitiet_sach` (`MaSach`),
  CONSTRAINT `fk_chitiet_sach` FOREIGN KEY (`MaSach`) REFERENCES `tblsach` (`MaSach`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

CREATE TABLE `tbldocgia` (
  `SoThe` varchar(10) COLLATE utf8_bin NOT NULL,
  `HoTen` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `DVCT` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`SoThe`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

CREATE TABLE `tblsachmuon` (
  `SoThe` varchar(10) COLLATE utf8_bin NOT NULL,
  `MaCaBiet` varchar(10) COLLATE utf8_bin DEFAULT NULL,
  `NgayMuon` datetime DEFAULT NULL,
  `NgayPhaiTra` datetime DEFAULT NULL,
  `NgayTra` datetime DEFAULT NULL,
  PRIMARY KEY (`SoThe`),
  KEY `fk_sachmuon_cabiet` (`MaCaBiet`),
  CONSTRAINT `fk_sachmuon_cabiet` FOREIGN KEY (`MaCaBiet`) REFERENCES `tblchitietsach` (`MaCaBiet`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

CREATE TABLE `tblsach` (
  `MaSach` varchar(10) COLLATE utf8_bin NOT NULL,
  `TuSach` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `SoTrang` int DEFAULT NULL,
  `MaTG` varchar(10) COLLATE utf8_bin DEFAULT NULL,
  `NamXB` int DEFAULT NULL,
  `TuKhoa` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `NXB` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`MaSach`),
  KEY `fk_tg_sach_idx` (`MaTG`),
  CONSTRAINT `fk_sach_tg` FOREIGN KEY (`MaTG`) REFERENCES `tbltacgia` (`MaTG`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

CREATE TABLE `tblsachtg` (
  `MaSach` varchar(10) COLLATE utf8_bin NOT NULL,
  `MaTG` varchar(10) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`MaSach`,`MaTG`),
  KEY `fk_sachtg_tg` (`MaTG`),
  CONSTRAINT `fk_sachtg_sach` FOREIGN KEY (`MaSach`) REFERENCES `tblsach` (`MaSach`),
  CONSTRAINT `fk_sachtg_tg` FOREIGN KEY (`MaTG`) REFERENCES `tbltacgia` (`MaTG`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

CREATE TABLE `tbltacgia` (
  `MaTG` varchar(10) COLLATE utf8_bin NOT NULL,
  `TenTG` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  `DCLienHe` varchar(45) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`MaTG`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
