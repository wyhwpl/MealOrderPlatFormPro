drop table if exists t_order;
create table t_order(
	id int primary key not null auto_increment,
	userID int,
	sellerID int,
	riderID int,
	total_price float,
	sellersorce float,
	ridersorce float,
	status int,
	price float,
	ordertime datetime,
	arrivetime datetime
);