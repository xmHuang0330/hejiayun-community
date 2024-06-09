package com.hxm.hjycommunity.web.controller.community;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hxm.hjycommunity.common.core.constant.HttpStatus;
import com.hxm.hjycommunity.common.core.controller.BaseController;
import com.hxm.hjycommunity.common.core.domain.BaseResponse;
import com.hxm.hjycommunity.common.core.page.PageResult;
import com.hxm.hjycommunity.common.core.utils.ServletUtils;
import com.hxm.hjycommunity.community.domain.HjyCommunity;
import com.hxm.hjycommunity.community.domain.dto.HjyCommunityDto;
import com.hxm.hjycommunity.community.service.HjyCommunityService;
import org.springframework.web.bind.annotation.*;

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

    /**
     * 新增小区
     *
     * @param hjyCommunity
     * @return: com.msb.hjycommunity.common.core.domain.BaseResponse
     */
    @PostMapping
    public BaseResponse add(@RequestBody HjyCommunity hjyCommunity) {

        return toAjax(hjyCommunityService.insertHjyCommunity(hjyCommunity));
    }

    /**
     * 根据id查询小区信息
     *
     * @param communityId
     * @return: com.msb.hjycommunity.common.core.domain.BaseResponse
     */
    @GetMapping(value = "/{communityId}")
    public BaseResponse getInfo(@PathVariable("communityId") Long communityId) {

        return BaseResponse.success(hjyCommunityService.selectHjyCommunityById(communityId));
    }

    /**
     * * 删除小区
     * * @param communityIds
     * * @return: com.msb.hjycommunity.common.core.domain.BaseResponse
     *    
     */
    @DeleteMapping("/{communityIds}")
    public BaseResponse remove(@PathVariable Long[] communityIds) {
        return toAjax(hjyCommunityService.deleteHjyCommunityByIds(communityIds));
    }


}
