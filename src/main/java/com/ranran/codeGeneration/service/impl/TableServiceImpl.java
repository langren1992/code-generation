package com.ranran.codeGeneration.service.impl;

import com.ranran.codeGeneration.mapper.TableMapper;
import com.ranran.codeGeneration.model.TableColumnModel;
import com.ranran.codeGeneration.model.TableModel;
import com.ranran.codeGeneration.service.TableService;
import com.ranran.codeGeneration.vo.TableColumnSelectModel;
import com.ranran.codeGeneration.vo.TableSelectVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Title TableServiceImpl
 * @description 表梳理服务
 * @author zengrui
 * @createTime 2018/4/21 11:35
 * @modifyTime 2018/4/21 11:35
 **/
@Service
public class TableServiceImpl implements TableService {

    @Autowired
    private TableMapper tableMapper;

    /**
     * @param tableSelectVo
     * @return java.util.List<com.ranran.codeGeneration.mapper.TableModel>
     * @Title selectAllTable
     * @description 根据条件查询表服务
     * @author zengrui
     * @createTime 2018/4/20 23:04
     * @modifyTime 2018/4/20 23:04
     **/
    @Override
    public List<TableModel> selectTable(TableSelectVo tableSelectVo) {
        TableModel tableModel = new TableModel();
        BeanUtils.copyProperties(tableSelectVo,tableModel);
        return tableMapper.selectTable(tableModel);
    }

    /**
     * @param tableColumnSelectModel
     * @return java.util.List<com.ranran.codeGeneration.model.TableColumnModel>
     * @Title selectTableColumn
     * @description 根据条件查询表列信息
     * @author zengrui
     * @createTime 2018/4/21 11:33
     * @modifyTime 2018/4/21 11:33
     **/
    @Override
    public List<TableColumnModel> selectTableColumn(TableColumnSelectModel tableColumnSelectModel) {
        TableColumnModel tableColumnModel = new TableColumnModel();
        BeanUtils.copyProperties(tableColumnSelectModel,tableColumnModel);
        return tableMapper.selectTableColumn(tableColumnModel);
    }
}
