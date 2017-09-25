-- ----------------------------
-- Table structure for eportal_group_role
-- ----------------------------
DROP TABLE IF EXISTS `eportal_group_role`;
CREATE TABLE `eportal_group_role`  (
  `permissionGroupId` bigint(20) NOT NULL,
  `roleId` bigint(20) NOT NULL,
  PRIMARY KEY (`permissionGroupId`, `roleId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;


-- ----------------------------
-- Table structure for eportal_permission_group
-- ----------------------------
DROP TABLE IF EXISTS `eportal_permission_group`;
CREATE TABLE `eportal_permission_group`  (
  `permissionGroupId` bigint(20) NOT NULL,
  `groupId` bigint(20) NULL DEFAULT NULL,
  `companyId` bigint(20) NULL DEFAULT NULL,
  `groupName` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `groupCode` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `isActive` int(1) NULL DEFAULT NULL,
  PRIMARY KEY (`permissionGroupId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;


-- ----------------------------
-- Table structure for eportal_group_users
-- ----------------------------
DROP TABLE IF EXISTS `eportal_group_users`;
CREATE TABLE `eportal_group_users`  (
  `permissionGroupId` bigint(20) NOT NULL,
  `userId` bigint(20) NOT NULL,
  PRIMARY KEY (`permissionGroupId`, `userId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;




