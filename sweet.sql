/*
SQLyog Ultimate v11.24 (32 bit)
MySQL - 5.6.31 : Database - sweet
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`sweet` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `sweet`;

/*Table structure for table `sweet_item` */

DROP TABLE IF EXISTS `sweet_item`;

CREATE TABLE `sweet_item` (
  `id` bigint(16) NOT NULL AUTO_INCREMENT,
  `name` varchar(128) DEFAULT NULL COMMENT '名称',
  `code` varchar(128) DEFAULT NULL COMMENT '编码',
  `max` float DEFAULT NULL COMMENT '最大值',
  `maxTime` date DEFAULT NULL COMMENT '最大值时间',
  `min` float DEFAULT NULL COMMENT '最小值',
  `minTime` date DEFAULT NULL COMMENT '最小值时间',
  `safe` float DEFAULT NULL COMMENT '安全值',
  `flagDelete` tinyint(1) DEFAULT NULL COMMENT '删除状态',
  `timeDelete` date DEFAULT NULL COMMENT '删除时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sweet_item` */

/*Table structure for table `sweet_priview` */

DROP TABLE IF EXISTS `sweet_priview`;

CREATE TABLE `sweet_priview` (
  `itemId` bigint(16) NOT NULL COMMENT '选项id',
  `p_max` float DEFAULT NULL COMMENT '预测最大值',
  `p_min` float DEFAULT NULL COMMENT '预测最小值',
  `safe` tinyint(4) DEFAULT NULL COMMENT '安全状态',
  `continue` tinyint(4) DEFAULT NULL COMMENT '是否继续',
  `begin` float DEFAULT NULL COMMENT '开始',
  `end` float DEFAULT NULL COMMENT '结束',
  PRIMARY KEY (`itemId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sweet_priview` */

/*Table structure for table `sweet_program` */

DROP TABLE IF EXISTS `sweet_program`;

CREATE TABLE `sweet_program` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `programName` varchar(64) DEFAULT NULL COMMENT '栏目名称',
  `parent` int(10) DEFAULT NULL COMMENT '父级编码',
  `timeCreate` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `sweet_program` */

insert  into `sweet_program`(`id`,`programName`,`parent`,`timeCreate`) values (1,'左侧',2,'2017-09-13 09:51:01');

/*Table structure for table `sweet_tree` */

DROP TABLE IF EXISTS `sweet_tree`;

CREATE TABLE `sweet_tree` (
  `id` bigint(20) DEFAULT NULL,
  `code` varchar(128) DEFAULT NULL,
  `parent` varchar(128) DEFAULT NULL,
  `name` varchar(156) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `sweet_tree` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
