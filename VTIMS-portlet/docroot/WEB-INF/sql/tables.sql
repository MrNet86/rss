create table Invest_Categories (
	invest_Categories_Id LONG not null primary key,
	obj_id LONG,
	name VARCHAR(75) null,
	description VARCHAR(75) null,
	unit_id LONG,
	quantity DOUBLE,
	used_Quantity DOUBLE,
	unit_price DOUBLE,
	cat_Currency_Id LONG,
	type LONG,
	vat DOUBLE,
	is_Active LONG,
	created_id LONG,
	created_Date DATE null,
	modifield_Id LONG,
	modifield_Date DATE null
);