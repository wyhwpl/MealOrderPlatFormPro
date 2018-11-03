package com.meal.controller;

import com.meal.service.LoginService;
import com.meal.service.impl.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/*
@author 汪培林

@create 2018-10-20-19:45
*/
@Controller
public class LoginController {

    @Autowired
    public LoginService loginService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@RequestParam("loginID")String loginID,
                        @RequestParam("password")String password,
                        Model model){
        if(loginService.login(loginID,password)){
            model.addAttribute("message","登录成功");
        }else{
            model.addAttribute("message","登录失败");
        }
        return "index";
    }
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String loginGet(){
        return "mylogin";
    }

}
