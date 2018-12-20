drop table if exists t_classify;
create table t_classify(
	id varchar(255) primary key, #主键
	classifytag varchar(10),#分类标签
	sellerID varchar(255) #商家ID
);

INSERT INTO t_classify VALUES ('1', '特惠', '2');
INSERT INTO t_classify VALUES ('2', '黄焖鸡', '2');