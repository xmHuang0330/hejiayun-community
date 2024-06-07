package com.hxm.hjycommunity.system.service;

import com.hxm.hjycommunity.system.domain.dto.SysAreaDto;

import java.util.List;

/**
 * @Author: xm_Wong
 * @Description: TODO
 * @DateTime: 2024/6/7 16:49
 **/
public interface SysAreaService {
    /**
     * 获取区域数据的完整树
     * @param
     * @return: java.util.List<com.msb.hjycommunity.system.domain.dto.SysAreaDto>
     */
    List<SysAreaDto> findAreaAsTree();
}
