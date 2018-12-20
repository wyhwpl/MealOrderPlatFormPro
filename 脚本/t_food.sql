drop table if exists t_food;
create table t_food(
	id varchar(255) primary key, #主键
	foodname varchar(255),     #菜品名称
	description varchar(255), #菜品描述
	origin_price float, #原价
	tagID varchar(255), #分类标签ID
	price float,    #现价
	sellerID varchar(255),  #商家ID
	score float, #菜品评分
	status int, #菜品状态  0、未审核 1、通过审核 2、未通过审核 3、已下架
	applicationtime datetime,  #菜品申请时间
	thoughtime datetime , #通过审核时间
	undercarriagetime datetime, #下架时间
	img_URL varchar(255)  #菜品图片路径
);

INSERT INTO t_food VALUES ('1', '大盘黄焖鸡', '黄焖鸡+金针菇+米饭', 36.25, '2', NULL, 2, 0, 1, '2018-11-27 14:59:47', '2018-12-12 14:49:18', NULL, NULL);
INSERT INTO t_food VALUES ('2', '小盘黄焖鸡', '黄焖鸡+金针菇+米饭', 30.33, '2', NULL, 2, 5, 1, '2018-11-14 15:01:42', '2018-11-15 15:01:48', NULL, NULL);
INSERT INTO t_food VALUES ('3', '黄焖鸡凤爪拼饭', '黄焖鸡+凤爪，蔬菜', 33, '1', 16, 2, 0, 1, '2018-11-15 15:05:30', '2018-12-12 14:49:25', NULL, NULL);
INSERT INTO t_food VALUES ('4', '黄焖鸡狮子头拼饭', '黄焖鸡+狮子头', 34, '2', NULL, 2, 4.6, 3, '2018-11-15 15:06:44', '2018-11-16 15:06:49', '2018-11-23 15:07:01', NULL);
