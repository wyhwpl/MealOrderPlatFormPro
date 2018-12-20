package com.meal.service.impl;

import com.meal.mapper.OrderMapper;
import com.meal.mapper.RiderMapper;
import com.meal.mapper.SellerMapper;
import com.meal.pojo.*;
import com.meal.service.OrderService;
import com.meal.util.CalculRider;
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

    @Autowired
    private RiderMapper riderMapper;

    @Autowired
    private SellerMapper sellerMapper;


    public List<Order> getAllOrder(String sellerId) {

        OrderExample example=new OrderExample();
        OrderExample.Criteria criteria=example.createCriteria();
        criteria.andSelleridEqualTo(sellerId);
        List<Order> orders=orderMapper.selectByExample(example);
        if(orders==null||orders.isEmpty()){
            return null;
        }
        return orders;
    }

    public List<Order> getOrderByExample(String sellerId, String param, int type) {
        OrderExample example=new OrderExample();
        OrderExample.Criteria criteria=example.createCriteria();
        criteria.andSelleridEqualTo(sellerId);

        //type=1、2代表订单Id、订单状态
        if(type==1){
            criteria.andIdEqualTo(param);
        }
        if(type==2){
            criteria.andStatusEqualTo(Integer.parseInt(param));
        }

        List<Order> orders=orderMapper.selectByExample(example);
        if(orders==null||orders.isEmpty()){
            return null;
        }
        return orders;
    }


    public int modifyOrderByExample(String orderId, String param, int type) {

        Order order=orderMapper.selectByPrimaryKey(orderId);

        //type=1 代表状态
        if(type==1){
            order.setStatus(Integer.parseInt(param));
        }


        return orderMapper.updateByPrimaryKey(order);
    }

    public int confirmOrder(String orderId, String sellerId) {

        RiderExample riderExample=new RiderExample();
        RiderExample.Criteria criteria=riderExample.createCriteria();
        criteria.andStatusEqualTo(1);
        List<Rider> riders=riderMapper.selectByExample(riderExample);
        String riderId= CalculRider.calculRider(riders);
        Rider rider=riderMapper.selectByPrimaryKey(riderId);
        Seller seller=sellerMapper.selectByPrimaryKey(sellerId);
        Order order=orderMapper.selectByPrimaryKey(orderId);
        order.setSellerid(sellerId);
        order.setSellername(seller.getSellername());
        order.setSellerphone(seller.getPhone());
        order.setRiderid(riderId);
        order.setRiderphone(rider.getPhone());
        return orderMapper.updateByPrimaryKey(order);
    }
}
