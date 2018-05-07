package com.ranran.codeGeneration.vo;

/**
 * 表查询条件
 *
 * @author 曾睿
 * @create 2018-04-20 23:00
 **/
public class TableSelectVo {

    private String tableName;

    private String tableSchema;


    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableSchema() {
        return tableSchema;
    }

    public void setTableSchema(String tableSchema) {
        this.tableSchema = tableSchema;
    }
}
