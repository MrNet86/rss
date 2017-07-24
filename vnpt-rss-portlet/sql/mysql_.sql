CREATE TABLE `eportal_rss_category` (
  `rssCategoryId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `name` varchar(200) DEFAULT NULL,
  `description` varchar(400) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `createdId` bigint(20) DEFAULT NULL,
  `createdDate` datetime DEFAULT NULL,
  PRIMARY KEY (`rssCategoryId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8
;

CREATE TABLE `eportal_rss_config` (
  `rssConfigId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `title` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `url` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `totalFeed` int(11) DEFAULT NULL,
  PRIMARY KEY (`rssConfigId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci
;

CREATE TABLE `eportal_rss_feeds` (
  `rssFeedsId` bigint(20) NOT NULL,
  `groupId` bigint(20) DEFAULT NULL,
  `companyId` bigint(20) DEFAULT NULL,
  `title` varchar(1000) DEFAULT NULL,
  `url` varchar(1000) DEFAULT NULL,
  `description` varchar(4000) DEFAULT NULL,
  `content` varchar(4000) DEFAULT NULL,
  `author` varchar(45) DEFAULT NULL,
  `publishedDate` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `createdId` bigint(20) DEFAULT NULL,
  `createdDate` datetime DEFAULT NULL,
  `approvedId` bigint(20) DEFAULT NULL,
  `approvedDate` datetime DEFAULT NULL,
  PRIMARY KEY (`rssFeedsId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8
;