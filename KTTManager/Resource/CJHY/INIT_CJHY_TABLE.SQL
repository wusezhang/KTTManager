CREATE TABLE CJXJ_RESOURCE_TABLE (
	BZ_NAME VARCHAR (30) NOT NULL ,
	BZ_INTRODUCE VARCHAR (1800),
	SRC_NAME VARCHAR (600) NOT NULL,
	ID INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
	BZ_FL DOUBLE NOT NULL,
	CREATEDATE  timestamp  DEFAULT NOW(),
	LINKURL VARCHAR (1500) NOT NULL
); 

INSERT INTO CJXJ_RESOURCE_TABLE (BZ_NAME, BZ_INTRODUCE, SRC_NAME, ID, BZ_FL, LINKURL) VALUES('沙黾农','资深股评专家','shajingrong.jpg','1','0','http://blog.sina.com.cn/s/articlelist_1279884602_0_1.html','2014-01-16 00:00:00');
INSERT INTO CJXJ_RESOURCE_TABLE (BZ_NAME, BZ_INTRODUCE, SRC_NAME, ID, BZ_FL, LINKURL) VALUES('叶荣添','新浪名博，资深股评人','yerongtian.jpg','2','0','http://blog.sina.com.cn/s/articlelist_1284139322_0_1.html','2014-01-16 00:00:00');
INSERT INTO CJXJ_RESOURCE_TABLE (BZ_NAME, BZ_INTRODUCE, SRC_NAME, ID, BZ_FL, LINKURL) VALUES('郎咸平','资深经济学家','langxianping.jpg','3','0','http://blog.sina.com.cn/s/articlelist_1092672395_0_1.html','2014-01-16 00:00:00');
INSERT INTO CJXJ_RESOURCE_TABLE (BZ_NAME, BZ_INTRODUCE, SRC_NAME, ID, BZ_FL, LINKURL) VALUES('谢百三','复旦大学教授，金融与资本市场研究中心主任','xiebaisan.jpg','4','0','http://blog.sina.com.cn/s/articlelist_1190841165_0_1.html','2014-01-16 00:00:00');
INSERT INTO CJXJ_RESOURCE_TABLE (BZ_NAME, BZ_INTRODUCE, SRC_NAME, ID, BZ_FL, LINKURL) VALUES('徐小明','资深股评专家','xuxiaoming.jpg','5','0','http://blog.sina.com.cn/s/articlelist_1300871220_0_1.html','2014-01-16 00:00:00');
INSERT INTO CJXJ_RESOURCE_TABLE (BZ_NAME, BZ_INTRODUCE, SRC_NAME, ID, BZ_FL, LINKURL) VALUES('纵横资本','《纵横资本》中国黄金投资业创新领导品牌 属于由黄金界、媒体界、证券界和商界人士自发','zhzblogo.jpg','6','1','http://hexun.com/zq200142914/default.html','2014-01-16 00:00:00');
INSERT INTO CJXJ_RESOURCE_TABLE (BZ_NAME, BZ_INTRODUCE, SRC_NAME, ID, BZ_FL, LINKURL) VALUES('唐汇金','经济学博士，香港金融机构高层管理人员、首席分析师、投资策划师和风险管理师','tangxuijun.jpg','7','1','http://hexun.com/tenziyanjun/default.html','2014-01-16 00:00:00');
