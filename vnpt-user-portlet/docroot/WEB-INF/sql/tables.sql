create table shoppingitemfield (
	itemFieldId LONG not null primary key,
	itemId LONG,
	name VARCHAR(75) null,
	values_ VARCHAR(75) null,
	description VARCHAR(75) null
);