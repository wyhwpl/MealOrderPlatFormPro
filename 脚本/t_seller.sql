drop table if exists t_seller;
create table t_seller(
	id int primary key not null auto_increment, #商家ID
	IDcard varchar(18) not null unique, #商家身份证件号
	loginID varchar(255) not null unique,#登录账号
	sellername varchar(255) not null, #店铺名
	password varchar(255) not null unique, #登录密码
	phone varchar(11) not null unique, #个人手机号
	name varchar(255) not null, #商家姓名
	address varchar(255) not null,  #商家地址
	status int,  #账号状态 0、未审核 1、通过审核 2、未通过审核 3、注销
	reason varchar(255), #审核未通过的原因
	score float,   #店铺评分
	regtime datetime,  #注册时间
	thoughtime datetime, #通过审核时间
	logouttime datetime, #注销时间
	img_URL varchar(255) #商家图片路径
);
	
	