drop table if exists t_orderfood;
create table t_orderfood(
	id int primary key not null auto_increment,
	foodID int,
	copies int,
	price float,
	orderID int
);