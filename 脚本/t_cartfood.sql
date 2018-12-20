drop table if exists t_cartfood;
create table t_cartfood(
	id varchar(255) primary key, #主键
	foodID varchar(255), #菜品ID
	copies int, #份数
	cartID varchar(255) #购物车ID
);