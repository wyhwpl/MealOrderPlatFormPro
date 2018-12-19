package com.meal.service;

import com.meal.pojo.Order;

import java.util.List;

/*
@author 汪培林

@create 2018-12-03-14:17
*/
public interface OrderService {

    List<Order> getAllOrder(int sellerId);

    List<Order> getOrderByExample(int sellerId,int param,int type);

    int modifyOrderByExample(int orderId,String param,int type);

}
