drop table if exists t_admin;
create table t_admin(
	id varchar(255) primary key, #逐渐ID
	username varchar(255) not null,   #用户名
	loginID varchar(255) not null,  #登录账号
	password varchar(255) not null, #登录密码
	createtime datetime,  #账号创建时间
	img_URL varchar(255) #头像路径
);

INSERT INTO t_admin VALUES ('1', '汪培林', '17721571395', '769B09789E8119E51E6E78F65C7F444D', '2018-11-09 13:58:32', NULL);
INSERT INTO t_admin VALUES ('2', '徐世诚', '15851865501', '	21232F297A57A5A743894A0E4A801FC3', '2018-11-09 13:59:42', NULL);
INSERT INTO t_admin VALUES ('3', '齐啸', '15179828772', '	63A9F0EA7BB98050796B649E85481845', '2018-11-09 14:00:36', NULL);
INSERT INTO t_admin VALUES ('4', '林熠辰', '14484580644', 'E10ADC3949BA59ABBE56E057F20F883E', '2018-11-09 14:02:05', NULL);