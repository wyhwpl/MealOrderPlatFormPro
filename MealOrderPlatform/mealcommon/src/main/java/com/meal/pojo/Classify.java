package com.meal.pojo;

public class Classify {
    private String id;

    private String classifytag;

    private String sellerid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getClassifytag() {
        return classifytag;
    }

    public void setClassifytag(String classifytag) {
        this.classifytag = classifytag == null ? null : classifytag.trim();
    }

    public String getSellerid() {
        return sellerid;
    }

    public void setSellerid(String sellerid) {
        this.sellerid = sellerid == null ? null : sellerid.trim();
    }
}