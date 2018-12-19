package com.meal.service.impl;

import com.meal.mapper.OrderMapper;
import com.meal.pojo.OrderExample;
import com.meal.service.OrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
@author 汪培林

@create 2018-12-01-18:02
*/
@Service
public class OrderInfoServiceImpl implements OrderInfoService {

    @Autowired
    private OrderMapper orderMapper;

    public int getTotal(int status) {

        OrderExample example=new OrderExample();
        OrderExample.Criteria criteria=example.createCriteria();
        criteria.andStatusEqualTo(status);
        return orderMapper.countByExample(example);
    }
}
