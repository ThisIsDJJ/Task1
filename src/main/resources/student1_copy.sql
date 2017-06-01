/*
Navicat MySQL Data Transfer

Source Server         : distance
Source Server Version : 50718
Source Host           : 139.199.74.115:3306
Source Database       : students

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2017-06-01 14:47:02
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for student1_copy
-- ----------------------------
DROP TABLE IF EXISTS `student1_copy`;
CREATE TABLE `student1_copy` (
  `id` int(11) DEFAULT NULL,
  `name` varchar(20) DEFAULT NULL,
  `type` varchar(20) DEFAULT NULL,
  `time` date DEFAULT NULL,
  `school` varchar(20) DEFAULT NULL,
  `online_id` int(11) DEFAULT NULL,
  `wish` varchar(20) DEFAULT NULL,
  `rec_senior` varchar(20) DEFAULT NULL,
  `create_at` varchar(20) DEFAULT NULL,
  `update_at` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student1_copy
-- ----------------------------
INSERT INTO `student1_copy` VALUES ('1', 'Ð¡°×', 'java', '2017-05-16', 'hust', '111', '11111', '111', '20170522', '2017-05-22');
INSERT INTO `student1_copy` VALUES ('1', 'Ð¡°×', 'java', '2017-05-16', 'hust', '111', '11111', '111', '20170522', '2017-05-22');