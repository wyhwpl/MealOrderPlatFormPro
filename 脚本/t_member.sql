drop table if exists t_member;
create table t_member(
	id int primary key not null auto_increment, #主键ID
	userID int, #用户ID
	starttime datetime, #开始时间
	status int, #自动续费状态
	endtime datetime #到期时间
);