package com.meal.controller;

import com.github.pagehelper.PageInfo;
import com.meal.pojo.Rider;
import com.meal.service.RiderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/*
@author 汪培林

@create 2018-11-01-17:52
*/
@Controller
@RequestMapping(value = "/riderInfo")
public class RiderInfoController {

    @Autowired
    private RiderInfoService riderInfoService;

    @RequestMapping(value = "/all/{type}")
    @ResponseBody
    public PageInfo getRiderInfo(@PathVariable int type,
                                 @RequestParam("pageNum")int pageNum,
                                 @RequestParam("pageSize")int pageSize){
        return riderInfoService.getRiderInfoByType(type, pageNum, pageSize);
    }

    @RequestMapping(value = "/byId/{id}")
    @ResponseBody
    public Rider getRiderById(@PathVariable int id){
        return riderInfoService.getRiderById(id);
    }

}
