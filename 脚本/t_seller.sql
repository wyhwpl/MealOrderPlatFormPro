drop table if exists t_seller;
create table t_seller(
	id int primary key not null auto_increment,
	IDcard varchar(18) not null unique,
	sellername varchar(255) not null unique,
	password varchar(255) not null unique,
	phone varchar(11) not null unique,
	name varchar(255) not null,
	address varchar(255) not null,
	isaudit int,
	isthough int,
	score float,
	regtime datetime,
	thoughtime datetime,
	img_URL varchar(255)
);
	
	