package com.meal.controller;

import com.meal.pojo.Classify;
import com.meal.service.ClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
@author 汪培林

@create 2018-12-03-16:30
*/
@Controller
@RequestMapping(value = "/tag")
public class ClassifyController {

    @Autowired
    private ClassifyService classifyService;

    @RequestMapping(value = "/getAll/{sellerId}")
    @ResponseBody
    public List<Classify> getAllClassify(@PathVariable String sellerId){
        return classifyService.getAllClassify(sellerId);
    }

    @RequestMapping(value = "/getById/{id}")
    @ResponseBody
    public Classify getById(@PathVariable String id){
        return classifyService.getClassifyById(id);
    }

    @RequestMapping(value = "/add/{sellerId}")
    @ResponseBody
    public int addClassify(@PathVariable String sellerId, @RequestBody Classify classify){
        return classifyService.addTag(classify, sellerId);
    }

    @RequestMapping(value = "/modifyById/{id}")
    @ResponseBody
    public int modifyClassify(@PathVariable String id,
                              @RequestParam("tagName") String tagName){
        return classifyService.modifyTag(id, tagName);
    }

}
