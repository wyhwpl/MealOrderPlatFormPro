package com.meal.service.impl;

import com.github.pagehelper.PageHelper;
import com.meal.mapper.AdminTasksMapper;
import com.meal.pojo.AdminTasks;
import com.meal.pojo.AdminTasksExample;
import com.meal.service.AdminTasksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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
    public List<AdminTasks> getAllTasks(String adminId) {
        AdminTasksExample example=new AdminTasksExample();
        AdminTasksExample.Criteria criteria=example.createCriteria();
        criteria.andAdminidEqualTo(adminId);
        List<AdminTasks> tasks=adminTasksMapper.selectByExample(example);
        if(tasks==null||tasks.isEmpty()) return null;

        return tasks;
    }

    //返回指定个数任务
    public List<AdminTasks> getSomeTasks(int num,String adminId) {
        PageHelper.startPage(1,num);
        AdminTasksExample example=new AdminTasksExample();
        AdminTasksExample.Criteria criteria=example.createCriteria();
        criteria.andAdminidEqualTo(adminId);
        List<AdminTasks> tasks=adminTasksMapper.selectByExample(example);
        if(tasks==null||tasks.isEmpty()) return null;
        return tasks;
    }

    //通过条件返回任务
    public List<AdminTasks> getTasksByExample(int type,String adminId) {

        AdminTasksExample example=new AdminTasksExample();
        AdminTasksExample.Criteria criteria=example.createCriteria();
        criteria.andAdminidEqualTo(adminId);
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

    public int updateTaskStatusById(String id) {

        AdminTasks tasks=adminTasksMapper.selectByPrimaryKey(id);
        if(tasks==null) return 0;
        tasks.setStatus(1);
        tasks.setDonetime(new Date());
        return adminTasksMapper.updateByPrimaryKey(tasks);

    }

    public int getTotal(int status) {
        AdminTasksExample example=new AdminTasksExample();
        AdminTasksExample.Criteria criteria=example.createCriteria();
        criteria.andStatusEqualTo(status);

        return adminTasksMapper.countByExample(example);
    }

    public int getAdminTask(int status, String adminId) {
        AdminTasksExample example=new AdminTasksExample();
        AdminTasksExample.Criteria criteria=example.createCriteria();
        criteria.andStatusEqualTo(status);
        criteria.andAdminidEqualTo(adminId);

        return adminTasksMapper.countByExample(example);
    }
}
