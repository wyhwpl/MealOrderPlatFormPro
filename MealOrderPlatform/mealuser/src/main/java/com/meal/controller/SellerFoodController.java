package com.meal.controller;

import com.meal.commons.SellerFood;
import com.meal.service.SellerFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/*
@author 汪培林

@create 2018-12-19-14:39
*/
@Controller
@RequestMapping(value = "/sellerFood")
public class SellerFoodController {

    @Autowired
    private SellerFoodService sellerFoodService;

    @RequestMapping(value = "/getSellerFood")
    @ResponseBody
    public SellerFood getSellerFood(@RequestParam("sellerId")int sellerId){
        return sellerFoodService.getSellerFood(sellerId);
    }
}
