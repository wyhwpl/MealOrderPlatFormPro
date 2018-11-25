drop table if exists t_food;
create table t_food(
	id int primary key not null auto_increment, #主键
	foodname varchar(255),     #菜品名称
	description varchar(255), #菜品描述
	origin_price float, #原价
	tagID int, #分类标签ID
	price float,    #现价
	sellerID int,  #商家ID
	score float, #菜品评分
	status int, #菜品状态  0、未审核 1、通过审核 2、未通过审核 3、已下架
	applicationtime datetime,  #菜品申请时间
	thoughtime datetime , #通过审核时间
	undercarriagetime datetime, #下架时间
	img_URL varchar(255)  #菜品图片路径
);