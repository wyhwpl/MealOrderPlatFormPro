package com.meal.controller;

import com.meal.commons.CheckResult;
import com.meal.pojo.Admin;
import com.meal.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*
@author 汪培林

@create 2018-10-20-19:45
*/
@Controller
public class LoginController {

    @Autowired
    public LoginService loginService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public CheckResult login(@RequestBody Admin admin, HttpServletRequest request, HttpServletResponse response){
        return loginService.loginCheck(request,response,admin);
    }
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String loginGet(){
        return "login";
    }

    @RequestMapping(value = "/logout")
    public String logout(HttpSession session, HttpServletRequest request){

        session.removeAttribute("admin");
        session.invalidate();
        Cookie[] cookies=request.getCookies();
        for (int i = 0; i <cookies.length ; i++) {
            cookies[i].setMaxAge(0);
        }
        return "login";
    }

}
