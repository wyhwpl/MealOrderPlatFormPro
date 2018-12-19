package com.meal.controller;

/*
@author 汪培林

@create 2018-10-20-22:08
*/

import com.meal.commons.CheckResult;
import com.meal.pojo.Admin;
import com.meal.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/register")
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    @RequestMapping(value = "/check/{param}/{type}")
    @ResponseBody
    public CheckResult registerCheck(@PathVariable String param,
                                     @PathVariable Integer type){
        CheckResult checkResult=registerService.checkData(param,type);

        return checkResult;
    }
    @RequestMapping(value = "/page",method = RequestMethod.GET)
    public String registerForm(){

        return "register";
    }
    @RequestMapping(value = "/submit",method = RequestMethod.POST)
    @ResponseBody
    public CheckResult register(@RequestBody Admin admin){

        return registerService.register(admin);
    }

}
