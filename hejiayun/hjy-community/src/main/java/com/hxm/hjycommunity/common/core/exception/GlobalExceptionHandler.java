package com.hxm.hjycommunity.common.core.exception;

import com.hxm.hjycommunity.common.core.domain.BaseResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理
 */

@RestControllerAdvice
public class GlobalExceptionHandler {
    /**
     *     * 基础异常
     *     * @param e
     *     * @return: com.msb.hjycommunity.common.core.domain.BaseResponse
     *    
     */
    @ExceptionHandler(BaseException.class)
    @ResponseBody
    public BaseResponse baseExceptionHandler(BaseException e) {

        return BaseResponse.fail(e.getDefaultMessage());
    }
}
