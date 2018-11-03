drop table if exists t_admin;
create table t_admin(
	id int primary key auto_increment,
	username varchar(255) not null unique,
	loginID varchar(255) not null unique,
	password varchar(255) not null,
	createtime datetime,
	updatetime datetime,
	img_URL varchar(255)
);