package com.meal.pojo;

import java.util.Date;

public class Order {
    private Integer id;

    private Integer userid;

    private String username;

    private String address;

    private String phone;

    private Integer sellerid;

    private String sellername;

    private String sellerphone;

    private Integer riderid;

    private String riderphone;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getSellerid() {
        return sellerid;
    }

    public void setSellerid(Integer sellerid) {
        this.sellerid = sellerid;
    }

    public String getSellername() {
        return sellername;
    }

    public void setSellername(String sellername) {
        this.sellername = sellername == null ? null : sellername.trim();
    }

    public String getSellerphone() {
        return sellerphone;
    }

    public void setSellerphone(String sellerphone) {
        this.sellerphone = sellerphone == null ? null : sellerphone.trim();
    }

    public Integer getRiderid() {
        return riderid;
    }

    public void setRiderid(Integer riderid) {
        this.riderid = riderid;
    }

    public String getRiderphone() {
        return riderphone;
    }

    public void setRiderphone(String riderphone) {
        this.riderphone = riderphone == null ? null : riderphone.trim();
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