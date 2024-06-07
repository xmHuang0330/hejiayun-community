package com.hxm.hjycommunity.community.service;

import com.hxm.hjycommunity.community.domain.HjyCommunity;
import com.hxm.hjycommunity.community.domain.dto.HjyCommunityDto;

import java.util.List;

/**
 * @Author: xm_Wong
 * @Description: TODO
 * @DateTime: 2024/6/7 12:54
 **/
public interface HjyCommunityService {
    /**
     * 查询小区信息列表
     * @param hjyCommunity
     * @return: java.util.List<com.msb.hjycommunity.community.domain.dto.HjyCommunityDto>
     */
    List<HjyCommunityDto> selectHjyCommunityList(HjyCommunity hjyCommunity);
}
