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

    /**
     * 新增小区
     * @param hjyCommunity
     * @return: int
     */
    int insertHjyCommunity(HjyCommunity hjyCommunity);

    /**
     * 获取小区详细信息
     * @param communityId
     * @return: com.msb.hjycommunity.community.domain.HjyCommunity
     */
    HjyCommunity selectHjyCommunityById(Long communityId);

      /**
    * 删除小区
    * @param communityIds
    * @return: int
    */
    int deleteHjyCommunityByIds(Long[] communityIds);
}
