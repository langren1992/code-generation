package com.ranran.codeGeneration.model;

import com.ranran.core.BaseModel;

import java.io.Serializable;

/**
 * 数据库table
 *
 * @author 曾睿
 * @create 2018-04-20 23:02
 **/
public class TableModel extends BaseModel implements Serializable {

    /**
     * 表名
     */
    private String tableName;

    /**
     * 库名
     */
    private String tableSchema;

    /**
     * 表备注
     */
    private String tableComment;

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

    public String getTableComment() {
        return tableComment;
    }

    public void setTableComment(String tableComment) {
        this.tableComment = tableComment;
    }

    @Override
    public String toString() {
        return "TableModel{" +
                "tableName='" + tableName + '\'' +
                ", tableSchema='" + tableSchema + '\'' +
                ", tableComment='" + tableComment + '\'' +
                '}';
    }
}
