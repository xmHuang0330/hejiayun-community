package com.hxm.hjycommunity.common.core.page;

/**
 * @Author: xm_Wong
 * @Description: 分页参数
 * @DateTime: 2024/6/7 13:03
 **/
public class PageDomain {

    /**
     * 当前记录起始索引
     */
    private Integer pageNum;

    /**
     * 每页显示记录数
     */
    private Integer pageSize;

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
