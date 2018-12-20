package com.meal.service.impl;

import com.meal.mapper.OrderFoodMapper;
import com.meal.pojo.OrderFood;
import com.meal.pojo.OrderFoodExample;
import com.meal.service.OrderFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
@author 汪培林

@create 2018-12-14-15:12
*/
@Service
public class OrderFoodServiceImpl implements OrderFoodService {

    @Autowired
    private OrderFoodMapper orderFoodMapper;


    public List<OrderFood> getOrderFood(int orderId) {
        OrderFoodExample example=new OrderFoodExample();
        OrderFoodExample.Criteria criteria=example.createCriteria();
        criteria.andOrderidEqualTo(orderId);
        List<OrderFood> orderFoods=orderFoodMapper.selectByExample(example);
        if(orderFoods.isEmpty()||orderFoods==null){
            return null;
        }
        return orderFoods;
    }
}