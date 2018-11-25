drop table if exists t_rider;
create table t_rider(
	id int primary key not null auto_increment, #骑手ID
	username varchar(255) not null, #骑手名字
	phone varchar(11) not null unique,  #手机号（登录）
	password varchar(255) not null, #账号密码
	address varchar(255), #地址
	status int,  #账号状态 0、未审核 1、通过审核 2、未通过审核 3、注销
	currentstatus int, #接单状态 0、未接单 1、前往商家取货 2、正在配送
	sex varchar(4), #性别
	score float, #评分
	regtime datetime, #注册时间
	thoughtime datetime, #通过审核时间
	logouttime datetime, #注销时间
	img_URL varchar(255) #骑手头像
);