drop table if exists t_cart;
create table t_cart(
	id int primary key not null auto_increment, #主键ID
	userID int, #用户ID
	sellerID int, #商家ID
	cartfoodID int #订单菜品ID
);