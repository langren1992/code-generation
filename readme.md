##### 20180421研发记录
###### 查询数据库表信息 
select table_name,table_schema,table_comment from information_schema.tables where table_name = '表名' and table_schema = "数据库名称"
###### 查询数据库列信息 
select * from information_schema.columns where table_name = '表名' and table_schema = "数据库名称"