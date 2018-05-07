package com.ranran.core;


import com.ranran.core.GlobalErrorCode;

/**
 * 服务层统一异常处理
 *
 * @author 曾睿
 * @create 2017-07-24 21:06
 **/
public class GlobalControllerException extends RuntimeException {

    private GlobalErrorCode errorCode;

    public GlobalControllerException(GlobalErrorCode errorCode) {
        super(errorCode.name);
        errorCode = errorCode;
    }

    public GlobalControllerException(Throwable cause) {
        super(cause);
    }

    public GlobalControllerException(GlobalErrorCode error, Throwable cause) {
        super(error.name, cause);
        errorCode = error;
    }

    public GlobalErrorCode getErrorCode() {
        return errorCode;
    }

    @Override
    public String getMessage() {
        if(super.getCause()==null) {
            return super.getMessage();
        }else {
            return super.getMessage() + ", nested exception is " + super.getCause().toString();
        }
    }
}
