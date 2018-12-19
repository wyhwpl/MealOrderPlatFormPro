package com.meal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
@author 汪培林

@create 2018-12-15-18:13
*/
@Controller
public class PortalController {

    @RequestMapping(value = "/")
    public String index(){
        return "portal";
    }
}
