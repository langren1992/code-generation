package com.ranran.codeGeneration.model;

import com.ranran.core.BaseModel;

import java.io.Serializable;

/**
 * @Title TableColumnModel
 * @description 表列信息
 * @author zengrui
 * @createTime 2018/4/21 11:24
 * @modifyTime 2018/4/21 11:24
 **/
public class TableColumnModel extends BaseModel implements Serializable {

    /**
     * 表名
     */
    private String tableName;

    /**
     * 库名
     */
    private String tableSchema;

    /**
     * 列名
     */
    private String columnName;

    /**
     * 列顺序
     */
    private String ordinalPosition;

    /**
     * 是否为空
     */
    private String isNullable;

    /**
     *  数据类型
     */
    private String dataType;

    /**
     * 字符串最大长度
     */
    private String characterMaximumLength;

    /**
     * 数字类型整数长度
     */
    private String numericPrecision;

    /**
     * 数字类型小数长度
     */
    private String numericScale;

    /**
     * 列备注
     */
    private String columnComment;


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

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getOrdinalPosition() {
        return ordinalPosition;
    }

    public void setOrdinalPosition(String ordinalPosition) {
        this.ordinalPosition = ordinalPosition;
    }

    public String getIsNullable() {
        return isNullable;
    }

    public void setIsNullable(String isNullable) {
        this.isNullable = isNullable;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getCharacterMaximumLength() {
        return characterMaximumLength;
    }

    public void setCharacterMaximumLength(String characterMaximumLength) {
        this.characterMaximumLength = characterMaximumLength;
    }

    public String getNumericPrecision() {
        return numericPrecision;
    }

    public void setNumericPrecision(String numericPrecision) {
        this.numericPrecision = numericPrecision;
    }

    public String getNumericScale() {
        return numericScale;
    }

    public void setNumericScale(String numericScale) {
        this.numericScale = numericScale;
    }

    public String getColumnComment() {
        return columnComment;
    }

    public void setColumnComment(String columnComment) {
        this.columnComment = columnComment;
    }

    @Override
    public String toString() {
        return "TableColumnModel{" +
                "tableName='" + tableName + '\'' +
                ", tableSchema='" + tableSchema + '\'' +
                ", columnName='" + columnName + '\'' +
                ", ordinalPosition='" + ordinalPosition + '\'' +
                ", isNullable='" + isNullable + '\'' +
                ", dataType='" + dataType + '\'' +
                ", characterMaximumLength='" + characterMaximumLength + '\'' +
                ", numericPrecision='" + numericPrecision + '\'' +
                ", numericScale='" + numericScale + '\'' +
                ", columnComment='" + columnComment + '\'' +
                '}';
    }
}
