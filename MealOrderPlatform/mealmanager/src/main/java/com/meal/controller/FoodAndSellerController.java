package com.meal.controller;

import com.meal.pojo.FoodAndSeller;
import com.meal.service.FoodAndSellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
@author 汪培林

@create 2018-11-30-14:17
*/
@Controller
@RequestMapping(value = "/foodandsellerInfo")
public class FoodAndSellerController {

    @Autowired
    private FoodAndSellerService foodAndSellerService;

    @RequestMapping(value = "byId/{id}")
    @ResponseBody
    public FoodAndSeller getFoodAndSellerById(@PathVariable String id){
        return foodAndSellerService.getFoodAndSellerById(id);
    }

}
