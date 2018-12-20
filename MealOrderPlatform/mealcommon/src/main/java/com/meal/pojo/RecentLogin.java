package com.meal.pojo;

import java.util.Date;

public class RecentLogin {
    private String id;

    private Integer userkind;

    private String userid;

    private String ip;

    private Date logintime;

    private Date loginouttime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getUserkind() {
        return userkind;
    }

    public void setUserkind(Integer userkind) {
        this.userkind = userkind;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    public Date getLoginouttime() {
        return loginouttime;
    }

    public void setLoginouttime(Date loginouttime) {
        this.loginouttime = loginouttime;
    }
}