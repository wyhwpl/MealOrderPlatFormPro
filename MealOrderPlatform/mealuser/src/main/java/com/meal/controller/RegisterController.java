package com.meal.controller;

import com.meal.commons.CheckResult;
import com.meal.pojo.User;
import com.meal.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/*
@author 汪培林

@create 2018-12-20-16:00
*/
@Controller
@RequestMapping(value = "/reg")
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    @RequestMapping(value = "/check/{param}/{type}")
    @ResponseBody
    public CheckResult checkData(@PathVariable String param,
                                 @PathVariable int type){
        return registerService.checkData(param, type);
    }

    @RequestMapping(value = "/page",method = RequestMethod.GET)
    public String getPage(){
        return "register";
    }

    @RequestMapping(value = "/handler",method = RequestMethod.POST)
    @ResponseBody
    public CheckResult handler(@RequestParam("phone")String phone,
                               @RequestParam("password")String password){

        User user=new User();
        user.setPhone(phone);
        user.setPassword(password);
        return registerService.registerHandler(user);
    }
}
