package com.ranran.core;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @Title GlobalControllerAdvice
 * @description 全局异常类监听器
 * @author zengrui
 * @createTime 2018/4/20 19:27
 * @modifyTime 2018/4/20 19:27
 **/
@ControllerAdvice
public class GlobalControllerAdvice {

    private static Logger LOGGER = LoggerFactory.getLogger(GlobalControllerAdvice.class);

    /**
     * @Title errorHandler
     * @description 全局异常拦截
     * @param ex 异常类
     * @author zengrui
     * @createTime 2018/4/20 19:26
     * @modifyTime 2018/4/20 19:26
     * @return com.ranran.core.ResponseResult ResponseResult
     **/
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public ResponseResult errorHandler(Exception ex) {
        ex.printStackTrace();
        ResponseResult responseResult = new ResponseResult();
        String errorStr = ex.getMessage() + "\n" + StringUtils.join(ex.getStackTrace(),"\n    at ");
        responseResult.error = true;
        responseResult.message = errorStr;
        LOGGER.error("\n {}", errorStr);
        return responseResult;
    }
}
