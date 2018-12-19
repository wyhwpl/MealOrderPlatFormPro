drop table if exists t_seller;
create table t_seller(
	id int primary key not null auto_increment, #商家ID
	IDcard varchar(18) not null unique, #商家身份证件号
	loginID varchar(255) not null unique,#登录账号
	sellername varchar(255) not null, #店铺名
	password varchar(255) not null, #登录密码
	phone varchar(11) not null unique, #个人手机号
	name varchar(255) not null, #商家姓名
	address varchar(255) not null,  #商家地址
	status int,  #账号状态 0、未审核 1、通过审核 2、未通过审核 3、注销
	reason varchar(255), #审核未通过的原因
	score float,   #店铺评分
	regtime datetime,  #注册时间
	thoughtime datetime, #通过审核时间
	logouttime datetime, #注销时间
	img_URL varchar(255) #商家图片路径
);

INSERT INTO t_seller VALUES (1, '360222199608111617', '17721571395', '江西菜馆', '769B09789E8119E51E6E78F65C7F444D', '17721571395', '汪培林', '江西景德镇', 0, NULL, 0, '2018-11-09 14:05:16', NULL, NULL, NULL);
INSERT INTO t_seller VALUES (2, '368222199608111617', '15851865501', '南京人家', '21232F297A57A5A743894A0E4A801FC3', '15851865501', '徐世诚', '江苏南京', 1, NULL, 0, '2018-11-09 14:07:42', '2018-11-09 14:07:45', NULL, NULL);
INSERT INTO t_seller VALUES (3, '322212199705121456', '15179828772', '河南菜馆', '63A9F0EA7BB98050796B649E85481845', '15179828772', '齐啸', '河南驻马店', 2, '证件不全', 0, '2018-11-09 14:10:06', NULL, NULL, NULL);
INSERT INTO t_seller VALUES (4, '344333199708245656', '14484580644', '苏州小吃', 'E10ADC3949BA59ABBE56E057F20F883E', '14484580644', '林熠辰', '江苏苏州', 3, NULL, 4.2, '2018-11-01 14:12:11', '2018-11-03 14:12:17', '2018-11-28 14:12:31', NULL);

	