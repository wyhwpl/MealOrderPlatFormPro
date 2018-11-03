drop table if exists t_rider;
create table t_rider(
	id int primary key not null auto_increment,
	name varchar(255) not null,
	phone varchar(11) not null unique,
	password varchar(255) not null,
	address varchar(255),
	status int,
	sex varchar(4),
	isaudit int,
	isthough int,
	score float,
	regtime datetime,
	thoughtime datetime,
	img_URL varchar(255)
);