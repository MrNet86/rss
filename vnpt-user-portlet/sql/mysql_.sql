CREATE TABLE `egov_portal_app`.`eportal_permission_type` (
  `permissionTypeId` BIGINT(20) NOT NULL,
  `groupId` BIGINT(20) NULL,
  `companyId` BIGINT(20) NULL,
  `typeName` NVARCHAR(100) NULL,
  `typeCode` NVARCHAR(50) NULL,
  `isActive` INT NULL,
  PRIMARY KEY (`permissionTypeId`))
COMMENT = 'Bảng loại nhóm quyền';