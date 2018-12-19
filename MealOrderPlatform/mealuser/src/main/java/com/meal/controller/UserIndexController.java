package com.meal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
@author 汪培林

@create 2018-12-15-18:26
*/
@Controller
public class UserIndexController {

    @RequestMapping(value = "/")
    public String userIndex(){
        return "user_index";
    }
}
