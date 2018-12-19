package com.meal.service.impl;

import com.meal.mapper.OrderMapper;
import com.meal.pojo.Order;
import com.meal.pojo.OrderExample;
import com.meal.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
@author 汪培林

@create 2018-12-03-14:53
*/
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;


    public List<Order> getAllOrder(int sellerId) {

        OrderExample example=new OrderExample();
        OrderExample.Criteria criteria=example.createCriteria();
        criteria.andSelleridEqualTo(sellerId);
        List<Order> orders=orderMapper.selectByExample(example);
        if(orders==null||orders.isEmpty()){
            return null;
        }
        return orders;
    }

    public List<Order> getOrderByExample(int sellerId, int param, int type) {
        OrderExample example=new OrderExample();
        OrderExample.Criteria criteria=example.createCriteria();
        criteria.andSelleridEqualTo(sellerId);

        //type=1、2代表订单Id、订单状态
        if(type==1){
            criteria.andIdEqualTo(param);
        }
        if(type==2){
            criteria.andStatusEqualTo(param);
        }

        List<Order> orders=orderMapper.selectByExample(example);
        if(orders==null||orders.isEmpty()){
            return null;
        }
        return orders;
    }


    public int modifyOrderByExample(int orderId, String param, int type) {

        Order order=orderMapper.selectByPrimaryKey(orderId);

        //type=1 代表状态
        if(type==1){
            order.setStatus(Integer.parseInt(param));
        }


        return orderMapper.updateByPrimaryKey(order);
    }
}
