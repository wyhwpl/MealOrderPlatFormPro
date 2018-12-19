package com.meal.controller;

import com.meal.commons.CheckResult;
import com.meal.pojo.Rider;
import com.meal.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/*
@author 汪培林

@create 2018-12-14-15:52
*/
@Controller
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public String registerForm(){
        return "register";
    }


    @RequestMapping(value = "/check/{param}/{type}")
    @ResponseBody
    public CheckResult checkData(@PathVariable String param,
                                 @PathVariable int type){
        return registerService.checkData(param, type);
    }
    @RequestMapping(value = "/register",method = RequestMethod.POST)
    @ResponseBody
    public CheckResult registerHandler(@RequestParam("phone")String phone,
                                       @RequestParam("userName")String userName,
                                       @RequestParam("password")String password){
        Rider rider=new Rider();
        rider.setPhone(phone);
        rider.setUsername(userName);
        rider.setPassword(password);
        return registerService.register(rider);
    }
}
