package com.meal.controller;

import com.github.pagehelper.PageInfo;
import com.meal.service.FoodInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/*
@author 汪培林

@create 2018-11-01-18:02
*/
@Controller
@RequestMapping(value = "/foodInfo")
public class FoodInfoController {

    @Autowired
    private FoodInfoService foodInfoService;

    @RequestMapping(value = "/all/{type}")
    @ResponseBody
    public PageInfo getFoodInfo(@PathVariable int type,
                                @RequestParam("pageNum")int pageNum,
                                @RequestParam("pageSize")int pageSize){
        return foodInfoService.getFoodInfoByType(type, pageNum, pageSize);
    }
}
