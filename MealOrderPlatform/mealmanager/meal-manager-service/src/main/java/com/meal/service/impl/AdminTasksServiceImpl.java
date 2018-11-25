package com.meal.service.impl;

import com.github.pagehelper.PageHelper;
import com.meal.mapper.AdminTasksMapper;
import com.meal.pojo.Admin;
import com.meal.pojo.AdminTasks;
import com.meal.pojo.AdminTasksExample;
import com.meal.service.AdminTasksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
@author 汪培林

@create 2018-11-11-18:39
*/
@Service
public class AdminTasksServiceImpl implements AdminTasksService {

    @Autowired
    private AdminTasksMapper adminTasksMapper;

    //返回全部任务
    public List<AdminTasks> getAllTasks() {
        AdminTasksExample example=new AdminTasksExample();
        List<AdminTasks> tasks=adminTasksMapper.selectByExample(example);
        if(tasks==null||tasks.isEmpty()) return null;

        return tasks;
    }

    //返回指定个数任务
    public List<AdminTasks> getSomeTasks(int num) {
        PageHelper.startPage(1,num);
        AdminTasksExample example=new AdminTasksExample();
        List<AdminTasks> tasks=adminTasksMapper.selectByExample(example);
        if(tasks==null||tasks.isEmpty()) return null;
        return tasks;
    }

    //通过条件返回任务
    public List<AdminTasks> getTasksByExample(int type) {

        AdminTasksExample example=new AdminTasksExample();
        AdminTasksExample.Criteria criteria=example.createCriteria();
        if(type==1){
            criteria.andStatusEqualTo(0);
        }
        if(type==2){
            criteria.andStatusEqualTo(1);
        }
        List<AdminTasks> tasks=adminTasksMapper.selectByExample(example);
        if(tasks==null||tasks.isEmpty())return null;
        return tasks;
    }
}
