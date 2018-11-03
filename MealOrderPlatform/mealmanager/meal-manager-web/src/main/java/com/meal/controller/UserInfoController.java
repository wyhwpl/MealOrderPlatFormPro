package com.meal.controller;

/*
@author 汪培林

@create 2018-10-30-18:56
*/

import com.github.pagehelper.PageInfo;
import com.meal.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/userInfo")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping(value = "/all")
    @ResponseBody
    public PageInfo getAllUserInfo(@RequestParam("pageNum")int pageNum,
                                   @RequestParam("pageSize")int pageSize){

        return userInfoService.getALLUserInfo(pageNum, pageSize);
    }
}
