drop table if exists t_food;
create table t_food(
	id int primary key not null auto_increment,
	foodname varchar(255),
	description varchar(255),
	price float,
	sellerID int,
	isaudit int,
	isthough int,
	img_URL varchar(255)
);