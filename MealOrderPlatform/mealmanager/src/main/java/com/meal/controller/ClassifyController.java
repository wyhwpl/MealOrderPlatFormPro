package com.meal.controller;

import com.meal.pojo.Classify;
import com.meal.service.ClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
@author 汪培林

@create 2018-11-27-18:49
*/
@Controller
@RequestMapping(value = "/tag")
public class ClassifyController {

    @Autowired
    private ClassifyService classifyService;

    @RequestMapping(value = "/byId/{id}")
    @ResponseBody
    public Classify getTagById(@PathVariable String id){
        return classifyService.getClassifyById(id);
    }

}
