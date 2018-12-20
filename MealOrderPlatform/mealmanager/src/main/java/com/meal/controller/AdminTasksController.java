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

    @RequestMapping(value = "/all/{adminId}")
    @ResponseBody
    public List<AdminTasks> getAllTask(@PathVariable String adminId){
        return adminTasksService.getAllTasks(adminId);
    }

    @RequestMapping(value = "/some/{adminId}")
    @ResponseBody
    public List<AdminTasks> getSomeTask(@PathVariable String adminId,
                                        @RequestParam("num")int num){
        return adminTasksService.getSomeTasks(num,adminId);
    }

    @RequestMapping(value = "/byexample/{type}")
    @ResponseBody
    public List<AdminTasks> getTaskByExample(@PathVariable int type,
                                             @RequestParam("adminId")String adminId){
        return adminTasksService.getTasksByExample(type,adminId);
    }

    @RequestMapping(value = "/done/{id}")
    @ResponseBody
    public int done(@PathVariable String id){
        return adminTasksService.updateTaskStatusById(id);
    }

    @RequestMapping(value = "/getSum")
    @ResponseBody
    public int getTotal(@RequestParam("status") int status){
        return adminTasksService.getTotal(status);
    }

    @RequestMapping(value = "/getAdminTask/{adminId}")
    @ResponseBody
    public int getTotal(@PathVariable String adminId,
                        @RequestParam("status") int status){
        return adminTasksService.getAdminTask(status,adminId);
    }

}
