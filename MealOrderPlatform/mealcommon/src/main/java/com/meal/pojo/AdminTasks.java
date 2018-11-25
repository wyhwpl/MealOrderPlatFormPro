package com.meal.pojo;

import java.util.Date;

public class AdminTasks {
    private Integer id;

    private Integer taskkind;

    private Integer objectid;

    private String username;

    private Integer status;

    private Date tasktime;

    private Date donetime;

    private Integer adminid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTaskkind() {
        return taskkind;
    }

    public void setTaskkind(Integer taskkind) {
        this.taskkind = taskkind;
    }

    public Integer getObjectid() {
        return objectid;
    }

    public void setObjectid(Integer objectid) {
        this.objectid = objectid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getTasktime() {
        return tasktime;
    }

    public void setTasktime(Date tasktime) {
        this.tasktime = tasktime;
    }

    public Date getDonetime() {
        return donetime;
    }

    public void setDonetime(Date donetime) {
        this.donetime = donetime;
    }

    public Integer getAdminid() {
        return adminid;
    }

    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }
}