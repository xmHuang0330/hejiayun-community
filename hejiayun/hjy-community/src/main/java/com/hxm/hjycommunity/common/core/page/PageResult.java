package com.hxm.hjycommunity.common.core.page;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: xm_Wong
 * @Description: 分页查询的统一封装
 * @DateTime: 2024/6/7 13:05
 **/
public class PageResult implements Serializable {

    private static final long serialVersionUID = 4895355652079138954L;

    /**
     * 总记录数
     */
    private long total;

    /**
     * 列表数据
     */
    private List<?> rows;

    /**
     * 消息状态码
     */
    private int code;

    /**
     * 消息内容
     */
    private String msg;

    public PageResult() {
    }

    /**
     *     * 分页
     *     * @param total 列表数据
     *     * @param rows  总记录数
     *     * @return: null
     *    
     */
    public PageResult(long total, List<?> rows) {
        this.total = total;
        this.rows = rows;
    }

    public PageResult(long total, List<?> rows, int code, String msg) {
        this.total = total;
        this.rows = rows;
        this.code = code;
        this.msg = msg;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
