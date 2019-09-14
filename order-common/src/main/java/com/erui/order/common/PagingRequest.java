package com.erui.order.common;


import com.alibaba.fastjson.JSON;

import java.util.List;


/**
 * 分页请求基本对象
 */
public class PagingRequest {
    public final static int DEFAULT_PAGE_NO = 1; // 默认页码
    public final static int DEFAULT_PAGE_SIZE = 20; // 默认每页记录条数

    // 页码
    private Integer page;
    // 每页记录条数
    private Integer rows;
    private List<PagingOrderBy> orderBy;

    public Integer getPage() {
        if (page == null || page <= 0) {
            return DEFAULT_PAGE_NO;
        }
        return page;
    }

    public void setPage(Integer pageNo) {
        this.page = pageNo;
    }

    public Integer getRows() {
        if (rows == null || rows <= 0) {
            return DEFAULT_PAGE_SIZE;
        }
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    /**
     * 获取开始的记录条数
     */
    public Integer getOffset() {
        Integer pageNo = getPage();
        Integer pageSize = getRows();
        return (pageNo - 1) * pageSize;
    }

    public List<PagingOrderBy> orderByList() {
        return orderBy;
    }

    public String getOrderBy() {
        if (orderBy != null) {
            return JSON.toJSONString(orderBy);
        }
        return null;
    }

    public void setOrderBy(List<PagingOrderBy> orderBy) {
        this.orderBy = orderBy;
    }

    /**
     * 排序字段类
     */
    public static class PagingOrderBy {
        // 排序字段
        private String field;
        // 升序：降序 {ASC:DESC}
        private OrderBy order;

        public String getField() {
            return field;
        }

        public void setField(String field) {
            this.field = field;
        }

        // 默认升序
        public OrderBy getOrder() {
            if (order == null) {
                return OrderBy.ASC;
            }
            return order;
        }

        public void setOrder(OrderBy order) {
            this.order = order;
        }

    }

    public enum OrderBy {
        DESC, ASC;
    }
}
