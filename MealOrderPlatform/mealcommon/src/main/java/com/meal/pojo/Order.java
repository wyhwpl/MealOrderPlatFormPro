package com.meal.pojo;

import java.util.Date;

public class Order {
    private Integer id;

    private Integer userid;

    private Integer sellerid;

    private Integer riderid;

    private Float totalPrice;

    private Float sellersorce;

    private Float ridersorce;

    private Integer status;

    private Float price;

    private Float foodscore;

    private Date ordertime;

    private Date paytime;

    private Date taketime;

    private Date arrivetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getSellerid() {
        return sellerid;
    }

    public void setSellerid(Integer sellerid) {
        this.sellerid = sellerid;
    }

    public Integer getRiderid() {
        return riderid;
    }

    public void setRiderid(Integer riderid) {
        this.riderid = riderid;
    }

    public Float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Float getSellersorce() {
        return sellersorce;
    }

    public void setSellersorce(Float sellersorce) {
        this.sellersorce = sellersorce;
    }

    public Float getRidersorce() {
        return ridersorce;
    }

    public void setRidersorce(Float ridersorce) {
        this.ridersorce = ridersorce;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getFoodscore() {
        return foodscore;
    }

    public void setFoodscore(Float foodscore) {
        this.foodscore = foodscore;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public Date getPaytime() {
        return paytime;
    }

    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }

    public Date getTaketime() {
        return taketime;
    }

    public void setTaketime(Date taketime) {
        this.taketime = taketime;
    }

    public Date getArrivetime() {
        return arrivetime;
    }

    public void setArrivetime(Date arrivetime) {
        this.arrivetime = arrivetime;
    }
}