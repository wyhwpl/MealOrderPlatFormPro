drop table if exists t_cart;
create table t_cart(
	id varchar(255) primary key, #主键ID
	userID varchar(255), #用户ID
	sellerID varchar(255) #商家ID
);