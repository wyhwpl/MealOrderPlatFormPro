package com.meal.controller;

import com.meal.pojo.Seller;
import com.meal.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/*
@author 汪培林

@create 2018-12-19-15:01
*/
@Controller
@RequestMapping(value = "/seller")
public class SellerController {
    @Autowired
    private SellerService sellerService;

    @RequestMapping(value = "/getById")
    @ResponseBody
    public Seller getSellerById(@RequestParam("sellerId") String sellerId){
        return sellerService.getSellerById(sellerId);
    }

    @RequestMapping(value = "/getByExample")
    @ResponseBody
    public List<Seller> getByExample(@RequestParam("address")String address){
        return sellerService.getSellerByExample(address);
    }
}
