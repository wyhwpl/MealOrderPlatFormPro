drop table if exists t_member;
create table t_member(
	id int primary key not null auto_increment,
	userID int,
	starttime datetime,
	endtime datetime
);