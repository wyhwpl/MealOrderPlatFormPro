drop table if exists t_orderfood;
create table t_orderfood(
	id varchar(255) primary key, #主键
	foodID varchar(255), #菜品ID
	copies int, #份数
	price float, #单价
	score float,# 评分
	orderID varchar(255) #订单ID
);