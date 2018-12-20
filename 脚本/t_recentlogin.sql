drop table if exists t_recentlogin;
create table t_recentlogin(
	id varchar(255) primary key, #主键ID
	userKind int, #用户类型 1、商家 2、用户 3、骑手
    userId varchar(255) ,#用户ID	
	ip varchar(255), #登录IP
	logintime datetime, #登录时间
	loginouttime datetime #退出登录时间
);