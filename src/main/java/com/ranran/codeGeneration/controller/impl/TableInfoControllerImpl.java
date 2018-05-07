package com.ranran.codeGeneration.controller.impl;

import com.ranran.codeGeneration.controller.TableInfoController;
import com.ranran.core.GlobalErrorCode;
import com.ranran.core.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Title TableInfoController
 * @description 表查询控制类
 * @author zengrui
 * @createTime 2018/4/20 19:19
 * @modifyTime 2018/4/20 19:19
 **/
@RestController(value="TableInfoControllerImpl")
@RequestMapping(value = "/table")
public class TableInfoControllerImpl implements TableInfoController {

    @Autowired
    private TableInfoController tableInfoController;

    /**
     * @Title selectAllTable
     * @description 查询所有表信息
     * @param request 请求参数
     * @author zengrui
     * @createTime 2018/4/20 19:21
     * @modifyTime 2018/4/20 19:21
     * @return com.ranran.core.config.ResponseResult
     **/
    @Override
    @PostMapping(value = "/selectTable.html")
    public ResponseResult selectTable(HttpServletRequest request,GlobalErrorCode globalErrorCode){
        return tableInfoController.selectTable(request,new GlobalErrorCode(101,"/table/selectTable.html"));
    }

    /**
     * @param request         请求
     * @param globalErrorCode 全局异常
     * @return com.ranran.core.ResponseResult
     * @Title selectTableColumn
     * @description 查询所有表列信息
     * @author zengrui
     * @createTime 2018/4/21 11:37
     * @modifyTime 2018/4/21 11:37
     **/
    @Override
    @PostMapping(value = "/selectTableColumn.html")
    public ResponseResult selectTableColumn(HttpServletRequest request, GlobalErrorCode globalErrorCode) {
        return tableInfoController.selectTableColumn(request,new GlobalErrorCode(102,"/table/selectTableColumn.html"));
    }


}
