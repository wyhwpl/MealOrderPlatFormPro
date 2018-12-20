package com.meal.service;

import com.meal.pojo.Order;

import java.util.List;

/*
@author 汪培林

@create 2018-12-03-14:17
*/
public interface OrderService {

    List<Order> getAllOrder(String sellerId);

    List<Order> getOrderByExample(String sellerId,String param,int type);

    int modifyOrderByExample(String orderId,String param,int type);

    int confirmOrder(String orderId,String sellerId);

}
