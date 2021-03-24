/*
SQLyog Ultimate v11.27 (32 bit)
MySQL - 5.5.20-log : Database - dragonfly
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`dragonfly` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `dragonfly`;

/*Table structure for table `t_action` */

DROP TABLE IF EXISTS `t_action`;

CREATE TABLE `t_action` (
  `ACTION_ID` int(11) NOT NULL,
  `ACTION_NAME_CN` varchar(60) CHARACTER SET utf8 DEFAULT NULL,
  `ACTION_NAME_EN` varchar(60) DEFAULT NULL,
  `ACTION_CODE` varchar(40) DEFAULT NULL COMMENT 'Action code for the action name.',
  `ACTION_COLUMN_ID` int(11) DEFAULT NULL COMMENT '???ID, COLUMN ID',
  `VIEWMODE` varchar(10) DEFAULT NULL COMMENT 'is visible or not',
  `AVAILBE` varchar(10) DEFAULT NULL COMMENT 'is useable or not',
  `REMARK` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`ACTION_ID`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AVG_ROW_LENGTH=1489;

/*Data for the table `t_action` */

/*Table structure for table `t_action_group` */

DROP TABLE IF EXISTS `t_action_group`;

CREATE TABLE `t_action_group` (
  `AG_ID` int(11) NOT NULL AUTO_INCREMENT,
  `ACTION_CODE` varchar(40) DEFAULT NULL,
  `GROUP_ID` int(11) DEFAULT NULL,
  `CREATOR_ID` int(11) DEFAULT NULL,
  `CREATOR_NAME_CN` varchar(40) DEFAULT NULL,
  `CREATOR_NAME_EN` varchar(40) DEFAULT NULL,
  `CREATE_DATETIME` datetime DEFAULT NULL,
  `REMARK` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`AG_ID`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AVG_ROW_LENGTH=1024;

/*Data for the table `t_action_group` */

/*Table structure for table `t_column` */

DROP TABLE IF EXISTS `t_column`;

CREATE TABLE `t_column` (
  `COLUMN_ID` int(11) NOT NULL COMMENT 'It is column identifier',
  `seq_id` int(11) DEFAULT NULL,
  `COLUMN_NAME_CN` varchar(60) CHARACTER SET utf8 DEFAULT NULL,
  `COLUMN_NAME_EN` varchar(60) CHARACTER SET utf8 DEFAULT NULL,
  `COLUMN_CODE` varchar(20) CHARACTER SET utf8 DEFAULT NULL,
  `PARENT_ID` int(11) DEFAULT NULL,
  `ACCESS_URL` varchar(150) CHARACTER SET utf8 DEFAULT NULL,
  `REMARK` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`COLUMN_ID`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AVG_ROW_LENGTH=1024 COMMENT='?????? column table.';

/*Data for the table `t_column` */

/*Table structure for table `t_customer` */

DROP TABLE IF EXISTS `t_customer`;

CREATE TABLE `t_customer` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `customer_name` varchar(45) COLLATE utf8_swedish_ci DEFAULT NULL,
  `customer_code` varchar(20) COLLATE utf8_swedish_ci DEFAULT NULL,
  `address_code` varchar(30) COLLATE utf8_swedish_ci DEFAULT NULL,
  `pickup_address_code` varchar(30) COLLATE utf8_swedish_ci DEFAULT NULL,
  `country_code` varchar(10) COLLATE utf8_swedish_ci DEFAULT NULL,
  `city_code` varchar(10) COLLATE utf8_swedish_ci DEFAULT NULL,
  `address1` varchar(80) COLLATE utf8_swedish_ci DEFAULT NULL,
  `address2` varchar(80) COLLATE utf8_swedish_ci DEFAULT NULL,
  `address3` varchar(80) COLLATE utf8_swedish_ci DEFAULT NULL,
  `address4` varchar(80) COLLATE utf8_swedish_ci DEFAULT NULL,
  `address5` varchar(80) COLLATE utf8_swedish_ci DEFAULT NULL,
  `remark` varchar(100) COLLATE utf8_swedish_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_swedish_ci;

/*Data for the table `t_customer` */

/*Table structure for table `t_group` */

DROP TABLE IF EXISTS `t_group`;

CREATE TABLE `t_group` (
  `GROUP_ID` int(11) NOT NULL,
  `GROUP_NAME_CN` varchar(40) CHARACTER SET utf8 DEFAULT NULL,
  `GROUP_NAME_EN` varchar(40) DEFAULT NULL,
  `GROUP_INFO` varchar(150) DEFAULT NULL,
  `CREATOR_ID` int(11) DEFAULT NULL,
  `CREATE_NAME_CN` varchar(40) DEFAULT NULL,
  `CREATE_NAME_EN` varchar(40) DEFAULT NULL,
  `CREATE_DATE` datetime DEFAULT NULL,
  PRIMARY KEY (`GROUP_ID`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AVG_ROW_LENGTH=5461;

/*Data for the table `t_group` */

/*Table structure for table `t_osrn` */

DROP TABLE IF EXISTS `t_osrn`;

CREATE TABLE `t_osrn` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `shipment_no` varchar(20) COLLATE utf8_swedish_ci DEFAULT NULL,
  `po_number` varchar(20) COLLATE utf8_swedish_ci NOT NULL,
  `SAPSNumber` varchar(20) COLLATE utf8_swedish_ci NOT NULL,
  `MSN` varchar(20) COLLATE utf8_swedish_ci DEFAULT NULL,
  `Lot_Number` varchar(25) COLLATE utf8_swedish_ci DEFAULT NULL,
  `manufacturing_date` varchar(20) COLLATE utf8_swedish_ci DEFAULT NULL,
  `pallet_number` varchar(20) COLLATE utf8_swedish_ci DEFAULT NULL,
  `carton_numver` varchar(20) COLLATE utf8_swedish_ci DEFAULT NULL,
  `imei1` varchar(20) COLLATE utf8_swedish_ci DEFAULT NULL,
  `imei2` varchar(20) COLLATE utf8_swedish_ci DEFAULT NULL,
  `imei3` varchar(20) COLLATE utf8_swedish_ci DEFAULT NULL,
  `meidesn` varchar(20) COLLATE utf8_swedish_ci DEFAULT NULL,
  `eanupc` varchar(20) COLLATE utf8_swedish_ci DEFAULT NULL,
  `bluetoothAddress` varchar(20) COLLATE utf8_swedish_ci DEFAULT NULL,
  `wifimac` varchar(20) COLLATE utf8_swedish_ci DEFAULT NULL,
  `battersn` varchar(20) COLLATE utf8_swedish_ci DEFAULT NULL,
  `simno` varchar(20) COLLATE utf8_swedish_ci DEFAULT NULL,
  `software_version` varchar(100) COLLATE utf8_swedish_ci DEFAULT NULL,
  `DCKEY` varchar(20) COLLATE utf8_swedish_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_swedish_ci AVG_ROW_LENGTH=413;

/*Data for the table `t_osrn` */

/*Table structure for table `t_product` */

DROP TABLE IF EXISTS `t_product`;

CREATE TABLE `t_product` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `product_name` varchar(30) COLLATE utf8_swedish_ci DEFAULT NULL,
  `product_code` varchar(20) COLLATE utf8_swedish_ci DEFAULT NULL,
  `product_type` varchar(20) COLLATE utf8_swedish_ci DEFAULT NULL,
  `product_desc` varchar(50) COLLATE utf8_swedish_ci DEFAULT NULL,
  `att_no` varchar(20) COLLATE utf8_swedish_ci DEFAULT NULL,
  `sonim_no` varchar(20) COLLATE utf8_swedish_ci DEFAULT NULL,
  `upc` varchar(20) COLLATE utf8_swedish_ci DEFAULT NULL,
  `sku` varchar(20) COLLATE utf8_swedish_ci DEFAULT NULL,
  `no_per_carton` int(11) DEFAULT NULL,
  `color_box_weight` float DEFAULT NULL,
  `mid_box_weight` float DEFAULT NULL,
  `total_weight` float DEFAULT NULL,
  `remark` varchar(100) COLLATE utf8_swedish_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_swedish_ci;

/*Data for the table `t_product` */

/*Table structure for table `t_segment_controller` */

DROP TABLE IF EXISTS `t_segment_controller`;

CREATE TABLE `t_segment_controller` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `shipment_no` varchar(20) COLLATE utf8_swedish_ci NOT NULL,
  `file_control_no` varchar(9) COLLATE utf8_swedish_ci NOT NULL,
  `gs_control_no` varchar(9) COLLATE utf8_swedish_ci NOT NULL,
  `st_control_no` varchar(9) COLLATE utf8_swedish_ci NOT NULL,
  `se_control_no` varchar(9) COLLATE utf8_swedish_ci NOT NULL,
  `ge_control_no` varchar(9) COLLATE utf8_swedish_ci NOT NULL,
  `iea_control_no` varchar(9) COLLATE utf8_swedish_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_swedish_ci;

/*Data for the table `t_segment_controller` */

/*Table structure for table `t_shipment` */

DROP TABLE IF EXISTS `t_shipment`;

CREATE TABLE `t_shipment` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `shipment_no` varchar(20) COLLATE utf8_swedish_ci DEFAULT NULL,
  `customer_code` varchar(20) COLLATE utf8_swedish_ci DEFAULT NULL,
  `product_code` varchar(20) COLLATE utf8_swedish_ci DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `att_po_number` varchar(20) COLLATE utf8_swedish_ci DEFAULT NULL,
  `att_po_line_num` varchar(20) COLLATE utf8_swedish_ci DEFAULT NULL,
  `shipment_number` varchar(20) COLLATE utf8_swedish_ci DEFAULT NULL,
  `po_date` date DEFAULT NULL,
  `shipment_date` date DEFAULT NULL,
  `ship_to_address_code` varchar(20) COLLATE utf8_swedish_ci DEFAULT NULL,
  `ship_to_address` varchar(150) COLLATE utf8_swedish_ci DEFAULT NULL,
  `remark` varchar(100) COLLATE utf8_swedish_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_swedish_ci;

/*Data for the table `t_shipment` */

/*Table structure for table `t_sys_user` */

DROP TABLE IF EXISTS `t_sys_user`;

CREATE TABLE `t_sys_user` (
  `USER_ID` int(11) NOT NULL,
  `PASSWD` varchar(25) DEFAULT NULL,
  `ACCESS_ID` varchar(30) DEFAULT NULL,
  `ACCESS_KEY` varchar(30) DEFAULT NULL,
  `STATUS` varchar(10) DEFAULT NULL COMMENT '0-Stop\r\n1-Normal',
  `TYPE` int(11) DEFAULT NULL COMMENT 'It is the group ID.',
  `LOGIN_IP` varchar(20) DEFAULT NULL,
  `LOGIN_TIME` datetime DEFAULT NULL,
  `SYS_REMARK` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`USER_ID`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AVG_ROW_LENGTH=4096;

/*Data for the table `t_sys_user` */

/*Table structure for table `t_user` */

DROP TABLE IF EXISTS `t_user`;

CREATE TABLE `t_user` (
  `USER_ID` int(11) NOT NULL AUTO_INCREMENT,
  `ACCOUNT` varchar(40) CHARACTER SET latin1 NOT NULL,
  `password` varchar(20) NOT NULL,
  `USER_NAME_EN` varchar(40) CHARACTER SET latin1 DEFAULT NULL,
  `USER_NAME_CN` varchar(40) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `BIRTHDAY` date DEFAULT NULL,
  `SEX` char(1) CHARACTER SET latin1 DEFAULT NULL COMMENT '1-Male\r\n0-Female',
  `OFFICE_PHONE` varchar(20) CHARACTER SET latin1 DEFAULT NULL,
  `CELL_PHONE` varchar(20) CHARACTER SET latin1 DEFAULT NULL,
  `EMAIL` varchar(30) CHARACTER SET latin1 DEFAULT NULL,
  `LANGUAGE` varchar(20) CHARACTER SET latin1 DEFAULT NULL,
  `EDUCATION` varchar(20) CHARACTER SET latin1 DEFAULT NULL,
  `PHOTO` varchar(150) CHARACTER SET latin1 DEFAULT NULL,
  `ADDRESS1` varchar(60) CHARACTER SET latin1 DEFAULT NULL,
  `ADDRESS2` varchar(60) CHARACTER SET latin1 DEFAULT NULL,
  `CREATOR_ID` int(11) DEFAULT NULL,
  `CREATOR_NAME_CN` varchar(40) CHARACTER SET latin1 DEFAULT NULL,
  `CREATOR_NAME_EN` varchar(40) CHARACTER SET latin1 DEFAULT NULL,
  `CREATE_DATETIME` datetime DEFAULT NULL,
  PRIMARY KEY (`USER_ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8 AVG_ROW_LENGTH=4096;

/*Data for the table `t_user` */

insert  into `t_user`(`USER_ID`,`ACCOUNT`,`password`,`USER_NAME_EN`,`USER_NAME_CN`,`BIRTHDAY`,`SEX`,`OFFICE_PHONE`,`CELL_PHONE`,`EMAIL`,`LANGUAGE`,`EDUCATION`,`PHOTO`,`ADDRESS1`,`ADDRESS2`,`CREATOR_ID`,`CREATOR_NAME_CN`,`CREATOR_NAME_EN`,`CREATE_DATETIME`) values (37,'admin','sonimedi','wangwei','王伟','2015-07-25','1',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `t_user_group` */

DROP TABLE IF EXISTS `t_user_group`;

CREATE TABLE `t_user_group` (
  `UG_ID` int(11) NOT NULL,
  `GROUP_ID` int(11) NOT NULL,
  `USER_ID` int(11) NOT NULL,
  `MODIFIER_ID` int(11) DEFAULT NULL,
  `MODIFY_DATE` datetime DEFAULT NULL,
  `REMARK` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`UG_ID`,`GROUP_ID`,`USER_ID`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AVG_ROW_LENGTH=5461;

/*Data for the table `t_user_group` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
