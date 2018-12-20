package com.meal.controller;

import com.meal.commons.CheckResult;
import com.meal.pojo.User;
import com.meal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*
@author 汪培林

@create 2018-12-15-15:12
*/
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String loginForm(){
        return "login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public CheckResult loginHandler(HttpServletRequest request,
                                    HttpServletResponse response,
                                    @RequestParam("phone")String phone,
                                    @RequestParam("password")String password){
        User user=new User();
        user.setPhone(phone);
        user.setPassword(password);
        return userService.loginCheck(request,response,user);
    }

    @RequestMapping(value = "/logOff")
    @ResponseBody
    public int logOff(@RequestParam("userId")String userId){
        return userService.logOff(userId);
    }

    @RequestMapping(value = "/logout")
    public String logout(HttpSession session){
        session.removeAttribute("user");
        session.invalidate();
        return "login";
    }

}
