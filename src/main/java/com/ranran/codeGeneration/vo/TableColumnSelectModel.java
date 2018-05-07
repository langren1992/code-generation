package com.ranran.codeGeneration.vo;

/**
 * ${DESCRIPTION}
 *
 * @author 曾睿
 * @create 2018-04-21 11:41
 **/
public class TableColumnSelectModel {

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
