drop table if exists t_user;
create table t_user(
	id int primary key not null auto_increment,
	phone varchar(11) not null unique,
	password varchar(255) not null,
	username varchar(255) not null unique,
	sex varchar(4),
	img_URL varchar(255)
);