package com.meal.controller;

import com.meal.pojo.OrderFood;
import com.meal.service.OrderFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/*
@author 汪培林

@create 2018-12-14-16:11
*/
@Controller
@RequestMapping(value = "/orderFood")
public class OrderFoodController {

    @Autowired
    private OrderFoodService orderFoodService;

    @RequestMapping(value = "/getOrderFood")
    @ResponseBody
    public List<OrderFood> getOrderFood(@RequestParam("orderId")int orderId){
        return orderFoodService.getOrderFood(orderId);
    }
}
