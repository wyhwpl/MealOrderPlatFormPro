package com.meal.controller;

import com.meal.service.OrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/*
@author 汪培林

@create 2018-12-01-18:10
*/
@Controller
@RequestMapping(value = "/orderInfo")
public class OrderInfoController {

    @Autowired
    private OrderInfoService orderInfoService;

    @RequestMapping(value = "/getSum")
    @ResponseBody
    public int getTotal(@RequestParam("status") int status){
        return orderInfoService.getTotal(status);
    }

}
