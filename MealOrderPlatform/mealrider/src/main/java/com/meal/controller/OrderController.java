package com.meal.controller;

import com.meal.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/*
@author 汪培林

@create 2018-12-14-15:59
*/
@Controller
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/getAll")
    @ResponseBody
    public List<Order> getAll(@RequestParam("riderId")int riderId){
        return orderService.getAllOrder(riderId);
    }

    @RequestMapping(value = "/getDone")
    @ResponseBody
    public List<Order> getDone(@RequestParam("riderId")int riderId){
        return orderService.getDoneOrder(riderId);
    }

    @RequestMapping(value = "/getDoing")
    @ResponseBody
    public List<Order> getDoing(@RequestParam("riderId")int riderId){
        return orderService.getDoingOrder(riderId);
    }

    @RequestMapping(value = "/getToDo")
    @ResponseBody
    public List<Order> getToDo(@RequestParam("riderId")int riderId){
        return orderService.getToDoOrder(riderId);
    }

    @RequestMapping(value = "/modifyOrder/{flag}")
    @ResponseBody
    public int modifyOrder(@PathVariable boolean flag,
                           @RequestParam("orderId")int orderId){
        return orderService.cancelOrConfirmOrder(orderId, flag);
    }
}
