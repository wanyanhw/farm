/*
 Navicat MySQL Data Transfer

 Source Server         : 00本地
 Source Server Type    : MySQL
 Source Server Version : 50710
 Source Host           : localhost:3306
 Source Schema         : my_farm

 Target Server Type    : MySQL
 Target Server Version : 50710
 File Encoding         : 65001

 Date: 02/03/2023 21:01:02
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for content
-- ----------------------------
DROP TABLE IF EXISTS `content`;
CREATE TABLE `content`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '素材名称',
  `type` int(2) NOT NULL COMMENT '素材类型（1-图片，2-视频）',
  `url` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '存储地址',
  `thumb_url` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '缩略图地址',
  `module` int(2) NOT NULL COMMENT '引用模块（1-用户引用，2-农场引用，3-土地引用）',
  `module_id` int(11) NOT NULL COMMENT '引用模块ID',
  `create_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  `deleted` bit(1) NOT NULL DEFAULT b'0' COMMENT '删除标识（0-未删除，1-已删除）',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `IDX_CONTENT_1`(`module`, `module_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '素材信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for farm_comment
-- ----------------------------
DROP TABLE IF EXISTS `farm_comment`;
CREATE TABLE `farm_comment`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `farm_id` int(11) NOT NULL COMMENT '农场ID',
  `user_id` int(11) NOT NULL COMMENT '用户ID',
  `level` int(1) NOT NULL COMMENT '等级（1-最差，2-较差，3-一般，4-良好，5-非常好）',
  `message` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '评论内容',
  `reply_comment_id` int(11) NULL DEFAULT NULL COMMENT '回复评论消息ID',
  `create_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  `deleted` bit(1) NOT NULL DEFAULT b'0' COMMENT '删除标识（0-未删除，1-已删除）',
  PRIMARY KEY (`id`, `update_time`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '农场评价信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for farm_info
-- ----------------------------
DROP TABLE IF EXISTS `farm_info`;
CREATE TABLE `farm_info`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `number` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '编号',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '名称',
  `head_pic` int(11) NULL DEFAULT NULL COMMENT '头像图片ID',
  `bg_pic` int(11) NULL DEFAULT NULL COMMENT '背景图片ID',
  `owner` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '拥有人',
  `area` double NULL DEFAULT NULL COMMENT '占地面积',
  `information` varchar(2000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '简介',
  `open` bit(1) NOT NULL DEFAULT b'0' COMMENT '开放状态（0-关闭，1-开放）',
  `remark` varchar(1000) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注信息',
  `create_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  `deleted` bit(1) NOT NULL DEFAULT b'0' COMMENT '删除标识（0-未删除，1-已删除）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '农场基本信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for land_info
-- ----------------------------
DROP TABLE IF EXISTS `land_info`;
CREATE TABLE `land_info`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `farm_id` int(11) NOT NULL COMMENT '农场ID',
  `number` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '编号',
  `name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '名称',
  `head_pic` int(11) NULL DEFAULT NULL COMMENT '头像图片ID',
  `bg_pic` int(11) NULL DEFAULT NULL COMMENT '背景图片ID',
  `length` double NOT NULL COMMENT '长度',
  `width` double NOT NULL COMMENT '宽度',
  `location` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '位置',
  `price` decimal(10, 2) NOT NULL DEFAULT 0.00 COMMENT '价格',
  `discount_price` decimal(10, 2) NULL DEFAULT NULL COMMENT '折扣价',
  `open` bit(1) NOT NULL DEFAULT b'0' COMMENT '开放状态（0-关闭，1-开放）',
  `create_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  `deleted` bit(1) NOT NULL DEFAULT b'0' COMMENT '删除标识（0-未删除，1-已删除）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '土地基本信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user_farm_binding
-- ----------------------------
DROP TABLE IF EXISTS `user_farm_binding`;
CREATE TABLE `user_farm_binding`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `farm_id` int(11) NOT NULL COMMENT '农场ID',
  `land_id` int(11) NULL DEFAULT NULL COMMENT '土地ID',
  `user_id` int(11) NOT NULL COMMENT '用户ID',
  `role_id` int(11) NULL DEFAULT NULL COMMENT '角色ID',
  `binding_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '绑定时间',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `IDX_USER_BINDING`(`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '账号绑定信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `account` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '登录账号',
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '客户名称',
  `password` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `type` int(1) NULL DEFAULT NULL COMMENT '用户类型（1-农场主，2-客户）',
  `gender` int(1) NULL DEFAULT NULL COMMENT '性别（1-男，2-女）',
  `phone_number` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '手机号',
  `address` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '地址',
  `create_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  `deleted` bit(1) NOT NULL DEFAULT b'0' COMMENT '删除标识（0-未删除，1-已删除）',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `IDX_USER_INFO_1`(`account`, `password`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户基本信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user_order
-- ----------------------------
DROP TABLE IF EXISTS `user_order`;
CREATE TABLE `user_order`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `user_id` int(11) NOT NULL COMMENT '用户ID',
  `number` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '订单编号',
  `item_type` int(1) NOT NULL COMMENT '商品类型（1-土地租赁，2-种子购买）',
  `item_id` int(11) NOT NULL COMMENT '商品ID',
  `payment` double NOT NULL COMMENT '付款额',
  `status` int(1) NOT NULL COMMENT '支付状态（0-未支付，1-已支付，2-已取消）',
  `remark` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注信息',
  `create_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `update_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间',
  `deleted` bit(1) NOT NULL DEFAULT b'0' COMMENT '删除标识（0-未删除，1-已删除）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户订单表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for wechat_user_info
-- ----------------------------
DROP TABLE IF EXISTS `wechat_user_info`;
CREATE TABLE `wechat_user_info`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `nick_name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '昵称',
  `account` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '微信账号',
  `open_id` int(11) NOT NULL COMMENT 'openID',
  `gender` int(1) NULL DEFAULT NULL COMMENT '性别（1-男，2-女）',
  `user_id` int(11) NULL DEFAULT NULL COMMENT '用户ID',
  `create_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `deleted` bit(1) NOT NULL DEFAULT b'0' COMMENT '删除标识（0-未删除，1-已删除）',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '微信用户信息表' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
