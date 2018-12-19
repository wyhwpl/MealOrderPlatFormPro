package com.meal.controller;

import com.meal.pojo.AdminNews;
import com.meal.service.AdminNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/*
@author 汪培林

@create 2018-11-10-12:59
*/
@Controller
public class AdminNewsController {

    @Autowired
    private AdminNewsService adminNewsService;

    @RequestMapping(value = "/news")
    @ResponseBody
    public List<AdminNews> getAdminNews(){

        return adminNewsService.getAdminNews();
    }
}
