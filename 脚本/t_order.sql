drop table if exists t_order;
create table t_order(
	id varchar(255) primary key, #订单ID
	userID varchar(255), #用户ID
	userName varchar(255), # 用户名字
	address varchar(255), # 收货地址
	phone varchar(11), #联系方式
	sellerID varchar(255), #商家ID
	sellerName varchar(255), #店铺名
	sellerPhone varchar(11), #店家联系方式
	riderID varchar(255), #骑手ID
	riderPhone varchar(11), #骑手联系方式
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