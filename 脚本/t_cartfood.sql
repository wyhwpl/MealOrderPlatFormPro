drop table if exists t_cartfood;
create table t_cartfood(
	id int primary key not null auto_increment, #主键
	foodID int, #菜品ID
	copies int, #份数
	cartID int #购物车ID
);