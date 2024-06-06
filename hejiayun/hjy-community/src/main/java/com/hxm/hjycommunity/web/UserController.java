package com.hxm.hjycommunity.web;

import com.hxm.hjycommunity.common.core.domain.BaseResponse;
import com.hxm.hjycommunity.common.core.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/quryUserById")
    public BaseResponse<User> quryUserById(String userId){
        if (userId != null) {
            return BaseResponse.success(new User(userId, "search success!!!"));
        } else {
            return BaseResponse.fail("search failure");
        }
    }

}
