package com.meal.service;

import com.meal.pojo.Order;

import java.util.List;

/*
@author 汪培林

@create 2018-12-13-15:21
*/
public interface OrderService {

    List<Order> getAllOrder(int riderId);

    List<Order> getDoneOrder(int riderId);

    List<Order> getDoingOrder(int riderId);

    List<Order> getToDoOrder(int riderId);

    int cancelOrConfirmOrder(int orderId,boolean flag);
}
