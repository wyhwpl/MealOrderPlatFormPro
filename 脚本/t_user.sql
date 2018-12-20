drop table if exists t_user;
create table t_user(
	id varchar(255) primary key, #用户ID
	phone varchar(11) not null unique,  #手机号(作为登录账号)
	password varchar(255) not null,    #登录密码
	username varchar(255), #用户名
	sex varchar(4),  #性别
	img_URL varchar(255)  #头像路径
);