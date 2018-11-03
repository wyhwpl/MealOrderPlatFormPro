package com.meal.commons;


import java.util.List;

/*
@author 汪培林

@create 2018-10-31-13:35
*/
public class PageResult {

    private long total;
    private List<?> row;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<?> getRow() {
        return row;
    }

    public void setRow(List<?> row) {
        this.row = row;
    }
}
