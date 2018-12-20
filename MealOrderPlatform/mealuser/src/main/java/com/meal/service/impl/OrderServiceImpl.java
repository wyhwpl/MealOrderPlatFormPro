package com.meal.service.impl;

import com.meal.mapper.OrderFoodMapper;
import com.meal.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
@author 汪培林

@create 2018-12-20-13:42
*/
@Service
public class OrderServiceImpl {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private OrderFoodMapper orderFoodMapper;


}
