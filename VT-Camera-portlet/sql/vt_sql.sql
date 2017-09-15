CREATE TABLE `vt_customer` (
  `customerId` bigint(20) NOT NULL,
  `customerGroup` bigint(20) DEFAULT NULL,
  `customerType` bigint(20) DEFAULT NULL,
  `fullName` varchar(75) COLLATE utf8_unicode_ci DEFAULT NULL,
  `birthday` datetime DEFAULT NULL,
  `sex` int(11) DEFAULT NULL,
  `nationalId` bigint(20) DEFAULT NULL,
  `address` varchar(75) COLLATE utf8_unicode_ci DEFAULT NULL,
  `description` varchar(75) COLLATE utf8_unicode_ci DEFAULT NULL,
  `identifyNo` varchar(75) COLLATE utf8_unicode_ci DEFAULT NULL,
  `issueDate` datetime DEFAULT NULL,
  `issuePlace` varchar(75) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`customerId`),
  KEY `IX_9ACBF453` (`fullName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci
;

CREATE TABLE `vt_customer_service` (
  `customerServiceId` bigint(20) NOT NULL,
  `customerId` bigint(20) DEFAULT NULL,
  `deployName` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `appointDate` date DEFAULT NULL,
  `serviceType` int(11) DEFAULT NULL,
  `address` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `deployType` int(11) DEFAULT NULL,
  `packageType` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `isdnNo` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `accountType` int(11) DEFAULT NULL,
  PRIMARY KEY (`customerServiceId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci
;