package com.ranran.codeGeneration.controller;

import com.ranran.core.GlobalErrorCode;
import com.ranran.core.ResponseResult;

import javax.servlet.http.HttpServletRequest;

/**
 * @Title TableInfoController
 * @description 表查询控制类
 * @author zengrui
 * @createTime 2018/4/20 19:19
 * @modifyTime 2018/4/20 19:19
 **/
public interface TableInfoController {

    /**
     * @Title selectAllTable
     * @description 查询所有表信息
     * @param request 请求
     * @param globalErrorCode 全局异常
     * @author zengrui
     * @createTime 2018/4/20 19:21
     * @modifyTime 2018/4/20 19:21
     * @return com.ranran.core.config.ResponseResult
     **/
    ResponseResult selectTable(HttpServletRequest request,GlobalErrorCode globalErrorCode);

    /**
     * @Title selectTableColumn
     * @description 查询所有表列信息
     * @param request 请求
     * @param globalErrorCode 全局异常
     * @author zengrui
     * @createTime 2018/4/21 11:37
     * @modifyTime 2018/4/21 11:37
     * @return com.ranran.core.ResponseResult
     **/
    ResponseResult selectTableColumn(HttpServletRequest request,GlobalErrorCode globalErrorCode);

}
