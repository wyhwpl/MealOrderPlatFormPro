package com.meal.service.impl;

import com.meal.mapper.OrderCancelMapper;
import com.meal.mapper.OrderMapper;
import com.meal.pojo.Order;
import com.meal.pojo.OrderCancel;
import com.meal.pojo.OrderExample;
import com.meal.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/*
@author 汪培林

@create 2018-12-13-15:55
*/
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private OrderCancelMapper orderCancelMapper;


    public List<Order> getAllOrder(String riderId) {
        OrderExample example=new OrderExample();
        OrderExample.Criteria criteria=example.createCriteria();
        criteria.andRideridEqualTo(riderId);
        List<Order> orders=orderMapper.selectByExample(example);
        if(orders==null||orders.isEmpty()){
            return null;
        }
        return orders;
    }

    public List<Order> getDoneOrder(String riderId) {
        OrderExample example=new OrderExample();
        OrderExample.Criteria criteria=example.createCriteria();
        criteria.andRideridEqualTo(riderId);
        List<Integer> status=new ArrayList<Integer>();
        status.add(4);
        status.add(5);
        status.add(6);
        criteria.andStatusIn(status);
        List<Order> orders=orderMapper.selectByExample(example);
        if(orders==null||orders.isEmpty()){
            return null;
        }
        return orders;
    }

    public List<Order> getDoingOrder(String riderId) {
        OrderExample example=new OrderExample();
        OrderExample.Criteria criteria=example.createCriteria();
        criteria.andRideridEqualTo(riderId);
        criteria.andStatusEqualTo(3);
        List<Order> orders=orderMapper.selectByExample(example);
        if(orders==null||orders.isEmpty()){
            return null;
        }
        return orders;
    }

    public List<Order> getToDoOrder(String riderId) {
        OrderExample example=new OrderExample();
        OrderExample.Criteria criteria=example.createCriteria();
        criteria.andStatusEqualTo(2);
        criteria.andRideridEqualTo(riderId);
        List<Order> orders=orderMapper.selectByExample(example);
        if(orders==null||orders.isEmpty()){
            return null;
        }
        return orders;
    }

    public int cancelOrConfirmOrder(String orderId, boolean flag) {

        Order order=orderMapper.selectByPrimaryKey(orderId);
        if(order==null){
            return 0;
        }
        if(flag){
            order.setStatus(3);

        }
        else{
            order.setStatus(2);
            order.setRiderid(null);
            order.setRiderphone(null);
            OrderCancel cancel=new OrderCancel();
            cancel.setOrderid(orderId);
            cancel.setRiderid(order.getRiderid());
            orderCancelMapper.insert(cancel);
        }

        int result=orderMapper.updateByPrimaryKey(order);
        return result;
    }
}
