package com.hxm.hjycommunity.community.service.impl;

import com.hxm.hjycommunity.community.domain.HjyCommunity;
import com.hxm.hjycommunity.community.domain.dto.HjyCommunityDto;
import com.hxm.hjycommunity.community.mapper.HjyCommunityMapper;
import com.hxm.hjycommunity.community.service.HjyCommunityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: xm_Wong
 * @Description: TODO
 * @DateTime: 2024/6/7 12:55
 **/
@Service
public class HjyCommunityServiceImpl implements HjyCommunityService {

    @Resource
    private HjyCommunityMapper communityMapper;

    @Override
    public List<HjyCommunityDto> selectHjyCommunityList(HjyCommunity hjyCommunity) {
        return communityMapper.queryList(hjyCommunity);
    }
}
