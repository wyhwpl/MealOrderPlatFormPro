package com.meal.controller;

import com.meal.pojo.OrderFood;
import com.meal.service.OrderFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/*
@author 汪培林

@create 2018-12-03-16:58
*/
@Controller
@RequestMapping(value = "/orderFood")
public class OrderFoodController {

    @Autowired
    private OrderFoodService orderFoodService;

    @RequestMapping(value = "/getAll/{orderId}")
    @ResponseBody
    public List<OrderFood> getAll(@PathVariable String orderId){
        return orderFoodService.getOrderFood(orderId);
    }
}
