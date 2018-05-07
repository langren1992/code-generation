package com.ranran.codeGeneration.service;

import com.ranran.codeGeneration.model.TableColumnModel;
import com.ranran.codeGeneration.model.TableModel;
import com.ranran.codeGeneration.vo.TableColumnSelectModel;
import com.ranran.codeGeneration.vo.TableSelectVo;

import java.util.List;

/**
 * @Title TableService
 * @description 表梳理服务
 * @author zengrui
 * @createTime 2018/4/20 22:53
 * @modifyTime 2018/4/20 22:53
 **/
public interface TableService {

    /**
     * @Title selectTable
     * @description 根据条件查询表信息
     * @param tableSelectVo
     * @author zengrui
     * @createTime 2018/4/20 23:04
     * @modifyTime 2018/4/20 23:04
     * @return java.util.List<com.ranran.codeGeneration.mapper.TableModel>
     **/
    List<TableModel> selectTable(TableSelectVo tableSelectVo);

    /**
     * @Title selectTableColumn
     * @description 根据条件查询表列信息
     * @param tableColumnModel
     * @author zengrui
     * @createTime 2018/4/21 11:33
     * @modifyTime 2018/4/21 11:33
     * @return java.util.List<com.ranran.codeGeneration.model.TableColumnModel>
     **/
    List<TableColumnModel> selectTableColumn(TableColumnSelectModel tableColumnModel);

}
