drop table if exists t_classify;
create table t_classify(
	id int primary key not null auto_increment, #主键
	classifytag varchar(10),#分类标签
	sellerID int #商家ID
);