package com.meal.controller;

import com.meal.pojo.Order;
import com.meal.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/*
@author 汪培林

@create 2018-12-03-16:45
*/
@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/getAll/{sellerId}")
    @ResponseBody
    public List<Order> getAll(@PathVariable int sellerId){
        return orderService.getAllOrder(sellerId);
    }

    @RequestMapping(value = "/getByExample/{sellerId}/{param}/{type}")
    @ResponseBody
    public List<Order> getByExample(@PathVariable int sellerId,
                                    @PathVariable int param,
                                    @PathVariable int type){
        return orderService.getOrderByExample(sellerId, param, type);
    }

    @RequestMapping(value = "/modifyByExample/{orderId}/{param}/{type}")
    @ResponseBody
    public int modifyByExample(@PathVariable int orderId,
                               @PathVariable String param,
                               @PathVariable int type){
        return orderService.modifyOrderByExample(orderId, param, type);
    }
}
