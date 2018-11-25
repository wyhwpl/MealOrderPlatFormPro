drop table if exists t_orderfood;
create table t_orderfood(
	id int primary key not null auto_increment, #主键
	foodID int, #菜品ID
	copies int, #份数
	price float, #单价
	score float,# 评分
	orderID int #订单ID
);