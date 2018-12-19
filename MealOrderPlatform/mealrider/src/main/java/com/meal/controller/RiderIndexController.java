package com.meal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
@author 汪培林

@create 2018-12-15-18:22
*/
@Controller
public class RiderIndexController {

    @RequestMapping(value = "/")
    public String riderIndex(){
        return "rider_index";
    }
}
