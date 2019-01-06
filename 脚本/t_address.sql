# 收货地址表
DROP TABLE
IF exists t_address ;
CREATE TABLE t_address (
	addrid varchar(255) PRIMARY KEY,
	#地址编号	
	userid VARCHAR (255),
	#用户id
	addrdesc VARCHAR (255), 
	#地址描述
	recentuse int
	#最近是否使用标志，值为1则表示上次使用
);
