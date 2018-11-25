drop table if exists t_admin;
create table t_admin(
	id int primary key auto_increment, #逐渐ID
	username varchar(255) not null,   #用户名
	loginID varchar(255) not null,  #登录账号
	password varchar(255) not null, #登录密码
	createtime datetime,  #账号创建时间
	img_URL varchar(255) #头像路径
);