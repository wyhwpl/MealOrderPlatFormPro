drop table if exists t_rider;
create table t_rider(
	id varchar(255) primary key, #骑手ID
	username varchar(255) not null, #骑手名字
	phone varchar(11) not null unique,  #手机号（登录）
	password varchar(255) not null, #账号密码
	address varchar(255), #地址
	status int,  #账号状态 0、未审核 1、通过审核 2、未通过审核 3、注销
	currentstatus int, #接单状态 0、未接单 1、前往商家取货 2、正在配送
	sex varchar(4), #性别
	score float, #评分
	regtime datetime, #注册时间
	thoughtime datetime, #通过审核时间
	logouttime datetime, #注销时间
	img_URL varchar(255) #骑手头像
);

INSERT INTO t_rider VALUES ('1', '汪培林', '17721571395', '769B09789E8119E51E6E78F65C7F444D', '江西景德镇', 0, NULL, '男', NULL, '2018-11-09 14:15:45', NULL, NULL, NULL);
INSERT INTO t_rider VALUES ('2', '徐世诚', '15851865501', '21232F297A57A5A743894A0E4A801FC3', '江苏南京', 1, 0, '男', 5, '2018-11-09 14:16:50', '2018-11-09 14:16:55', NULL, NULL);
INSERT INTO t_rider VALUES ('3', '齐啸', '15179828772', '63A9F0EA7BB98050796B649E85481845', '河南驻马店', 2, NULL, '男', NULL, '2018-11-09 14:18:09', NULL, NULL, NULL);
INSERT INTO t_rider VALUES ('4', '林熠辰', '14484580644', 'E10ADC3949BA59ABBE56E057F20F883E', '江苏苏州', 3, 0, '男', 4, '2018-11-01 14:19:21', '2018-11-03 14:19:32', '2018-11-09 14:19:38', NULL);
