package com.hxm.hjycommunity.web.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hxm.hjycommunity.common.core.constant.HttpStatus;
import com.hxm.hjycommunity.common.core.controller.BaseController;
import com.hxm.hjycommunity.common.core.page.PageResult;
import com.hxm.hjycommunity.common.core.utils.ServletUtils;
import com.hxm.hjycommunity.community.domain.HjyCommunity;
import com.hxm.hjycommunity.community.domain.dto.HjyCommunityDto;
import com.hxm.hjycommunity.community.service.HjyCommunityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: xm_Wong
 * @Description: TODO
 * @DateTime: 2024/6/7 13:15
 **/
@RestController
@RequestMapping("/community")
public class HjyCommunityController extends BaseController {

    @Resource
    private HjyCommunityService hjyCommunityService;

    @GetMapping("/list")
    public PageResult list(HjyCommunity hjyCommunity) {

        startPage();
        List<HjyCommunityDto> list = hjyCommunityService.selectHjyCommunityList(hjyCommunity);

        return getData(list);
    }


}
