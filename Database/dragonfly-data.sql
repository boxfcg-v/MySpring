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

/*Data for the table `t_action` */

/*Data for the table `t_action_group` */

/*Data for the table `t_column` */

/*Data for the table `t_customer` */

/*Data for the table `t_group` */

/*Data for the table `t_osrn` */

/*Data for the table `t_product` */

/*Data for the table `t_segment_controller` */

/*Data for the table `t_shipment` */

/*Data for the table `t_sys_user` */

/*Data for the table `t_user` */

insert  into `t_user`(`USER_ID`,`ACCOUNT`,`password`,`USER_NAME_EN`,`USER_NAME_CN`,`BIRTHDAY`,`SEX`,`OFFICE_PHONE`,`CELL_PHONE`,`EMAIL`,`LANGUAGE`,`EDUCATION`,`PHOTO`,`ADDRESS1`,`ADDRESS2`,`CREATOR_ID`,`CREATOR_NAME_CN`,`CREATOR_NAME_EN`,`CREATE_DATETIME`) values (37,'admin','sonimedi','wangwei','王伟','2015-07-25','1',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);

/*Data for the table `t_user_group` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
