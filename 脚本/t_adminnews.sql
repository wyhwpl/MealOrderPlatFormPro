drop table if exists t_adminnews;
create table t_adminnews(
	id varchar(255) primary key, #主键ID
	userKind int, #用户类型 1、商家 2、用户 3、骑手
    userId varchar(255) ,#用户ID	
	username varchar(255),#用户姓名
	action varchar(255), #具体事件
	actionobject varchar(255),#操作对象
	newstime datetime #发生时间
);
INSERT INTO t_adminnews VALUES ('1', 1, '1','汪培林', '申请注册', '店铺江西菜馆', '2018-11-09 14:05:16');
INSERT INTO t_adminnews VALUES ('2', 1, '2','徐世诚', '申请注册', '店铺南京人家', '2018-11-09 14:07:42');
INSERT INTO t_adminnews VALUES ('3', 1, '3', '齐啸','申请注册', '店铺河南菜馆', '2018-11-09 14:10:06');
INSERT INTO t_adminnews VALUES ('4', 1, '4', '林熠辰','申请注册', '店铺苏州小吃', '2018-11-01 14:12:11');
INSERT INTO t_adminnews VALUES ('5', 2, '1', '汪培林','申请注册', '骑手', '2018-11-09 14:15:45');
INSERT INTO t_adminnews VALUES ('6', 2, '2', '徐世诚','申请注册', '骑手', '2018-11-09 14:16:50');
INSERT INTO t_adminnews VALUES ('7', 2, '3', '齐啸','申请注册', '骑手', '2018-11-09 14:18:09');
INSERT INTO t_adminnews VALUES ('8', 2, '4', '林熠辰','申请注册', '骑手', '2018-11-01 14:19:21');