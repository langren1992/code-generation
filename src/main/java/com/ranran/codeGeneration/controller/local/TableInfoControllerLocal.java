package com.ranran.codeGeneration.controller.local;

import com.alibaba.fastjson.JSONObject;
import com.ranran.codeGeneration.controller.TableInfoController;
import com.ranran.codeGeneration.model.TableColumnModel;
import com.ranran.codeGeneration.model.TableModel;
import com.ranran.codeGeneration.service.TableService;
import com.ranran.codeGeneration.vo.TableColumnSelectModel;
import com.ranran.codeGeneration.vo.TableSelectVo;
import com.ranran.core.GlobalErrorCode;
import com.ranran.core.ResponseResult;
import com.ranran.core.RestBaseController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Title TableInfoController
 * @description 表查询控制类
 * @author zengrui
 * @createTime 2018/4/20 19:19
 * @modifyTime 2018/4/20 19:19
 **/
@Component
public class TableInfoControllerLocal extends RestBaseController implements TableInfoController {

    protected Logger LOGGER = LoggerFactory.getLogger(TableInfoControllerLocal.class);

    @Autowired
    private TableService tableService;

    /**
     * @param request
     * @return com.ranran.core.config.ResponseResult
     * @Title selectAllTable
     * @description 查询所有表信息
     * @author zengrui
     * @createTime 2018/4/20 19:21
     * @modifyTime 2018/4/20 19:21
     **/
    @Override
    public ResponseResult selectTable(HttpServletRequest request,GlobalErrorCode globalErrorCode) {
        ResponseResult responseResult = new ResponseResult();
        String reqData = this.wrapperJson(request,globalErrorCode);
        TableSelectVo tableSelectVo = JSONObject.parseObject(reqData,TableSelectVo.class);
        List<TableModel> tableModel = tableService.selectTable(tableSelectVo);
        responseResult.success = true;
        responseResult.data = tableModel;
        return responseResult;
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
    public ResponseResult selectTableColumn(HttpServletRequest request, GlobalErrorCode globalErrorCode) {
        ResponseResult responseResult = new ResponseResult();
        String reqData = this.wrapperJson(request,globalErrorCode);
        TableColumnSelectModel tableColumnSelectModel = JSONObject.parseObject(reqData,TableColumnSelectModel.class);
        List<TableColumnModel> tableColumnModels = tableService.selectTableColumn(tableColumnSelectModel);
        responseResult.success = true;
        responseResult.data = tableColumnModels;
        return responseResult;
    }
}
