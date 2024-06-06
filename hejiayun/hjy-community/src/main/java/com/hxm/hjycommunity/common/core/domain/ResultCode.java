package com.hxm.hjycommunity.common.core.domain;

/**
 * 响应状态码
 *
 * @author spikeCong
 * @date 2023/2/28
 **/
public enum ResultCode {

    /**
     * 操作成功
     **/
    SUCCESS("200", "操作成功"),

    /**
     * 操作失败
     **/
    ERROR("500", "操作失败"),
    ;

    /**
     *     * 自定义状态码
     *    
     **/
    private String code;


    /**
     * 自定义描述
     **/
    private String message;

    ResultCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
