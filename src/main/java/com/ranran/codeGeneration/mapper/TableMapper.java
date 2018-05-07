package com.ranran.codeGeneration.mapper;

import com.ranran.codeGeneration.model.TableColumnModel;
import com.ranran.codeGeneration.model.TableModel;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @Title TableMapper
 * @description table实例化DAO
 * @author zengrui
 * @createTime 2018/4/21 11:27
 * @modifyTime 2018/4/21 11:27
 **/
public interface TableMapper extends Mapper<TableModel> {

    /**
     * @Title selectTable
     * @description 查询表信息
     * @param tableModel
     * @author zengrui
     * @createTime 2018/4/21 11:27
     * @modifyTime 2018/4/21 11:27
     * @return java.util.List<com.ranran.codeGeneration.model.TableModel>
     **/
    List<TableModel> selectTable(TableModel tableModel);

    /**
     * @Title selectTableColumn
     * @description 查询表列信息
     * @param tableColumnModel
     * @author zengrui
     * @createTime 2018/4/21 11:26
     * @modifyTime 2018/4/21 11:26
     * @return java.util.List<com.ranran.codeGeneration.model.TableColumnModel>
     **/
    List<TableColumnModel> selectTableColumn(TableColumnModel tableColumnModel);
}
