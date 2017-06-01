/*
Navicat MySQL Data Transfer

Source Server         : distance
Source Server Version : 50718
Source Host           : 139.199.74.115:3306
Source Database       : students

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2017-06-01 15:07:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for student1
-- ----------------------------
DROP TABLE IF EXISTS `student1`;
CREATE TABLE `student1` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `qq` varchar(11) DEFAULT NULL,
  `type` varchar(20) DEFAULT NULL,
  `time` bigint(20) DEFAULT NULL,
  `school` varchar(20) DEFAULT NULL,
  `online_id` int(11) DEFAULT NULL,
  `wish` char(50) DEFAULT NULL,
  `rec_senior` varchar(20) DEFAULT NULL,
  `create_at` bigint(20) DEFAULT NULL,
  `update_at` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student1
-- ----------------------------
INSERT INTO `student1` VALUES ('4', '小白', null, 'java', '20170516', '华师', '111', '11111', '111', '111', '111');
INSERT INTO `student1` VALUES ('5', '小白', null, 'java', '20170516', '华师', '111', '11111', '111', '111', '111');
INSERT INTO `student1` VALUES ('6', '小白', null, 'java', '20170516', '华师', '111', '11111', '111', '111', '111');
INSERT INTO `student1` VALUES ('7', '小白', null, 'java', '20170516', '华师', '111', '11111', '111', '111', null);
INSERT INTO `student1` VALUES ('8', '小白', null, 'java', '20170516', '华师', '111', '11111', '111', '111', '111');
INSERT INTO `student1` VALUES ('9', '小白', null, 'java', '20170516', '华师', '111', '11111', '111', '111', '111');
INSERT INTO `student1` VALUES ('10', '小白', null, 'java', '20170516', '华师', '111', '11111', '111', '111', '111');
INSERT INTO `student1` VALUES ('11', '小白', null, 'java', '20170516', '华师', '111', '11111', '111', '111', '111');
INSERT INTO `student1` VALUES ('12', '小白', null, 'java', '20170516', '华师', '111', '11111', '111', '111', '111');
INSERT INTO `student1` VALUES ('13', '小白', null, 'java', '20170516', '华师', '111', '11111', '111', '111', '111');
INSERT INTO `student1` VALUES ('14', '小白', null, 'java', '20170516', '华师', '111', '11111', '111', '111', '111');
INSERT INTO `student1` VALUES ('15', '小红', null, 'java', '20170516', '华师', '111', '11111', '111', '111', '111');
INSERT INTO `student1` VALUES ('16', '小红', null, 'java', '20170516', '华师', '111', '11111', '111', '111', '111');
INSERT INTO `student1` VALUES ('17', '小黑', null, 'java', '20170516', '华师', '111', '11111', '111', '111', '1495847423896');
INSERT INTO `student1` VALUES ('18', '小红', null, 'java', '20170516', '华师', '111', '11111', '111', '111', '0');
