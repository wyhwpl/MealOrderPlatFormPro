drop table if exists t_order;
create table t_order(
	id int primary key not null auto_increment, #订单ID
	userID int, #用户ID
	sellerID int, #商家ID
	riderID int, #骑手ID
	total_price float, #总额
	sellersorce float, #商家评分
	ridersorce float, #骑手评分
	status int, #订单状态 0、未支付 1、商家未接单 2、商家接单 3、正在配送 4、确认收货 5、待评价 6、完成
	price float, 
	foodscore float, #菜品评分
	ordertime datetime, #下单时间
    paytime datetime, #支付时间
	taketime datetime, #接单时间
	arrivetime datetime #送达时间
);