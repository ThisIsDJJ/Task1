/*
Navicat MySQL Data Transfer

Source Server         : distance
Source Server Version : 50718
Source Host           : 139.199.74.115:3306
Source Database       : students

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2017-06-01 14:48:04
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for entry_form
-- ----------------------------
DROP TABLE IF EXISTS `entry_form`;
CREATE TABLE `entry_form` (
  `id` bigint(20) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `qq` int(11) DEFAULT NULL,
  `profession` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `entry_form` VALUES (null, '1', '123456', 'java');
INSERT INTO `entry_form` VALUES (null, '2', '123456', 'java');