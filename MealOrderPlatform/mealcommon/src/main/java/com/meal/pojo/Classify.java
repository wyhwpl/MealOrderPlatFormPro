package com.meal.pojo;

public class Classify {
    private Integer id;

    private String classifytag;

    private Integer sellerid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassifytag() {
        return classifytag;
    }

    public void setClassifytag(String classifytag) {
        this.classifytag = classifytag == null ? null : classifytag.trim();
    }

    public Integer getSellerid() {
        return sellerid;
    }

    public void setSellerid(Integer sellerid) {
        this.sellerid = sellerid;
    }
}