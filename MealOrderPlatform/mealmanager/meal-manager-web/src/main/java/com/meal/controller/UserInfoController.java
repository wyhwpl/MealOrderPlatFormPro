package com.meal.controller;

import com.meal.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
@author 汪培林

@create 2018-12-01-18:08
*/
@Controller
@RequestMapping(value = "/userInfo")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping(value = "/getSum")
    @ResponseBody
    public int getTotal(){
        return userInfoService.getTotal();
    }

}
