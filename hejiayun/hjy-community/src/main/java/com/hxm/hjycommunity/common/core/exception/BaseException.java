package com.hxm.hjycommunity.common.core.exception;

/**
 * 基础异常
 *
 **/
public class BaseException extends RuntimeException {


    /**
     *     * 错误码
     *    
     */
    private String code;


    /**
     *     * 错误消息
     *    
     */
    private String defaultMessage;

    public BaseException() {
    }

    public BaseException(String code, String defaultMessage) {
        this.code = code;
        this.defaultMessage = defaultMessage;
    }

    public String getCode() {
        return code;
    }

    public String getDefaultMessage() {
        return defaultMessage;
    }
}
