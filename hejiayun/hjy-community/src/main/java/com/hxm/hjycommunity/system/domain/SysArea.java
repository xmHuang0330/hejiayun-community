package com.hxm.hjycommunity.system.domain;

import java.io.Serializable;

/**
 * @Author: xm_Wong
 * @Description: 区域表
 * @DateTime: 2024/6/7 16:38
 **/
public class SysArea implements Serializable {
    /**
     * 区划码
     */
    private Integer code;
    /**
     * 区划名称
     */
    private String name;
    /**
     * 上级区划码
     */
    private Integer parentCode;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentCode() {
        return parentCode;
    }

    public void setParentCode(Integer parentCode) {
        this.parentCode = parentCode;
    }
}
