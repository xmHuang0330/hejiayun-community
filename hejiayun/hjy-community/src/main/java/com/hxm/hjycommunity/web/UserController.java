package com.hxm.hjycommunity.web;

import com.hxm.hjycommunity.common.core.domain.BaseResponse;
import com.hxm.hjycommunity.common.core.domain.User;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/queryUserById")
    public BaseResponse<User> queryUserById(String userId) {
        if (userId != null) {
            return BaseResponse.success(new User(userId, "search success!!!"));
        } else {
            return BaseResponse.fail("search failure");
        }
    }


    @RequestMapping("/addUser")
    public BaseResponse addUser(@Validated User user, BindingResult bindingResult) {

        List<FieldError> fieldErrors = bindingResult.getFieldErrors();

//如果参数校验失败，会将错误信息封装成对象组装在 BindingResult
        if (!fieldErrors.isEmpty()) {
            return BaseResponse.fail(fieldErrors.get(0).getDefaultMessage());
        }

        return BaseResponse.success("OK");
    }


}
