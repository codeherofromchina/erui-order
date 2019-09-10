package com.erui.order.common.pojo;

import java.util.List;

/**
 * @Auther 王晓丹
 * @Date 2019/7/29 下午6:43
 */
public class Pager<T> {
    private int pageNum;
    private int pageSize;
    private int pages;
    private long total; //总记录条数
    private List<T> rows;

    public Pager() {
        this.pageNum = 1;
        this.pageSize = 0;
        this.pages = 0;
        this.total = 0;
        this.rows = null;
    }

    public Pager(int pageNum, int pageSize, int pages, long total, List<T> rows) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
        this.pages = pages;
        this.total = total;
        this.rows = rows;
    }

    public int getPageNum() {
        return pageNum;
    }

    public Pager<T> setPageNum(int pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    public int getPageSize() {
        return pageSize;
    }

    public Pager<T> setPageSize(int pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    public int getPages() {
        return pages;
    }

    public Pager<T> setPages(int pages) {
        this.pages = pages;
        return this;
    }

    public long getTotal() {
        return total;
    }

    public Pager<T> setTotal(long total) {
        this.total = total;
        return this;
    }

    public List<T> getRows() {
        return rows;
    }

    public Pager<T> setRows(List<T> rows) {
        this.rows = rows;
        return this;
    }
}
