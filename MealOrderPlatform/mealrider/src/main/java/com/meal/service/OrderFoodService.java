package com.meal.service;

import com.meal.pojo.OrderFood;

import java.util.List;

/*
@author 汪培林

@create 2018-12-14-15:11
*/
public interface OrderFoodService {

    List<OrderFood> getOrderFood(String orderId);
}
