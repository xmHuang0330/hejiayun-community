package com.hxm.hjycommunity.web.controller.system;

import com.hxm.hjycommunity.common.core.controller.BaseController;
import com.hxm.hjycommunity.common.core.domain.BaseResponse;
import com.hxm.hjycommunity.system.service.SysAreaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: xm_Wong
 * @Description: TODO
 * @DateTime: 2024/6/7 16:53
 **/
@RestController
@RequestMapping("/system/area")
public class SysAreaController extends BaseController {

    @Resource
    private SysAreaService sysAreaService;

    @RequestMapping("/tree")
    public BaseResponse getAreaTree(){

        return BaseResponse.success(sysAreaService.findAreaAsTree());
    }

}
