package com.meal.controller;

import com.meal.pojo.AdminTasks;
import com.meal.service.AdminTasksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/*
@author 汪培林

@create 2018-11-11-20:02
*/
@Controller
@RequestMapping(value = "/task")
public class AdminTasksController {

    @Autowired
    private AdminTasksService adminTasksService;

    @RequestMapping(value = "/all")
    @ResponseBody
    public List<AdminTasks> getAllTask(){
        return adminTasksService.getAllTasks();
    }

    @RequestMapping(value = "/some")
    @ResponseBody
    public List<AdminTasks> getSomeTask(@RequestParam("num")int num){
        return adminTasksService.getSomeTasks(num);
    }

    @RequestMapping(value = "/byexample/{type}")
    @ResponseBody
    public List<AdminTasks> getTaskByExample(@PathVariable int type){
        return adminTasksService.getTasksByExample(type);
    }

}
