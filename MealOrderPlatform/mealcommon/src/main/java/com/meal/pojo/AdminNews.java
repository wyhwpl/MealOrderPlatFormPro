package com.meal.pojo;

import java.util.Date;

public class AdminNews {
    private Integer id;

    private Integer userkind;

    private Integer userid;

    private String username;

    private String action;

    private String actionobject;

    private Date newstime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserkind() {
        return userkind;
    }

    public void setUserkind(Integer userkind) {
        this.userkind = userkind;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
    }

    public String getActionobject() {
        return actionobject;
    }

    public void setActionobject(String actionobject) {
        this.actionobject = actionobject == null ? null : actionobject.trim();
    }

    public Date getNewstime() {
        return newstime;
    }

    public void setNewstime(Date newstime) {
        this.newstime = newstime;
    }
}