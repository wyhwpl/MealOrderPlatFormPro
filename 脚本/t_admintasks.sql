drop table if exists t_admintasks;
create table t_admintasks(
	id varchar(255) primary key, #任务ID
	taskKind int, #用户类型 1、商家 2、骑手 3、菜品
    objectId varchar(255) ,#ID
	username varchar(255),#用户名
	status int ,#任务状态 0、未完成 1、已完成
	tasktime datetime,#任务发起时间
	donetime datetime,#任务完成时间
	adminId varchar(255)  #管理员ID
);
INSERT INTO t_admintasks VALUES ('1', 1, '1','汪培林', 0, '2018-11-09 14:05:16', NULL, '1');
INSERT INTO t_admintasks VALUES ('2', 2, '1','汪培林', 0, '2018-11-09 14:15:45', NULL, '1');
INSERT INTO t_admintasks VALUES ('3', 1, '2','徐世诚', 1, '2018-11-09 14:07:42', '2018-11-09 14:07:45', '1');
INSERT INTO t_admintasks VALUES ('4', 1, '3','齐啸', 1, '2018-11-09 14:10:06', '2018-11-09 14:32:08', '1');
INSERT INTO t_admintasks VALUES ('5', 1, '4','林熠辰', 1, '2018-11-01 14:12:11', '2018-11-03 14:12:17', '1');
INSERT INTO t_admintasks VALUES ('6', 2, '2','徐世诚', 1, '2018-11-09 14:16:50', '2018-11-09 14:16:55', '1');
INSERT INTO t_admintasks VALUES ('7', 2, '3','齐啸', 1, '2018-11-09 14:18:09', '2018-11-09 14:34:12', '1');
INSERT INTO t_admintasks VALUES ('8', 2, '4','林熠辰', 1, '2018-11-01 14:19:21', '2018-11-03 14:19:32', '1');